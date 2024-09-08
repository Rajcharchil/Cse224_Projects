package com.example.charchilproject

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
        val buttonUP = findViewById<Button>(R.id.btUpload)
        val buttonDO = findViewById<Button>(R.id.btDown)

        buttonUP.setOnClickListener{
            Toast.makeText(applicationContext,"Uploading..", Toast.LENGTH_SHORT).show()
        }
        buttonDO.setOnClickListener{
            Toast.makeText(applicationContext,"Downloading..", Toast.LENGTH_SHORT).show()
        }
    }
}