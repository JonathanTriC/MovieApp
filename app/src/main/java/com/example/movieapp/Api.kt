package com.example.movieapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "1ab65673dbf605d36e949ab4a1cfdea5",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/top_rated")
    fun getTopRatedMovies(
        @Query("api_key") apiKey: String = "1ab65673dbf605d36e949ab4a1cfdea5",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/upcoming")
    fun getUpcomingMovies(
        @Query("api_key") apiKey: String = "1ab65673dbf605d36e949ab4a1cfdea5",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}