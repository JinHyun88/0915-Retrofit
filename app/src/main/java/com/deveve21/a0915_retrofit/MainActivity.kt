package com.deveve21.a0915_retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.deveve21.a0915_retrofit.data.TopTrackData
import com.deveve21.a0915_retrofit.data.Track
import com.deveve21.a0915_retrofit.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        val call : Call<TopTrackData> = ServerClient.getServerInterface().getTrack("chart.gettoptracks","563f17153e9c60240d5e29bb1a508549", "json")


        call.enqueue(object : Callback<TopTrackData>{
            override fun onResponse(call: Call<TopTrackData>, response: Response<TopTrackData>) {
                if(response.isSuccessful) {
                    val topTrackData : TopTrackData = response.body()!!


                    binding.recycler.adapter = MainAdapter(topTrackData.tracks.track)


                }
            }

            override fun onFailure(call: Call<TopTrackData>, t: Throwable) {
                t.printStackTrace()
            }

        })
    }
}