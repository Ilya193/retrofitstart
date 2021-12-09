package com.example.retrofitstart

import com.example.retrofitstart.api.CatJson
import retrofit2.Call
import retrofit2.http.GET

interface ApiRequests {
    @GET("/facts/random")
    fun getCatFacts(): Call<CatJson>
}