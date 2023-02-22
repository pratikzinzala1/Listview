package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import androidx.recyclerview.widget.RecyclerView.VERTICAL
import com.example.listview.adapter.ItemAdapter
import com.example.listview.data.Datasource
import com.example.listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myDataset = Datasource().loadAffirmations()


        val layoutManager = LinearLayoutManager(this)
        binding.recyclerview.layoutManager = layoutManager
        binding.recyclerview.adapter = ItemAdapter(this, myDataset)


        binding.recyclerview.setHasFixedSize(true)

    }


}