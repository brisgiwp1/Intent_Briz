package com.example.intent_briz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class Detail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val bundle = intent.extras
        val nim = bundle?.get("nim")
        val nama = bundle?.get("nama")
        val nilai = bundle?.get("nilai")
        val keterangan = bundle?.get("keterangan")
        tv_nim.text = nim.toString()
        tv_nama.text = nama.toString()
        tv_nilai.text = nilai.toString()
        tv_keterangan.text = keterangan.toString()
    }
}
