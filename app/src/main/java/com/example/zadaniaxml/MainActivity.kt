package com.example.zadaniaxml

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_zadanie1_rozwiazanie.*
import kotlinx.android.synthetic.main.activity_zadanie4_rozwiazanie.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // set proper layout here
        setContentView(R.layout.activity_zadanie4_rozwiazanie)
    }

    fun makeBlue(view: View) {
        header_text.setTextColor(Color.BLUE)
        header_text.text = "I am blue"
    }

    fun makeRed(view: View) {
        header_text.setTextColor(Color.RED)
        header_text.text = "I am red"
    }

    fun makeGreen(view: View) {
        header_text.setTextColor(Color.GREEN)
        header_text.text = "I am green"
    }

    fun makeYellow(view: View) {
        header_text.setTextColor(Color.YELLOW)
        header_text.text = "I am yellow"
    }

    fun makeGray(view: View) {
        header_text.setTextColor(Color.GRAY)
        header_text.text = "I am gray"
    }

    fun makeWhite(view: View) {
        header_text.setTextColor(Color.WHITE)
        header_text.text = "I am white"
    }

    fun makeCyan(view: View) {
        header_text.setTextColor(Color.CYAN)
        header_text.text = "I am cyan"
    }

    fun makeBlack(view: View) {
        header_text.setTextColor(Color.BLACK)
        header_text.text = "I am black"
    }
}
