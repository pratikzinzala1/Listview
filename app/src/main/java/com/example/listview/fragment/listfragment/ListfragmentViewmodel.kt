package com.example.listview.fragment.listfragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.listview.data.Datasource
import com.example.listview.data.model.ProductModel

class ListfragmentViewmodel:ViewModel() {


    private val _productlist = MutableLiveData<List<ProductModel>>()
    val productlist:LiveData<List<ProductModel>> = _productlist

    init {
        getProductData()
    }

    private fun getProductData(){
       _productlist.value =  Datasource().loadProductModel()
    }




}