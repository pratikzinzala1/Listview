package com.example.listview.data

import com.example.listview.R
import com.example.listview.data.model.ProductModel

class Datasource {

    fun loadProductModel():List<ProductModel>{

        return listOf<ProductModel>(
            ProductModel(R.string.affirmation1, R.drawable.image1),
            ProductModel(R.string.affirmation2, R.drawable.image2),
            ProductModel(R.string.affirmation3, R.drawable.image3),
            ProductModel(R.string.affirmation4, R.drawable.image4),
            ProductModel(R.string.affirmation5, R.drawable.image5),
            ProductModel(R.string.affirmation6, R.drawable.image6),
            ProductModel(R.string.affirmation7, R.drawable.image7),
            ProductModel(R.string.affirmation8, R.drawable.image8),



        )
    }
}








