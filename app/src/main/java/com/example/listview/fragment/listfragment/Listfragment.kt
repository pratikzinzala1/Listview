package com.example.listview.fragment.listfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listview.R
import com.example.listview.adapter.ItemAdapter
import com.example.listview.data.Datasource
import com.example.listview.databinding.FragmentListfragmentBinding


class listfragment : Fragment() {

    private var _binding: FragmentListfragmentBinding? = null
    private val binding
        get() = _binding
    private val viewmodel: ListfragmentViewmodel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListfragmentBinding.inflate(inflater, container, false)
        _binding!!.viewModel = viewmodel
        binding!!.recyclerview.adapter = ItemAdapter(requireContext(),
            findNavController())


        return _binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }


}