package com.example.recyclerviewinflow

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.Glide.with as glideWith

class FileAdapter(private val fileList: List<constant>) : RecyclerView.Adapter<FileAdapter.FileViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FileViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.layout_file_source,
        parent, false)

        return  FileViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FileViewHolder, position: Int) {
        val currentItem = fileList[position]

        holder.imageView
        holder.name.text = currentItem.name
        holder.position.text = currentItem.position
        holder.status.text = currentItem.status.toString()

    }

    override fun getItemCount() = fileList.size

    class FileViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imageView: ImageView = itemView.findViewById(R.id.image_view)
        val name: TextView = itemView.findViewById(R.id.nameText)
        val position: TextView = itemView.findViewById(R.id.position)
        val status: TextView = itemView.findViewById(R.id.status)

        private fun ImageView.setImageResource(imageResource: String) {

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
            Glide.with(itemView.context)
                .load(constant.imageView)
                .into(imageView)
        }


    }
}


