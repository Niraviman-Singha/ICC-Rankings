package com.example.iccrankings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.iccrankings.databinding.ActivityAllRoundersBinding
import com.example.iccrankings.databinding.ActivityBowlingBinding

class AllRounders : AppCompatActivity() {
    val binding by lazy {
        ActivityAllRoundersBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val allRounderList:ArrayList<ModelAllRounder> = ArrayList<ModelAllRounder>()

        allRounderList.add(ModelAllRounder(R.drawable.shakib, "Shakib Al Hasan", "Position: 1  Rating: 371"))
        allRounderList.add(ModelAllRounder(R.drawable.nabi, "Mohammad Nabi", "Position: 2  Rating: 302"))
        allRounderList.add(ModelAllRounder(R.drawable.sikandar, "Sikandar Raza", "Position: 3  Rating: 287"))
        allRounderList.add(ModelAllRounder(R.drawable.rashid, "Rashid Khan", "Position: 4  Rating: 259"))
        allRounderList.add(ModelAllRounder(R.drawable.assad, "Assad Vala", "Position: 5  Rating: 248"))
        allRounderList.add(ModelAllRounder(R.drawable.hardik, "Hardik Pandya", "Position: 6  Rating: 243"))
        allRounderList.add(ModelAllRounder(R.drawable.zeeshan, "Zeeshan Maqsood", "Position: 7  Rating: 235"))
        allRounderList.add(ModelAllRounder(R.drawable.mehidy, "Mehidy Hasan Miraz", "Position: 8  Rating: 223"))
        allRounderList.add(ModelAllRounder(R.drawable.santner, "Mitchell Santner", "Position: 9  Rating: 216"))
        allRounderList.add(ModelAllRounder(R.drawable.chris, "Chris Woakes", "Position: 10  Rating: 212"))


        val adapter4 = AllRounderAdaptar(this, allRounderList)
        binding.listView4.adapter = adapter4
    }
}