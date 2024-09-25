package com.example.firstappforlab

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class OnboardAdapter(private val items: List<OnboardItem>) : RecyclerView.Adapter<OnboardAdapter.OnboardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnboardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_onboard, parent, false)
        return OnboardViewHolder(view)
    }

    override fun onBindViewHolder(holder: OnboardViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    class OnboardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: OnboardItem) {
            itemView.findViewById<TextView>(R.id.title).text = item.title
            itemView.findViewById<TextView>(R.id.subtitle).text = item.subtitle
            itemView.findViewById<ImageView>(R.id.image).setImageResource(item.imageResId)
        }
    }
}
