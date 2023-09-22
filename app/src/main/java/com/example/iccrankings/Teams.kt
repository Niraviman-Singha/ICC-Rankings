package com.example.iccrankings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.iccrankings.databinding.ActivityMainBinding
import com.example.iccrankings.databinding.ActivityTeamsBinding

class Teams : AppCompatActivity() {
    val binding by lazy {
        ActivityTeamsBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val countryList:ArrayList<ModelCountry> = ArrayList<ModelCountry>()

        countryList.add(ModelCountry(R.drawable.pak, "Pakistan", "Position: 1  Rating: 115"))
        countryList.add(ModelCountry(R.drawable.ind, "India", "Position: 2  Rating: 115"))
        countryList.add(ModelCountry(R.drawable.aus, "Australia", "Position: 3  Rating: 113"))
        countryList.add(ModelCountry(R.drawable.sa, "South Africa", "Position: 4  Rating: 106"))
        countryList.add(ModelCountry(R.drawable.eng, "England", "Position: 5  Rating: 105"))
        countryList.add(ModelCountry(R.drawable.nz, "New Zealand", "Position: 6  Rating: 100"))
        countryList.add(ModelCountry(R.drawable.bd, "Bangladesh", "Position: 7  Rating: 94"))
        countryList.add(ModelCountry(R.drawable.sri, "Sri Lanka", "Position: 8  Rating: 92"))
        countryList.add(ModelCountry(R.drawable.afg, "Afganistan", "Position: 9  Rating: 80"))
        countryList.add(ModelCountry(R.drawable.wi, "West Indies", "Position: 10  Rating: 68"))
        countryList.add(ModelCountry(R.drawable.zi, "Zimbabwe", "Position: 11  Rating: 55"))


        val adapater = CountryAdaptar(this, countryList)
        binding.listView.adapter = adapater
    }
}