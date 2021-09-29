package com.rajibroy.technovotest.repository;

import android.security.identity.AccessControlProfileId;
import android.util.Log;

import com.rajibroy.technovotest.application.Executor;
import com.rajibroy.technovotest.model.ResponseObject;
import com.rajibroy.technovotest.utils.Utils;


import java.util.List;

import androidx.lifecycle.MutableLiveData;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class Repository {

    String TAG = "MATMATTAM";

    private static final Repository repository = new Repository();

    private Repository(){

    }

    private Api getApi() {
        ServiceHolder myServiceHolder = new ServiceHolder();
        Retrofit retrofit = getRetrofit(myServiceHolder);
        Api api = retrofit.create(Api.class);
        myServiceHolder.set(api);
        return api;
    }

    private Retrofit getRetrofit(ServiceHolder myServiceHolder) {
        OkHttpClient okHttpClient = new OkHttpClientInstance.Builder(myServiceHolder).build();

        return new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
    }

    public static Repository getInstance() {
        return repository;
    }

    public void getValue(MutableLiveData<List<ResponseObject>> mutableLiveData){
        Executor.execute(()->{
            Api api = getApi();
            Call<List<ResponseObject> > call  = api.getList();

            call.enqueue(new Callback<List<ResponseObject>>() {

                @Override
                public void onResponse(Call<List<ResponseObject>> call, Response<List<ResponseObject>> response) {
                    Log.d("TAG", "onResponse: " + "here" + response.code());
                    mutableLiveData.postValue(response.body());
                }

                @Override
                public void onFailure(Call<List<ResponseObject>> call, Throwable t) {
                    Log.d("TAG", "onFailure: ");
                }
            });
        });
    }


    public void getOneObject(String value, MutableLiveData<ResponseObject> mutableLiveData) {
        Executor.execute(()->{
            Api api = getApi();
            Call<ResponseObject> call = api.getObject(value);
            call.enqueue(new Callback<ResponseObject>() {
                @Override
                public void onResponse(Call<ResponseObject> call, Response<ResponseObject> response) {
                    Log.d(TAG, "onResponse: " + response.code());
                    Log.d(TAG, "onResponse: " + response.body().toString());
                    mutableLiveData.postValue(response.body());
                }

                @Override
                public void onFailure(Call<ResponseObject> call, Throwable t) {

                }
            });
        });
    }

    public void setOneObject(String value, ResponseObject responseObject, MutableLiveData<com.rajibroy.technovotest.model.Response> responseMutableLiveData) {
        Executor.execute(()->{
            Api api = getApi();
            Call<Void> call = api.setObject(Utils.getTokensMap(), value, responseObject);
            call.enqueue(new Callback<Void>() {
                @Override
                public void onResponse(Call<Void> call, Response<Void> response) {
                    Log.d(TAG, "onResponse: PATCH" + response.code());
                    //Log.d(TAG, "onResponse: PATCH" + response.body().toString());
                    com.rajibroy.technovotest.model.Response response1 = new com.rajibroy.technovotest.model.Response(response.code());
                    responseMutableLiveData.postValue(response1);
                }

                @Override
                public void onFailure(Call<Void> call, Throwable t) {
                    Log.d(TAG, "onFailure: "+ t);
                }
            });
        });
    }
}
