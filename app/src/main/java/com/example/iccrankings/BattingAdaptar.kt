package com.example.iccrankings

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class BattingAdaptar(context: Context, countryList:ArrayList<ModelBatting>):ArrayAdapter<ModelBatting>(context,0,countryList)  {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listItemView2 = convertView
        if(listItemView2==null){
            listItemView2 = LayoutInflater.from(context).inflate(R.layout.batting_items, parent, false)

        }
        val battingModel:ModelBatting? = getItem(position)
        val playerImage = listItemView2!!.findViewById<CircleImageView>(R.id.playerImg)
        val playerName = listItemView2!!.findViewById<TextView>(R.id.playerName)
        val playerRanking = listItemView2!!.findViewById<TextView>(R.id.playerRankings)

        playerName.setText(battingModel!!.playerName)
        playerRanking.setText(battingModel!!.playerRanking)
        playerImage.setImageResource(battingModel!!.playerImg)
        return listItemView2
    }
}