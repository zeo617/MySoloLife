package com.jeho.mysololife.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.jeho.mysololife.MainActivity
import com.jeho.mysololife.R
import com.jeho.mysololife.databinding.ActivityIntroBinding

class IntroActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    private lateinit var binding : ActivityIntroBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        auth = Firebase.auth

        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_intro)

        binding.loginBtn.setOnClickListener {

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

        }

        binding.joinBtn.setOnClickListener {

            val intent = Intent(this, JoinActivity::class.java)
            startActivity(intent)

        }

        binding.noAccountBtn.setOnClickListener {

            auth.signInAnonymously()
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {

                        Toast.makeText(this, "비회원으로 로그인 되었습니다", Toast.LENGTH_LONG).show()

                        val intent = Intent(this, MainActivity::class.java)
                        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                        startActivity(intent)

                    } else {

                        Toast.makeText(this, "비회원 로그인을 다시 진행해주세요", Toast.LENGTH_LONG).show()

                    }
                }


        }

    }
}