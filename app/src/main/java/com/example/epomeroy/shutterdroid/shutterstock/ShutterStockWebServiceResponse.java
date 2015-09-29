package com.example.epomeroy.shutterdroid.shutterstock;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by epomeroy on 9/28/15.
 */
public class ShutterStockWebServiceResponse {
    @SerializedName("data")
    private List<ShutterData> shutterDataList;

    public List<ShutterData> getShutterDataList() {
        return shutterDataList;
    }
}
