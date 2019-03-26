package com.tmassignment2.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;


import com.tmassignment2.model.InformationResponse;
import com.tmassignment2.remote.APIService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Sumedha Vats on 26-03-2019.
 */
public class InformationViewModel extends ViewModel {

    private MutableLiveData<InformationResponse> infoList;

    public LiveData<InformationResponse> getInfo() {
        if (infoList == null) {
            infoList = new MutableLiveData<InformationResponse>();
            loadInfo();
        }

        return infoList;
    }


    //This method is using Retrofit to get the JSON data from URL
    private void loadInfo() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(APIService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        APIService api = retrofit.create(APIService.class);
        Call<InformationResponse> call = api.getApiInformation();


        call.enqueue(new Callback<InformationResponse>() {
            @Override
            public void onResponse(Call<InformationResponse> call, Response<InformationResponse> response) {
                infoList.setValue(response.body());
            }

            @Override
            public void onFailure(Call<InformationResponse> call, Throwable t) {

            }
        });
    }
}
