package com.deveve21.a0915_retrofit

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.deveve21.a0915_retrofit.data.TopTrackData
import com.deveve21.a0915_retrofit.data.Track
import com.deveve21.a0915_retrofit.databinding.RowItemBinding

class MainAdapter(val data: List<Track>) : RecyclerView.Adapter<MainAdapter.ViewHolder>(){
    class ViewHolder(val binding : RowItemBinding) : RecyclerView.ViewHolder(binding.root) {


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_item, parent, false)


        return ViewHolder(RowItemBinding.bind(view))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.data = data[position]
        holder.binding.textRank.text = (position+1).toString()
    }

    override fun getItemCount(): Int = data.size
}