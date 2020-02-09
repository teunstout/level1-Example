package com.example.example1

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnConfirm.setOnClickListener {
            checkAwnser()
        }
    }

    fun checkAwnser() {
        val awnser =
            if (getString(R.string.correctAwnser).toLowerCase() == etAnswer.text.toString().toLowerCase()) {
                R.string.correct
            } else {
                R.string.incorrect
            }



        Toast.makeText(this, awnser, Toast.LENGTH_SHORT).show()
    }
}
