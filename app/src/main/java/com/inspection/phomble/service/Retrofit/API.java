package com.inspection.phomble.service.Retrofit;

import com.inspection.phomble.response.UnsplashResponse.UnsplashResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface API {

    @GET("/photos/random")
    Call<UnsplashResponse> getRandomPhotoObject(@Query("client_id") String key);
}
