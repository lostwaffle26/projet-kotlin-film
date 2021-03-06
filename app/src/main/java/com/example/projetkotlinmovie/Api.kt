package com.example.projetkotlinmovie

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "dac2c564903a3edd05bef80f7b5175fd",
        @Query("language") lang: String = "fr-FR",
        @Query("page") page: Int,
        @Query("region") region: String = "FR"
    ): Call<GetMoviesResponse>

    @GET("movie/top_rated")
    fun getTopRatedMovies(
            @Query("api_key") apiKey: String = "dac2c564903a3edd05bef80f7b5175fd",
            @Query("language") lang: String = "fr-FR",
            @Query("page") page: Int,
            @Query("region") region: String = "FR"
    ): Call<GetMoviesResponse>
}