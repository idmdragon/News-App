package com.example.mynews.ui

import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.mynews.R
import kotlinx.android.synthetic.main.fragment_articel.*

class ArticelFragment : Fragment(R.layout.fragment_articel) {

    val args : ArticelFragmentArgs by navArgs()

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel

        val article = args.article
        webView.apply{
            webViewClient = WebViewClient()
            loadUrl(article.url)
        }


    }

}