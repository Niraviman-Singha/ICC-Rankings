package com.example.iccrankings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.iccrankings.databinding.ActivityBattingBinding
import com.example.iccrankings.databinding.ActivityBowlingBinding

class Bowling : AppCompatActivity() {
    val binding by lazy {
        ActivityBowlingBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val bowlingList:ArrayList<ModelBowling> = ArrayList<ModelBowling>()

        bowlingList.add(ModelBowling(R.drawable.mohammad, "Mohammed Siraj", "Position: 1  Rating: 694"))
        bowlingList.add(ModelBowling(R.drawable.josh, "Josh Hazlewood", "Position: 2  Rating: 678"))
        bowlingList.add(ModelBowling(R.drawable.trent, "Trent Boult", "Position: 3  Rating: 677"))
        bowlingList.add(ModelBowling(R.drawable.mujibur, "Mujeeb Ur Rahman", "Position: 4  Rating: 657"))
        bowlingList.add(ModelBowling(R.drawable.rashid, "Rashid Khan", "Position: 5  Rating: 655"))
        bowlingList.add(ModelBowling(R.drawable.mitchell, "Mitchell Starc", "Position: 6  Rating: 652"))
        bowlingList.add(ModelBowling(R.drawable.matt, "Matt Henry", "Position: 7  Rating: 645"))
        bowlingList.add(ModelBowling(R.drawable.adam, "Adam Zampa", "Position: 8  Rating: 642"))
        bowlingList.add(ModelBowling(R.drawable.kuldeep, "Kuldeep Yadav", "Position: 9  Rating: 638"))
        bowlingList.add(ModelBowling(R.drawable.shaheen, "Shaheen Afridi", "Position: 10  Rating: 632"))

        val adapater3 = BowlingAdaptar(this, bowlingList)
        binding.listView3.adapter = adapater3
    }
}