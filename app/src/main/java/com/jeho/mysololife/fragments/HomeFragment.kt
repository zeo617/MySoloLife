package com.jeho.mysololife.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.jeho.mysololife.R
import com.jeho.mysololife.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding : FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        binding.tipTap.setOnClickListener {

            it.findNavController().navigate(R.id.action_homeFragment2_to_tipFragment)

       }

        binding.talkTap.setOnClickListener {

            it.findNavController().navigate(R.id.action_homeFragment2_to_talkFragment)

        }

        binding.bookmarkTap.setOnClickListener {

            it.findNavController().navigate(R.id.action_homeFragment2_to_bookmarkFragment2)

        }

        binding.storeTap.setOnClickListener {

            it.findNavController().navigate(R.id.action_homeFragment2_to_storeFragment)

        }

        return binding.root
    }


}