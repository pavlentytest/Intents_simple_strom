package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import com.example.myapplication.databinding.ActivityMain2Binding
import com.example.myapplication.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity2 : AppCompatActivity() {


    private lateinit var binding2: ActivityMain2Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding2 = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding2.root)
        val bundle = intent.extras
        val data = bundle?.getString("key")
        Snackbar.make(binding2.constraintLayout2, data.toString(), Snackbar.LENGTH_LONG).show()

        binding2.button3.setOnClickListener {
            val intent = Intent()
            intent.putExtra("key2",binding2.editTextTextPersonName.text.toString())
            setResult(200, intent)
            finish()
        }

    }
}