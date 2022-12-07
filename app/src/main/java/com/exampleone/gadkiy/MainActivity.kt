package com.exampleone.gadkiy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import com.exampleone.gadkiy.databinding.ActivityMainBinding
import com.exampleone.gadkiy.presentation.tabs.Account
import com.exampleone.gadkiy.presentation.tabs.Card
import com.exampleone.gadkiy.presentation.tabs.Home
import com.exampleone.gadkiy.presentation.tabs.Pills

class MainActivity : AppCompatActivity() {


    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        launchHome()
        switchFragments()


    }

    private fun switchFragments() {
        binding.bottomMainMenu.setOnItemSelectedListener { item ->

            when (item.itemId) {
                R.id.homeBottomMainMenu -> supportFragmentManager.beginTransaction()
                    .replace(R.id.mainContent, Home()).commit()
                R.id.coffeeBottomMainMenu -> supportFragmentManager.beginTransaction()
                    .replace(R.id.mainContent, Pills()).commit()
                R.id.cardBottomMainMenu -> supportFragmentManager.beginTransaction()
                    .replace(R.id.mainContent, Card()).commit()
                R.id.accountBottomMainMenu -> supportFragmentManager.beginTransaction()
                    .replace(R.id.mainContent, Account()).commit()
            }

            return@setOnItemSelectedListener true
        }
    }

    private fun launchHome() {
        supportFragmentManager.beginTransaction().replace(R.id.mainContent, Home()).commit()
    }
}