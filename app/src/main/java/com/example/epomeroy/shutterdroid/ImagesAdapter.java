package com.example.epomeroy.shutterdroid;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.epomeroy.shutterdroid.shutterstock.ShutterData;
import com.example.epomeroy.shutterdroid.shutterstock.ShutterImage;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by epomeroy on 10/3/15.
 */

public class ImagesAdapter extends RecyclerView.Adapter<ImagesAdapter.ViewHolder> {

    private final Context context;
    private final List<ShutterData> shutterData;

    public ImagesAdapter(Context c, List<ShutterData> data) {
        this.context = c;
        this.shutterData = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_cell, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ShutterImage img = shutterData.get(position).getAssets().getImageThumbNail();
        Picasso.with(context).load(img.getImageUrl()).into((ImageView) holder.imageView);
    }

    @Override
    public int getItemCount() {
        return shutterData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private final String TAG = ViewHolder.class.getName();
        private final View imageView;

        public ViewHolder(View itemView) {
            super(itemView);

            this.imageView = itemView.findViewById(R.id.image_thumbnail);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Log.d(TAG, "Image Clicked");
        }
    }
}
