package com.rajibroy.technovotest.repository;

import com.rajibroy.technovotest.model.ResponseObject;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.PATCH;
import retrofit2.http.Path;


public interface Api {

    String BASE_URL = "https://labapi.yuma-technology.co.uk:8443";

    @GET("/delivery/product/")
    Call<List<ResponseObject>> getList();

    @GET("/delivery/product/{product_uuid}")
    Call<ResponseObject> getObject(@Path("product_uuid") String product_uuid);

    @PATCH("/delivery/product/{product_uuid}")
    Call<Void> setObject(@HeaderMap Map<String, String> headers, @Path("product_uuid") String product_uuid,
                                   @Body ResponseObject responseObject);

}
