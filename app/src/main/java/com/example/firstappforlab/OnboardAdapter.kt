package com.example.firstappforlab

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.firstappforlab.databinding.ItemOnboardBinding

class OnboardAdapter(private val items: List<OnboardItem>) : RecyclerView.Adapter<OnboardAdapter.OnboardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnboardViewHolder {
        val binding = ItemOnboardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return OnboardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: OnboardViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    class OnboardViewHolder(private val binding: ItemOnboardBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: OnboardItem) {
            binding.title.text = item.title
            binding.subtitle.text = item.subtitle
            binding.image.setImageResource(item.imageResId)
        }
    }
}
