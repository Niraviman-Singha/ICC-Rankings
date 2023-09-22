package com.example.iccrankings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.iccrankings.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)

    }

    private lateinit var teams:TextView
    private lateinit var batting:TextView
    private lateinit var bowling:TextView
    private lateinit var allRounders:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        teams = findViewById(R.id.teamsTV)
        batting = findViewById(R.id.battingTV)
        bowling = findViewById(R.id.bowlingTY)
        allRounders = findViewById(R.id.allRounderTV)

        teams.setOnClickListener {
            startActivity(Intent(this@MainActivity,Teams::class.java))
        }

        batting.setOnClickListener {
            startActivity(Intent(this@MainActivity,Batting::class.java))
        }

        bowling.setOnClickListener {
            startActivity(Intent(this@MainActivity,Bowling::class.java))
        }

        allRounders.setOnClickListener {
            startActivity(Intent(this@MainActivity,AllRounders::class.java))
        }
    }
}