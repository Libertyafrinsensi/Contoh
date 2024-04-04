package com.example.mobile2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Home : AppCompatActivity() {
    private lateinit var menuRecyclerView: RecyclerView
    private lateinit var adaptermenu : MenuAdapter
    private lateinit var listmenu :ArrayList<Item>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

       menuRecyclerView = findViewById(R.id.rvMenu)
        listmenu = ArrayList()

    listmenu.add(Item(R.drawable.ayamgoreng,"Ayam Goreng","45.000"))
    listmenu.add(Item(R.drawable.ayamgorengmentega,"Ayam Goreng Mentega","45.000"))
    listmenu.add(Item(R.drawable.ayamnanking,"Ayam Nanking","45.000"))
    listmenu.add(Item(R.drawable.ayamrica,"Ayam Rica","45.000"))
    listmenu.add(Item(R.drawable.ayamwoku,"Ayam Woku","45.000"))
    listmenu.add(Item(R.drawable.capcaykuahayam,"Capcay Kuah Ayam","45.000"))
    listmenu.add(Item(R.drawable.capcaykuahseafood,"Capcay Kuah Seafood","45.000"))

        menuRecyclerView.layoutManager =LinearLayoutManager(this)
        menuRecyclerView.setHasFixedSize(true)
        adaptermenu = MenuAdapter(listmenu)
        menuRecyclerView.adapter = adaptermenu

    }
}