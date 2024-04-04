package com.example.mobile2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class MenuAdapter (private val menuList: ArrayList<Item>) :RecyclerView.Adapter<MenuAdapter.MyViewHolder>() {

    class MyViewHolder(Item: View) : RecyclerView.ViewHolder(Item) {
        val gambar: ImageView = Item.findViewById(R.id.imageView)
        val nama: TextView = Item.findViewById(R.id.Namamakanan)
        val Harga: TextView = Item.findViewById(R.id.Hargamakanan)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val Item = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return MyViewHolder(Item)
    }

    override fun getItemCount(): Int = menuList.size


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem =menuList[position]
        holder.gambar.setImageResource(currentItem.gambar)
        holder.nama.text =currentItem.nama
        holder.Harga.text =currentItem.Harga
    }
}