package com.example.login0310.lst_peliculas.model.entities;


import retrofit2.Call;
import retrofit2.http.GET;

public interface MoviesAPI {

    @GET("movie/popular?api_key=TU_API_KEY")
    Call<MovieResponse> getPopularMovies();
}


