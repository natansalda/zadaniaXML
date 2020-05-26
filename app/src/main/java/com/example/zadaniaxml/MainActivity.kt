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
        setContentView(R.layout.activity_zadanie4_rozwiazanie)
    }

    fun makeBlue(view: View) {
        header_text.setTextColor(Color.BLUE)
    }

    fun makeRed(view: View) {

    }

    fun makeGreen(view: View) {

    }

    fun makeYellow(view: View) {

    }

    fun makeGray(view: View) {

    }

    fun makeWhite(view: View) {

    }

    fun makeCyan(view: View) {

    }

    fun makeBlack(view: View) {

    }
}
