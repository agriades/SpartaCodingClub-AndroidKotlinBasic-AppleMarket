package com.sparta.applemarket

data class ForSale(
    val num: Int,
    val img: Int, // 이미지 주소는 int
    val title: String,
    val desc: String,
    val seller: String,
    val price: Int,
    val address: String,
    var likes: Int,
    var chat: Int
)
