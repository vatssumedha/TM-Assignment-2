package com.tmassignment2.remote;


import com.tmassignment2.model.InformationResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Sumedha Vats on 26-03-2019.
 */
public interface APIService {
    String BASE_URL = "https://alpha.deltaapp.in";

    @GET("/api/v2/meta/data")
    Call<InformationResponse> getApiInformation();

}
