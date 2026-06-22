package com.example.showroommobile

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.uas_pbo.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val menuButton = findViewById<ImageView>(R.id.ivMenuList)

        menuButton.setOnClickListener {
            Toast.makeText(
                this,
                "Profil | Pengaturan | Logout",
                Toast.LENGTH_SHORT
            ).show()
        }

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigation)

        bottomNav.setOnItemSelectedListener { item ->

            when (item.itemId) {

                R.id.nav_home -> {

                    true
                }

                R.id.nav_about -> {
                    true
                }

                else -> false
            }
        }
    }
}