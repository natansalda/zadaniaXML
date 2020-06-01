package com.example.zadaniaxml

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_zadanie5_rozwiazanie.*

class MainActivity : AppCompatActivity() {

    // create scoreTeamA variable, it needs to be Int, and value of 0
    // create scoreTeamB variable, it needs to be Int, and value of 0

    // change used layout to activity_zadanie5_rozwiazanie
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun teamAScores(view: View) {
        // add 1 to scoreTeamA with every click
        // show proper score value in teamA_text_view
    }

    fun teamBScores(view: View) {
        // add 1 to scoreTeamB with every click
        // show proper score value in teamB_text_view
    }

    fun resetScore(view: View) {
        // scoreTeamA needs to be 0 again
        // scoreTeamB needs to be 0 again
        // show proper score value in teamA_text_view
        // show proper score value in teamB_text_view
    }
}