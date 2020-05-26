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

    // changes color to blue
    fun makeBlue(view: View) {
        header_text.setTextColor(Color.BLUE)
    }

    // changes color to red
    fun makeRed(view: View) {
        header_text.setTextColor(Color.RED)
    }

    // changes color to green
    fun makeGreen(view: View) {
        header_text.setTextColor(Color.GREEN)
    }

    // changes color to yellow
    fun makeYellow(view: View) {
        header_text.setTextColor(Color.YELLOW)
    }

    // changes color to gray
    fun makeGray(view: View) {
        header_text.setTextColor(Color.GRAY)
    }

    // changes color to white
    fun makeWhite(view: View) {
        header_text.setTextColor(Color.WHITE)
    }

    // changes color to cyan
    fun makeCyan(view: View) {
        header_text.setTextColor(Color.CYAN)
    }

    // changes color to black
    fun makeBlack(view: View) {
        header_text.setTextColor(Color.BLACK)
    }


}
