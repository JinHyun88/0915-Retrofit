package com.deveve21.a0915_retrofit.data


import com.google.gson.annotations.SerializedName

data class Tracks(
    @SerializedName("@attr")
    val attr: Attr,
    @SerializedName("track")
    val track: List<Track>
)