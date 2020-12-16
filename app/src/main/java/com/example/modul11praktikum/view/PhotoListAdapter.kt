package com.example.modul11praktikum.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
//import com.bumptech.glide.Glide
//import com.bumptech.glide.request.RequestOptions
import com.example.modul11praktikum.R
import com.example.modul11praktikum.model.Photo
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_list.view.*

class PhotoListAdapter(var photos: ArrayList<Photo>) : RecyclerView.Adapter<PhotoListAdapter.ViewHolder>() {
//pengelolaan update photos
    fun updatePhotos(newPhotos: List<Photo>) {
        photos.clear()
        photos.addAll(newPhotos)
        notifyDataSetChanged()
    }
//untuk membuat tampilan lalu mengembalikannya
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int) = ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
    )

    override fun getItemCount() = photos.size
//menghubungkan data dengan vie holder
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(photos[position])
    }
//menghubungkan view holder dengan item view
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(photos: Photo) {
            itemView.tvTitle.text = photos.title
            itemView.setOnClickListener { view -> Toast.makeText(itemView.context,"Hello",Toast.LENGTH_LONG).show()
            }
            //Glide.with(itemView.context).load(photos.thumbnail).error(Glide.with(itemView.imageView).load(R.drawable.ic_launcher_background)).apply(
            // RequestOptions.centerCropTransform()).into(itemView.imageView)
            Picasso.get().load(photos.thumbnail).into(itemView.imageView)
        }
    }
}