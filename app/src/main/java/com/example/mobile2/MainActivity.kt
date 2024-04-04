package com.example.mobile2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener(View.OnClickListener {startActivity(Intent(this, Home::class.java)) })
        textRegister.setOnClickListener(View.OnClickListener {startActivity(Intent(this, Register::class.java)) })
    }
}