package com.example.callbacks_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Toast.makeText(this, "StartActivity2", Toast.LENGTH_SHORT).show()

    }

override fun onResume() {
    super.onResume()
    Toast.makeText(this, "onResumeActivity2", Toast.LENGTH_SHORT).show()
}



    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroyActivity2", Toast.LENGTH_SHORT).show()

    }

}
