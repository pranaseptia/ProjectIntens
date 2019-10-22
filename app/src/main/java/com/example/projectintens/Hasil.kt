package com.example.projectintens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectintens.MainActivity
import kotlinx.android.synthetic.main.activity_hasil.*

class Hasil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        val bundle: Bundle? = intent.extras
        val proses_nim = bundle?.get("nim")
        val proses_nama = bundle?.get("nama")
        val proses_nilai = bundle?.get("nilai")

        var nil = proses_nilai.toString()
        var nilai = nil.toInt()

        if (nilai >= 80) {
            output_keterangan.setText("A")
        } else if (nilai >= 60) {
            output_keterangan.setText("B")
        } else if (nilai >= 40) {
            output_keterangan.setText("C")
        } else if (nilai >= 20) {
            output_keterangan.setText("D")
        } else {
            output_keterangan.setText("E")
        }
        output_nim.setText("" + proses_nim)
        output_nama.setText("" + proses_nama)
        output_nilai.setText("" + proses_nilai)

        btn_kembali.setOnClickListener() {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
