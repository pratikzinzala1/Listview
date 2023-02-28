package com.example.listview

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.listview.adapter.ItemAdapter
import com.example.listview.data.model.ProductModel


@BindingAdapter("ListData")
fun bindRecyclerView(recyclerView: RecyclerView, data: List<ProductModel>?) {
    val adapter = recyclerView.adapter as ItemAdapter
    adapter.submitList(data)
}