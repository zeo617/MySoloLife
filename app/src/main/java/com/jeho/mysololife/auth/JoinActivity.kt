package com.jeho.mysololife.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.jeho.mysololife.R

class JoinActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join)

        auth = Firebase.auth

//        auth.createUserWithEmailAndPassword("abc@abc.com", "abcdabcd")
//            .addOnCompleteListener(this) { task ->
//                if (task.isSuccessful) {
//
//                    Toast.makeText(this, "성공", Toast.LENGTH_LONG).show()
//
//                } else {
//
//                    Toast.makeText(this, "실패", Toast.LENGTH_LONG).show()
//
//                }
//            }

    }
}