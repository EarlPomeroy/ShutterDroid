package com.example.epomeroy.shutterdroid.shutterstock;

import android.util.Base64;

import retrofit.RequestInterceptor;
import retrofit.RestAdapter;

/**
 * Created by epomeroy on 9/27/15.
 */
public class ShutterStock {
    private static final String API_URL = "https://api.shutterstock.com/v2";

    private static final RestAdapter REST_ADAPTER = new RestAdapter.Builder()
            .setEndpoint(API_URL)
            .setRequestInterceptor(new RequestInterceptor() {
                @Override
                public void intercept(RequestFacade request) {
                    String authInfo = "55f271c64b44428f9528:e7e6ff764c4e5eb90cec4b8378c900238e7485cb";
                    String auth = "Basic " + Base64.encodeToString(authInfo.getBytes(), Base64.NO_WRAP);
                    request.addHeader("Authorization", auth);
                }
            })
            .build();

    private static final ShutterStockService SERVICE = REST_ADAPTER.create(ShutterStockService.class);

    public static ShutterStockService getService() {
        return SERVICE;
    }
}
