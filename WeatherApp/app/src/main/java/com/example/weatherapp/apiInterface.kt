package com.example.weatherapp

import retrofit.Call
import retrofit.http.GET
import retrofit.http.Query


interface apiInterface {
    @GET("weather")
    fun getWeatherData(
        @Query("q") city: String,
        @Query("appid") appid: String,
        @Query("units") units: String
    ): Call<WeatherApp>
}