package com.example.projectintens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.example.projectintens.Hasil
import com.example.projectintens.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nim: EditText = findViewById(R.id.input_nim)
        var nama: EditText = findViewById(R.id.input_nama)
        var nilai: EditText = findViewById(R.id.input_nilai)

        if (nim.getText().toString().length == 0) {
            nim.setError("Harap isi NIM Anda");
        }
        if (nama.getText().toString().length == 0) {
            nama.setError("Harap isi Nama Anda");
        }
        if (nilai.getText().toString().length == 0) {
            nilai.setError("Harap Masukan Nilai");

            btn_proses.setOnClickListener() {
                intent = Intent(this, Hasil::class.java)
                intent.putExtra("nim", nim.getText())
                intent.putExtra("nama", nama.getText())
                intent.putExtra("nilai", nilai.getText())
                startActivity(intent)
                Toast.makeText(this, "Nilai Berhasil diInputkan", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
