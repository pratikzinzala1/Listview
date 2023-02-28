package com.example.listview.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.listview.data.model.ProductModel


class ItemAdapter: ListAdapter<ProductModel, ItemAdapter.ItemViewHolder>(DiffCallback) {
    class ItemViewHolder {

    }
    companion object DiffCallback : DiffUtil.ItemCallback<ProductModel>() {
        override fun areItemsTheSame(oldItem: ProductModel, newItem: ProductModel): Boolean {
            return oldItem.imageResourceId == newItem.imageResourceId
        }

        override fun areContentsTheSame(oldItem: ProductModel, newItem: ProductModel): Boolean {
            return oldItem.stringResourceId == newItem.stringResourceId
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        TODO("Not yet implemented")
    }


//    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
//
//        val add_to_cart_button: ImageView = view.findViewById(R.id.add_to_cart)
//        val item_increase_button: ImageView = view.findViewById(R.id.item_increase)
//        val item_decrease_button: ImageView = view.findViewById(R.id.item_decrease)
//        val product_item_count: TextView = view.findViewById(R.id.product_item_count)
//        val add_to_cart_layout: LinearLayout = view.findViewById(R.id.add_to_cart_layout)
//        val increase_decrease_layout: LinearLayout = view.findViewById(R.id.increase_decrease_layout)
//        val add_to_favourite: ImageView = view.findViewById(R.id.add_to_favourite)
//        val mainviewe: ConstraintLayout = view.findViewById(R.id.mainview)
//
//        val product_image: ImageView = view.findViewById(R.id.product_image)
//        val product_name:TextView = view.findViewById(R.id.product_name)
//        val product_price:TextView = view.findViewById(R.id.product_price)
//        val product_description:TextView = view.findViewById(R.id.product_description)
//
//
//
//
//    }
//
//
//    constructor(parcel: Parcel) : this(TODO("navController")) {
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
//        val adapterLayout = LayoutInflater.from(parent.context)
//            .inflate(R.layout.item_view, parent, false)
//        return ItemViewHolder(adapterLayout)
//    }
//
//    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
//        val item = [position]
//        var numberofitem = 0
//        var favourite: Boolean = false
//
//        holder.product_image.transitionName = "image_small_$position"
//        holder.product_name.transitionName = "imag_small_$position"
//        holder.product_price.transitionName = "ima_small_$position"
//        holder.product_description.transitionName = "im_small_$position"
//
//        holder.itemView.setOnClickListener {
//            val extras = FragmentNavigatorExtras(
//                holder.product_image to "image_big_$position",
//                holder.product_name to "imag_big_$position",
//                holder.product_price to "ima_big_$position",
//                holder.product_description to "im_big_$position",
//                )
//
//            navController.navigate(
//                listfragmentDirections.actionListfragmentToItemdetailfragment(
//                    arrayOf("image_big_$position",
//                        "imag_big_$position",
//                        "ima_big_$position",
//                        "im_big_$position",
//                        )),
//                extras
//            )
//        }
//
//
//        if (numberofitem <= 0)
//            showAddToCartlayout(holder)
//        holder.add_to_cart_button.setOnClickListener {
//            numberofitem++
//            showIncreaseDecreaseLayout(holder)
//            holder.product_item_count.text = numberofitem.toString()
//
//        }
//        holder.item_increase_button.setOnClickListener {
//            numberofitem++
//            holder.product_item_count.text = numberofitem.toString()
//
//        }
//        holder.item_decrease_button.setOnClickListener {
//            numberofitem--
//            holder.product_item_count.text = numberofitem.toString()
//            if (numberofitem <= 0)
//                showAddToCartlayout(holder)
//        }
//        holder.add_to_favourite.setOnClickListener {
//            if (!favourite) {
//                holder.add_to_favourite.setImageResource(R.drawable.ic_favorite_filled)
//                favourite = true
//            } else {
//                holder.add_to_favourite.setImageResource(R.drawable.ic_favorite_border)
//                favourite = false
//            }
//        }
//
//
//    }
//
//
//    private fun showAddToCartlayout(holder: ItemViewHolder) {
//        holder.add_to_cart_layout.visibility = View.VISIBLE
//        holder.increase_decrease_layout.visibility = View.GONE
//    }
//
//    private fun showIncreaseDecreaseLayout(holder: ItemViewHolder) {
//        holder.add_to_cart_layout.visibility = View.GONE
//        holder.increase_decrease_layout.visibility = View.VISIBLE
//    }
//
//
//    override fun getItemCount(): Int {
//        return dataset.size
//    }




}