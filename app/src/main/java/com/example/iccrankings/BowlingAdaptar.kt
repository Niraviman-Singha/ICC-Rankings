package com.example.iccrankings

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class BowlingAdaptar(context: Context, bowlingList:ArrayList<ModelBowling>):ArrayAdapter<ModelBowling>(context,0,bowlingList) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listItemView3 = convertView
        if (listItemView3 == null) {
            listItemView3 = LayoutInflater.from(context).inflate(R.layout.bowling_items, parent, false)

        }
        val bowlingModel: ModelBowling? = getItem(position)
        val playerImage = listItemView3!!.findViewById<CircleImageView>(R.id.bowlerImg)
        val playerName = listItemView3!!.findViewById<TextView>(R.id.bowlerName)
        val playerRanking = listItemView3!!.findViewById<TextView>(R.id.bowlerRankings)

        playerName.setText(bowlingModel!!.bowlerName)
        playerRanking.setText(bowlingModel!!.bowlerRanking)
        playerImage.setImageResource(bowlingModel!!.bowlerImg)
        return listItemView3
    }
}