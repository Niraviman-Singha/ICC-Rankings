package com.example.iccrankings

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class AllRounderAdaptar(context: Context, allRounderList:ArrayList<ModelAllRounder>):ArrayAdapter<ModelAllRounder>(context,0,allRounderList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listItemView4 = convertView
        if (listItemView4 == null) {
            listItemView4 = LayoutInflater.from(context).inflate(R.layout.allrounder_items, parent, false)

        }
        val allRounderModel: ModelAllRounder? = getItem(position)
        val allRounderImage = listItemView4!!.findViewById<CircleImageView>(R.id.allRounderImg)
        val allRounderName = listItemView4!!.findViewById<TextView>(R.id.allRounderName)
        val allRounderRanking = listItemView4!!.findViewById<TextView>(R.id.allRounderRankings)

        allRounderName.setText(allRounderModel!!.allRounderName)
        allRounderRanking.setText(allRounderModel!!.allRounderRankings)
        allRounderImage.setImageResource(allRounderModel!!.allRounderImg)
        return listItemView4
    }
}