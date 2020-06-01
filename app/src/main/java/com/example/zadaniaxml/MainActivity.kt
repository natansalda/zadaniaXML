package com.example.zadaniaxml

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_zadanie5_rozwiazanie.*

class MainActivity : AppCompatActivity() {

    var scoreTeamA: Int = 0

    var scoreTeamB: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zadanie5_rozwiazanie)
    }

    fun teamAScores(view: View) {
        scoreTeamA++
        teamA_text_view.text = scoreTeamA.toString()
    }

    fun teamBScores(view: View) {
        scoreTeamB++
        teamB_text_view.text = scoreTeamB.toString()
    }

    fun resetScore(view: View) {
        scoreTeamA = 0
        scoreTeamB = 0
        teamA_text_view.text = scoreTeamA.toString()
        teamB_text_view.text = scoreTeamB.toString()
    }
}