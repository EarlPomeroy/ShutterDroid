package com.example.epomeroy.shutterdroid.shutterstock;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by epomeroy on 9/28/15.
 */
public interface ShutterStockService {
    @GET("/images/search")
    void searchImages(@Query("query") String query, Callback<ShutterStockWebServiceResponse> callback);

    @GET("/images/search")
    void getRecentImages(Callback<ShutterStockWebServiceResponse> callback);
}
