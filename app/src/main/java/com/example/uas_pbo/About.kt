package com.example.showroommobile

import android.content.Intent
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



        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        bottomNav.selectedItemId = R.id.nav_about
        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    startActivity(Intent(this, com.example.uas_pbo.HomeActivity::class.java))
                    finish()
                    true
                }
                R.id.nav_about -> true
                R.id.nav_logout -> {
                    com.google.android.material.dialog.MaterialAlertDialogBuilder(this)
                        .setTitle("Konfirmasi Logout")
                        .setMessage("Apakah anda ingin keluar?")
                        .setPositiveButton("Keluar") { _, _ ->
                            startActivity(Intent(this, com.example.uas_pbo.LoginActivity::class.java))
                            finish()
                        }
                        .setNegativeButton("Batal") { dialog, _ ->
                            dialog.dismiss()
                            bottomNav.selectedItemId = R.id.nav_about
                        }
                        .show()
                    true
                }
                else -> false
            }
        }
    }
}