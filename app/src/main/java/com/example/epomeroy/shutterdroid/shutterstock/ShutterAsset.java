package com.example.epomeroy.shutterdroid.shutterstock;

import com.google.gson.annotations.SerializedName;

/**
 * Created by epomeroy on 9/29/15.
 */
public class ShutterAsset {
    @SerializedName("preview")
    ShutterImage imagePreview;
    @SerializedName("small_thumb")
    ShutterImage imageThumbNail;

    public ShutterImage getImageThumbNail() {
        return imageThumbNail;
    }

    public ShutterImage getImagePreview() {
        return imagePreview;
    }
}
