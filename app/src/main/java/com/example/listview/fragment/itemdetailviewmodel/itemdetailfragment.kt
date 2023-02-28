package com.example.listview.fragment.itemdetailviewmodel

import android.os.Bundle
import android.transition.TransitionInflater
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.res.ColorStateListInflaterCompat.inflate
import com.example.listview.R
import com.example.listview.databinding.ActivityMainBinding.inflate
import com.example.listview.databinding.FragmentItemdetailfragmentBinding
import java.util.zip.Inflater


class itemdetailfragment : Fragment() {


    private var _binding: FragmentItemdetailfragmentBinding? = null
    private val binding
        get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentItemdetailfragmentBinding.inflate(inflater,container,false)
        return _binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding!!.productImage.transitionName = requireArguments().getStringArray("sharedelement")!![0]
        binding!!.productName.transitionName = requireArguments().getStringArray("sharedelement")!![1]
        binding!!.productPrice.transitionName = requireArguments().getStringArray("sharedelement")!![2]
        binding!!.productDescription.transitionName = requireArguments().getStringArray("sharedelement")!![3]

        val animation = TransitionInflater.from(requireContext()).inflateTransition(
            android.R.transition.move
        )
        sharedElementEnterTransition = animation
        sharedElementReturnTransition = animation

    }

}