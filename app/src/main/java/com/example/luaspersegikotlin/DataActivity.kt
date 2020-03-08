@file:Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")

package com.example.luaspersegikotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_data.*



class DataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        title = "Data Member"

        val intent : Intent = intent

        val name : String = intent.getStringExtra("name")
        nama_tv.text = name

        val birth : String = intent.getStringExtra("birth")
        tanggal_lahir_tv.text = birth

        val major : String = intent.getStringExtra("major")
        jurusan_tv.text = major

        val kelass : String = intent.getStringExtra("kelass")
        kelas_tv.text = kelass

        val address : String = intent.getStringExtra("address")
        alamat_tv.text = address

        btnBack.setOnClickListener{
            val intents = Intent(this,MainActivity::class.java)
            startActivity(intents)
        }




    }
}
