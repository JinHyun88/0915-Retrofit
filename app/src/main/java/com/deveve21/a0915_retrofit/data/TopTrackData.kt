package com.deveve21.a0915_retrofit.data


import com.google.gson.annotations.SerializedName

data class TopTrackData(
    @SerializedName("tracks")
    val tracks: Tracks
)