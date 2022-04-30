package com.yusufemirhanarslan.retrofitkotlin.service

import com.yusufemirhanarslan.retrofitkotlin.model.CryptoModel
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET
import java.util.*

interface CryptoAPI {

    //GET , POST, UPDATE , DELETE

    //API Server URL = https://api.nomics.com/v1/
    // prices?key=06af6976909c20c09aefad97dc5c0dcdd1a5e191

    //https://raw.githubusercontent.com/
    // atilsamancioglu/K21-JSONDataSet/master/crypto.json

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    fun getData(): Observable<List<CryptoModel>>

    //fun getData(): Call<List<CryptoModel>>


}