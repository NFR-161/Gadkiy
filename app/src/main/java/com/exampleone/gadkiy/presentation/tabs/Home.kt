package com.exampleone.gadkiy.presentation.tabs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.exampleone.gadkiy.databinding.FragmentHomeBinding
import com.exampleone.gadkiy.presentation.intro.IntroAdapter
import com.google.android.material.tabs.TabLayoutMediator

class Home : Fragment() {

    private val binding by lazy {
       FragmentHomeBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding.slider.adapter = IntroAdapter(context as FragmentActivity)

        val tabLayoutMediator = TabLayoutMediator(
            binding.tabSlider,
            binding.slider
        ) { _, _ -> }
        tabLayoutMediator.attach()


        return binding.root
    }

}