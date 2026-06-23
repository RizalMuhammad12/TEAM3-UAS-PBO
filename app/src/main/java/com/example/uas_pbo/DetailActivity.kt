package com.example.uas_pbo

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // 1. Inisialisasi seluruh komponen View dari activity_detail.xml
        val tvNama: TextView = findViewById(R.id.tv_detail_nama)
        val tvHarga: TextView = findViewById(R.id.tv_detail_harga)
        val tvTahun: TextView = findViewById(R.id.tv_detail_tahun)
        val tvOdo: TextView = findViewById(R.id.tv_detail_odometer)
        val tvMesin: TextView = findViewById(R.id.tv_detail_mesin)
        val tvTransmisi: TextView = findViewById(R.id.tv_detail_transmisi)
        val tvDeskripsi: TextView = findViewById(R.id.tv_detail_deskripsi)
        val ivFoto: ImageView = findViewById(R.id.iv_detail_foto)

        // 2. Tangkap data paketan Intent yang dikirim dari HomeActivity
        val nama = intent.getStringExtra("NAMA")
        val harga = intent.getStringExtra("HARGA")
        val tahun = intent.getStringExtra("TAHUN")
        val odometer = intent.getStringExtra("ODOMETER")
        val mesin = intent.getStringExtra("MESIN")
        val transmisi = intent.getStringExtra("TRANSMISI")
        val deskripsi = intent.getStringExtra("DESKRIPSI")

        // Mengambil ID gambar drawable (jika tidak ketemu, default-nya pakai 0)
        val fotoId = intent.getIntExtra("FOTO", 0)

        // 3. Pasang data yang berhasil ditangkap ke dalam komponen View layout
        tvNama.text = nama
        tvHarga.text = harga
        tvTahun.text = tahun
        tvOdo.text = odometer
        tvMesin.text = mesin
        tvTransmisi.text = transmisi
        tvDeskripsi.text = deskripsi

        // Jika fotoId valid (bukan 0), pasang gambarnya ke ImageView
        if (fotoId != 0) {
            ivFoto.setImageResource(fotoId)
        }
    }
}