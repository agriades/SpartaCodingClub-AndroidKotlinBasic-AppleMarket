package com.sparta.applemarket

data class Sale(
    val num: Int,
    val img: String,
    val title: String,
    val desc: String,
    val seller: String,
    val price: Int,
    val address: String,
    var likes: Int,
    var chat: Int
)
