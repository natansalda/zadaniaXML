package com.example.zadaniaxml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_zadanie1_rozwiazanie.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zadanie2_rozwiazanie)
    }

    fun pobierzText(view: View) {
        var editText = edit_text.text.toString()
        naglowek.text = editText
    }

}
