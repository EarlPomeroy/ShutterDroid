package com.example.epomeroy.shutterdroid.shutterstock;

import com.google.gson.annotations.SerializedName;

/**
 * Created by epomeroy on 9/29/15.
 */
public class ShutterImage {
    @SerializedName("url")
    private String imageUrl;

    public String getImageUrl() {
        return imageUrl;
    }
}
