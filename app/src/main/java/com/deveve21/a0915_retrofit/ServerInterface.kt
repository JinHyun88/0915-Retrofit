package com.deveve21.a0915_retrofit

import com.deveve21.a0915_retrofit.data.Artist
import com.deveve21.a0915_retrofit.data.TopTrackData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ServerInterface {
    @GET("/2.0/")
    fun getTrack(@Query("method") method : String,
                 @Query("api_key") api_key : String,
                 @Query("format") format : String) : Call<TopTrackData>
}