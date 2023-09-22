package com.example.iccrankings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.iccrankings.databinding.ActivityBattingBinding
import com.example.iccrankings.databinding.ActivityTeamsBinding

class Batting : AppCompatActivity() {
    val binding by lazy {
        ActivityBattingBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val battingList:ArrayList<ModelBatting> = ArrayList<ModelBatting>()

        battingList.add(ModelBatting(R.drawable.babor, "Babar Azam", "Position: 1  Rating: 857"))
        battingList.add(ModelBatting(R.drawable.subhman, "Shubman Gill", "Position: 2  Rating: 814"))
        battingList.add(ModelBatting(R.drawable.rassie, "Rassie van der Dussen", "Position: 3  Rating: 743"))
        battingList.add(ModelBatting(R.drawable.imam, "Imam-ul-Haq", "Position: 4  Rating: 728"))
        battingList.add(ModelBatting(R.drawable.harry, "Harry Tector", "Position: 5  Rating: 726"))
        battingList.add(ModelBatting(R.drawable.david, "David Warner", "Position: 6  Rating: 720"))
        battingList.add(ModelBatting(R.drawable.quinton, "Quinton de Kock", "Position: 7  Rating: 714"))
        battingList.add(ModelBatting(R.drawable.virat, "Virat Kohli", "Position: 8  Rating: 708"))
        battingList.add(ModelBatting(R.drawable.heinrich, "Heinrich Klaasen", "Position: 9  Rating: 698"))
        battingList.add(ModelBatting(R.drawable.rohit, "Rohit Sharma", "Position: 10  Rating: 696"))



        val adapater2 = BattingAdaptar(this, battingList)
        binding.listView2.adapter = adapater2
    }
}