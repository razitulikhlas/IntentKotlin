package com.example.luaspersegikotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Penginputan Data"

        var move = findViewById<Button>(R.id.moveBtn)

        move.setOnClickListener{
            move()
        }
    }

    private fun move(){
        var nama    = findViewById<EditText>(R.id.nama)
        var bithday = findViewById<EditText>(R.id.tanggal_lahir)
        var major   = findViewById<EditText>(R.id.jurusan)
        var kelass  = findViewById<EditText>(R.id.kelas)
        var address  = findViewById<EditText>(R.id.alamat)

        val intent = Intent(this,DataActivity::class.java)
        intent.putExtra("name",nama.text.toString())
        intent.putExtra("birth",bithday.text.toString())
        intent.putExtra("major",major.text.toString())
        intent.putExtra("kelass",kelass.text.toString())
        intent.putExtra("address",address.text.toString())
        startActivity(intent)

    }
}
