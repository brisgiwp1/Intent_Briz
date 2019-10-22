package com.example.intent_briz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_prs.setOnClickListener{
            intent = Intent(this, Detail::class.java)
            intent.putExtra("nim", nim_ida.text)
            intent.putExtra("nama", nm_ida.text)
            intent.putExtra("nilai", n_ida.text)
            if(n_ida.text.toString().toInt()>=80){
                intent.putExtra("keterangan","A")
            }
            else if (n_ida.text.toString().toInt()>=60) {
                intent.putExtra("keterangan", "B")
            }
            else if (n_ida.text.toString().toInt()>=40){
                intent.putExtra("keterangan","C")
            }
            else if (n_ida.text.toString().toInt()>=20){
                intent.putExtra("keterangan","D")
            }
            else if (n_ida.text.toString().toInt()>=0){
                intent.putExtra("keterangan","E")
            }
            startActivity(intent)
        }
    }
}
