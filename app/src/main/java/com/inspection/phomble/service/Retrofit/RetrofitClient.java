package com.inspection.phomble.service.Retrofit;

import static com.inspection.phomble.service.Constants.BASE_API;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitClient {

    private static RetrofitClient singleton = null;
    private API api;

    public RetrofitClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_API)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        api = retrofit.create(API.class);
    }

    public static synchronized RetrofitClient getSingleton() {
        if( singleton == null) {
            singleton = new RetrofitClient();
        }
        return singleton;
    }

    public API getApi() {
        return api;
    }
}
