package com.example.epomeroy.shutterdroid.shutterstock;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by epomeroy on 9/28/15.
 */
public class ShutterData {
    @SerializedName("id")
    private int id;

    @SerializedName("assets")
    private ShutterAsset asset;

    public int getId() {
        return id;
    }

    public ShutterAsset getAssets() {
        return asset;
    }
}
