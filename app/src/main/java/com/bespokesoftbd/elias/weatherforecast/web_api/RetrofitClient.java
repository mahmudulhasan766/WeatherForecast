package com.bespokesoftbd.elias.weatherforecast.web_api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    public static Retrofit getRetrofitClient(){
       return new Retrofit.Builder()
                .baseUrl("http://api.wunderground.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

}
