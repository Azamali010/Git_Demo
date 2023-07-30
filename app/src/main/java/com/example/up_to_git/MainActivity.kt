package com.example.up_to_git

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getData()
        adsData()
        AddNumber()
    }

    private fun AddNumber() {
      Toast.makeText(this,"Sum Of Number ", Toast.LENGTH_SHORT).show()
    }

    private fun adsData() {
        Toast.makeText(this,"HII Git",Toast.LENGTH_SHORT).show()
    }

    private fun getData() {
        Toast.makeText(this,"Hello",Toast.LENGTH_SHORT).show()
    }
}