package com.yusufemirhanarslan.retrofitkotlin.model

import com.google.gson.annotations.SerializedName

data class CryptoModel(
    //@SerializedName("currency")
    val currency: String,
    //@SerializedName("price")
    val price : String)

//Gelecek verideki değerlerle aynı değişken isimleri oluşturduğumuz için yazmaya gerek yok.