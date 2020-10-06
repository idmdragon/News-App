package com.example.mynews.ui

import androidx.lifecycle.ViewModel
import com.example.mynews.repository.NewsRepository

class NewsViewModel(
    val newsRepository : NewsRepository
) : ViewModel(){

}