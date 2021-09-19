package com.deveve21.a0915_retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServerClient {

    private const val baseUrl = "https://ws.audioscrobbler.com/"
    private var instance : Retrofit? = null

    fun getServerInterface() : ServerInterface = getInstance().create(ServerInterface::class.java)

    private fun getInstance() : Retrofit {
        if(instance == null){
            instance = Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return instance!!
    }



}