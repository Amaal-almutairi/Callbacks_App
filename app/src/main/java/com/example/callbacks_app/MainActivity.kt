package com.example.callbacks_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var go:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        go = findViewById(R.id.b1)
        Toast.makeText(this, "StartActivity1", Toast.LENGTH_SHORT).show()
        go.setOnClickListener {
            var intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)


        }


    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResumeActivity1", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStopActivity1", Toast.LENGTH_SHORT).show()
    }

}