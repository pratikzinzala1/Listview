package com.example.listview.fragment

import android.os.Bundle
import android.transition.*
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.LinearInterpolator
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listview.R
import com.example.listview.adapter.ItemAdapter
import com.example.listview.data.Datasource


class listfragment : Fragment() {

    var recyclerview: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_listfragment, container, false)
        recyclerview = view.findViewById(R.id.recyclerview)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        val myDataset = Datasource().loadAffirmations()
        val layoutManager = LinearLayoutManager(context)
        recyclerview!!.layoutManager = layoutManager
        recyclerview!!.adapter = ItemAdapter(requireContext(),
            myDataset, findNavController())
        recyclerview.apply {
            postponeEnterTransition()
            this!!.viewTreeObserver
                .addOnPreDrawListener {
                    startPostponedEnterTransition()
                    true
                }
        }
        recyclerview!!.setHasFixedSize(true)
    }


}