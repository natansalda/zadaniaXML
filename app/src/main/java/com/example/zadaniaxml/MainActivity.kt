package com.example.zadaniaxml

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_zadanie4_rozwiazanie.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zadanie4_rozwiazanie)
    }

    fun makeBlue(view: View) {
        header_text.setTextColor(Color.BLUE)
    }

    fun makeRed(view: View) {
        header_text.setTextColor(Color.RED)
    }

    fun makeGreen(view: View) {
        header_text.setTextColor(Color.GREEN)
    }

    fun makeYellow(view: View) {
        header_text.setTextColor(Color.YELLOW)
    }

    fun makeGray(view: View) {
        header_text.setTextColor(Color.GRAY)
    }

    fun makeWhite(view: View) {
        header_text.setTextColor(Color.WHITE)
    }

    fun makeCyan(view: View) {
        header_text.setTextColor(Color.CYAN)
    }

    fun makeBlack(view: View) {
        header_text.setTextColor(Color.BLACK)
    }
}