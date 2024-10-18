package com.example.advancedandroid3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.advancedandroid3.databinding.ItemPlaceBinding

typealias ItemClickListener = (String) -> Unit

class PlacesAdapter(
    private val placeImages: List<String>
) : RecyclerView.Adapter<PlacesAdapter.PlaceViewHolder>() {

    private var onClick: ItemClickListener = { }

    inner class PlaceViewHolder(
        private val binding: ItemPlaceBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(imageUrl: String) {
            Glide.with(binding.root)
                .load(imageUrl)
                .into(binding.root)
            binding.root.setOnClickListener {
                onClick.invoke(imageUrl)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PlaceViewHolder(
        ItemPlaceBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    )

    override fun getItemCount() = placeImages.size

    override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) {
        holder.bind(placeImages[position])
    }

    fun setOnClickListener(listener: ItemClickListener) {
        this.onClick = listener
    }
}
