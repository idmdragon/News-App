package com.example.mynews.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.mynews.R
import com.example.mynews.db.ArticleDatabase
import com.example.mynews.repository.NewsRepository
import kotlinx.android.synthetic.main.activity_news.*

class NewsActivity : AppCompatActivity() {

    lateinit var viewModel: NewsViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        val newsRepository = NewsRepository(ArticleDatabase(this))
        val viewModelProviderRepository = NewsViewModelProviderRepository(newsRepository)
        viewModel = ViewModelProvider(this,viewModelProviderRepository).get(NewsViewModel::class.java)
        bottomNavigation.setupWithNavController(newsNavHostFragment.findNavController())


    }
}