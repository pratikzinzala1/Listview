package com.example.listview.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.listview.R
import com.example.listview.model.Affirmation
import java.security.AccessController.getContext
import kotlin.properties.Delegates

class ItemAdapter(private val context: Context, private val dataset: List<Affirmation>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {


    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val add_to_cart_button: ImageView = view.findViewById(R.id.add_to_cart)
        val item_increase_button: ImageView = view.findViewById(R.id.item_increase)
        val item_decrease_button: ImageView = view.findViewById(R.id.item_decrease)
        val product_item_count: TextView = view.findViewById(R.id.product_item_count)
        val add_to_cart_layout: LinearLayout = view.findViewById(R.id.add_to_cart_layout)
        val increase_decrease_layout: LinearLayout =
            view.findViewById(R.id.increase_decrease_layout)
        val add_to_favourite: ImageView = view.findViewById(R.id.add_to_favourite)


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_view, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        var numberofitem = 0
        var favourite:Boolean = false

        if (numberofitem <= 0)
            showAddToCartlayout(holder)
        holder.add_to_cart_button.setOnClickListener {
            numberofitem++
            showIncreaseDecreaseLayout(holder)
        }
        holder.item_increase_button.setOnClickListener {
            numberofitem++
            holder.product_item_count.text = numberofitem.toString()

        }
        holder.item_decrease_button.setOnClickListener {
            numberofitem--
            holder.product_item_count.text = numberofitem.toString()
            if (numberofitem <= 0)
                showAddToCartlayout(holder)
        }
        holder.add_to_favourite.setOnClickListener {
            if (!favourite) {
                holder.add_to_favourite.setImageResource(R.drawable.ic_favorite_filled)
                favourite = true
            } else {
                holder.add_to_favourite.setImageResource(R.drawable.ic_favorite_border)
                favourite = false
            }
        }


    }



    private fun showAddToCartlayout(holder: ItemViewHolder) {
        holder.add_to_cart_layout.visibility = View.VISIBLE
        holder.increase_decrease_layout.visibility = View.GONE
    }

    private fun showIncreaseDecreaseLayout(holder: ItemViewHolder) {
        holder.add_to_cart_layout.visibility = View.GONE
        holder.increase_decrease_layout.visibility = View.VISIBLE
    }


    override fun getItemCount(): Int {
        return dataset.size
    }
}