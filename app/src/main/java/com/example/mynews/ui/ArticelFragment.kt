package com.example.mynews.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.mynews.R

class ArticelFragment : Fragment(R.layout.fragment_articel) {

    lateinit var viewModel: NewsViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
    }

}