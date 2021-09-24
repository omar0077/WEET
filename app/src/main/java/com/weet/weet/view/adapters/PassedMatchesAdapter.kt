package com.weet.weet.view.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.weet.weet.R

class PassedMatchesAdapter : RecyclerView.Adapter<PassedMatchesAdapter.MyView>() {

    private val images = intArrayOf(R.drawable.omar, R.drawable.profile, R.drawable.omar, R.drawable.profile)

    class MyView(view: View) : RecyclerView.ViewHolder(view) {
        var imageView: ImageView
        init {
            imageView = view.findViewById<ImageView>(R.id.passed_matches_image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyView {
        val itemView: View = LayoutInflater
            .from(parent.context)
            .inflate(
                R.layout.passed_matches_slider_items,
                parent,
                false
            )
        return MyView(itemView)
    }

    override fun onBindViewHolder(holder: MyView, position: Int) {
        holder.imageView.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return images.size
    }
}