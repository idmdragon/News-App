package com.example.mynews.network

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)