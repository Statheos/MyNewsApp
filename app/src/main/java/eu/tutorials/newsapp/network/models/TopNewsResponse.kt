package eu.tutorials.newsapp.network.models

data class TopNewsResponse(val status : String? = null,
                           val totalResults : Int? = null,
                           val articles : List<TopNewsArticle>? = null)
