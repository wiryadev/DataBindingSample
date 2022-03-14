package com.wiryadev.databindingsample

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wiryadev.databindingsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.name = "AND 4 Binar Academy"
        binding.bindingClickListener = object : BindingClickListener {
            override fun onTextClicked() {
                Toast.makeText(this@MainActivity, "Click test binding", Toast.LENGTH_LONG).show()
            }
        }
    }
}

interface BindingClickListener {
    fun onTextClicked()
}