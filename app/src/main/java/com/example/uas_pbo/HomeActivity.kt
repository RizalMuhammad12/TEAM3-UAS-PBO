package com.example.uas_pbo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // ==========================================
        //  BAGIAN 1: PENGATURAN KLIK TOMBOL 1-10
        // ==========================================

        // 1. FORTUNER
        findViewById<Button>(R.id.btn_detail_fortuner).setOnClickListener {
            pindahKeDetail(
                "Fortuner", "2021", "83.193 KM",
                "2.8-Liter Inline 4 DOHC 16V Twin Turbo 1GD-FTV", "Matic 6 Speed",
                "Rp600.000.000", android.R.drawable.ic_menu_camera,
                "Fortuner GR Sport yang telah dimodifikasi untuk meningkatkan performa dan tampilan. Menggunakan ECU Remap Stage 3, tambahan twin turbo, velg Lenso aftermarket, dan full system side exit exhaust yang menghasilkan tenaga lebih besar serta suara yang lebih agresif. Interior terawat, kaki-kaki dalam kondisi prima, dan seluruh modifikasi dilakukan secara profesional sehingga tetap nyaman digunakan untuk harian maupun perjalanan jauh."
            )
        }

        // 2. GT86
        findViewById<Button>(R.id.btn_detail_gt86).setOnClickListener {
            pindahKeDetail(
                "GT86", "2017", "30.251 KM",
                "3.0-Liter Inline 6 DOHC 24V Twin Turbo 2JZ-GTE", "Matic 8 Speed",
                "Rp1.000.000.000", android.R.drawable.ic_menu_camera,
                "Toyota GT86 yang telah mendapatkan swap engine 2JZ-GTE full stage sehingga menghasilkan performa yang jauh di atas spesifikasi standar. Menggunakan bodykit Karma V1 untuk memberikan tampilan yang lebih agresif dan sporty. Sistem pendukung mesin telah disesuaikan untuk menunjang tenaga besar, menjadikannya mobil yang cocok untuk penggemar performa maupun kolektor mobil modifikasi berkualitas."
            )
        }

        // 3. URUS
        findViewById<Button>(R.id.btn_detail_urus).setOnClickListener {
            pindahKeDetail(
                "Urus", "2025", "2.000 KM",
                "4.0-Liter V8 DOHC 32V Twin Turbo", "Matic 8 Speed",
                "Rp8.240.000.000", android.R.drawable.ic_menu_camera,
                "Lamborghini Urus Performance dengan kondisi nyaris baru dan odometer yang sangat rendah. Mesin masih original tanpa modifikasi performa sehingga keaslian kendaraan tetap terjaga. Mobil menggunakan velg aftermarket premium serta air suspension yang memberikan kenyamanan sekaligus tampilan yang lebih exclusif. Interior dan eksterior sangat terawat serta siap digunakan tanpa perlu perbaikan tambahan."
            )
        }

        // 4. AVENTADOR
        findViewById<Button>(R.id.btn_detail_aventador).setOnClickListener {
            pindahKeDetail(
                "Aventador SV", "2018", "240 KM",
                "6.5-Liter V12 DOHC 48V Naturally Aspirated", "Matic 7 Speed",
                "Rp17.000.000.000", android.R.drawable.ic_menu_camera,
                "Lamborghini Aventador SV dengan kondisi kolektor dan jarak tempuh yang sangat rendah. Menggunakan mesin V12 naturally aspirated yang terkenal akan suara dan performanya. Kendaraan telah dimodifikasi menggunakan velg forged premium dari MV Forged untuk meningkatkan tampilan tanpa mengurangi karakter asli mobil. Unit sangat terawat dan rutin mendapatkan perawatan berkala."
            )
        }

        // 5. PORSCHE
        findViewById<Button>(R.id.btn_detail_porsche).setOnClickListener {
            pindahKeDetail(
                "911 Carrera", "1978", "900 KM",
                "3.3-Liter Flat 6 SOHC Turbocharged", "Manual 5 Speed",
                "Rp4.000.000.000", android.R.drawable.ic_menu_camera,
                "Porsche 911 Carrera klasik yang telah dibangun dengan konsep RWB oleh Akira Nakai. Menggunakan body widebody khas RWB yang menjadi ikon dunia modifikasi Porsche. Perpaduan desain klasik Porsche dengan sentuhan Jepang menjadikan kendaraan ini sangat langka dan bernilai tinggi. Cocok untuk kolektor maupun pecinta Porsche yang menginginkan unit spesial."
            )
        }

        // 6. LEXUS LFA
        findViewById<Button>(R.id.btn_detail_lfa).setOnClickListener {
            pindahKeDetail(
                "LFA", "2010", "100 KM",
                "4.8-Liter V10 DOHC 40V 1LR-GUE", "Matic 6 Speed",
                "Rp15.000.000.000", android.R.drawable.ic_menu_camera,
                "Lexus LFA dengan kondisi sangat istimewa dan jarak tempuh yang sangat rendah. Menggunakan mesin V10 legendaris yang terkenal karena karakter suara mesinnya. Kendaraan mendapatkan sentuhan modifikasi dari Z&Z Garage dengan tetap mempertahankan identitas asli LFA. Sangat cocok sebagai koleksi karena termasuk salah satu supercar Jepang paling langka yang pernah diproduksi."
            )
        }

        // 7. CIVIC
        findViewById<Button>(R.id.btn_detail_civic).setOnClickListener {
            pindahKeDetail(
                "Civic Mugen RR", "2010", "900 KM",
                "2.2-Liter Inline 4 DOHC 16V K20A", "Manual 6 Speed",
                "Rp2.000.000.000", android.R.drawable.ic_menu_camera,
                "Honda Civic Mugen RR dengan paket Mugen original lengkap yang sangat langka. Kendaraan telah mendapatkan remap Stage 3 untuk meningkatkan performa mesin tanpa menghilangkan karakter khas Honda. Unit ini dikenal sebagai salah satu mobil paling spesial di kelasnya dan menjadi satu-satunya dengan spesifikasi serupa di kota. Kondisi kendaraan sangat terawat dan siap digunakan maupun dikoleksi."
            )
        }

        // 8. JAZZ
        findViewById<Button>(R.id.btn_detail_jazz).setOnClickListener {
            pindahKeDetail(
                "Jazz RS", "2018", "129.912 KM",
                "1.5-Liter Inline 4 SOHC 16V VTEC L15Z5", "Matic 7 Speed",
                "Rp429.000.000", android.R.drawable.ic_menu_camera,
                "Honda Jazz RS hasil hard modification oleh Z&Z Garage. Mendapatkan berbagai peningkatan berupa remap Stage 3, upgrade mesin, sistem exhaust performa tinggi, serta penggunaan velg dan ban aftermarket premium. Mobil memiliki tampilan sporty, performa responsif, dan tetap nyaman digunakan sebagai kendaraan harian maupun untuk menghadiri event otomotif."
            )
        }

        // 9. MERCEDES 190E
        findViewById<Button>(R.id.btn_detail_merc190).setOnClickListener {
            pindahKeDetail(
                "190E Evolution I", "1989", "12.000 KM",
                "2.5-Liter Inline 4 DOHC 16V M102.991", "Manual 5 Speed",
                "Rp3.000.000.000", android.R.drawable.ic_menu_camera,
                "Mercedes-Benz 190E Evolution I original yang memiliki sejarah sebagai mobil balap pada masanya. Merupakan salah satu model paling dicari oleh kolektor Mercedes-Benz karena jumlah produksinya yang terbatas. Kondisi kendaraan sangat baik dengan spesifikasi yang tetap mempertahankan karakter khas Evolution I. Cocok sebagai kendaraan koleksi maupun investasi jangka panjang."
            )
        }

        // 10. SLR MCLAREN
        findViewById<Button>(R.id.btn_detail_mclaren).setOnClickListener {
            pindahKeDetail(
                "SLR McLaren", "2008", "1.200 KM",
                "5.4-Liter Supercharged V8 M155", "Matic 5 Speed",
                "Rp30.000.000.000", android.R.drawable.ic_menu_camera,
                "Mercedes-Benz SLR McLaren dalam kondisi kolektor dengan modifikasi ringan berupa velg HRE premium dan air suspension lowered. Mesin supercharged V8 tetap mempertahankan performa dan karakter asli kendaraan. Hasil kolaborasi antara Mercedes-Benz dan McLaren ini menjadi salah satu grand tourer paling ikonik pada masanya dan sangat diminati oleh kolektor kendaraan eksotis di seluruh dunia."
            )
        }


        // ==========================================
        //  BAGIAN 2: HEADER & BOTTOM NAVIGATION
        // ==========================================

        // Setup Dropdown Menu di Header
        val ivMenuList: ImageView = findViewById(R.id.ivMenuList)
        ivMenuList.setOnClickListener { view ->
            val popupMenu = PopupMenu(this, view)
            popupMenu.menuInflater.inflate(R.menu.menu_header, popupMenu.menu)

            popupMenu.setOnMenuItemClickListener { menuItem ->
                when (menuItem.itemId) {
                    R.id.menu_profile -> { Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show(); true }
                    R.id.menu_setting -> { Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show(); true }
//                    R.id.menu_about -> {
//                        startActivity(Intent(this, AboutActivity::class.java))
//                        true
//                    }
//                    R.id.menu_logout -> {
//                        startActivity(Intent(this, LoginActivity::class.java))
//                        finish()
//                        true
//                    }
                    else -> false
                }
            }
            popupMenu.show()
        }

        // Setup Bottom Navigation Menu
        val bottomNavigation: BottomNavigationView = findViewById(R.id.bottomNavigation)
        bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> true
//                R.id.nav_about -> {
//                    startActivity(Intent(this, AboutActivity::class.java))
//                    true
//                }
                else -> false
            }
        }
    }

    // ==========================================
    //  BAGIAN 3: HELPER METHOD (Konsep Titipan Intent)
    // ==========================================
    private fun pindahKeDetail(
        nama: String, tahun: String, odo: String, mesin: String,
        transmisi: String, harga: String, fotoId: Int, deskripsi: String
    ) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("NAMA", nama)
        intent.putExtra("TAHUN", tahun)
        intent.putExtra("ODOMETER", odo)
        intent.putExtra("MESIN", mesin)
        intent.putExtra("TRANSMISI", transmisi)
        intent.putExtra("HARGA", harga)
        intent.putExtra("FOTO", fotoId)
        intent.putExtra("DESKRIPSI", deskripsi)
        startActivity(intent)
    }
}