package com.devtarak.cbpi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.GridView;

import java.util.ArrayList;

public class ImageAdapter extends ArrayAdapter<Integer> {

    private Context mContext;

    public ImageAdapter(Context context, ArrayList<Integer> imageList) {
        super(context, 0, imageList);
        mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(
                    dpToPx(100), // 10dp
                    dpToPx(100))); // 10dp
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            imageView = (ImageView) convertView;
        }

        // Load the image into the ImageView
        imageView.setImageResource(getItem(position));

        return imageView;
    }

    private int dpToPx(int dp) {
        float density = mContext.getResources().getDisplayMetrics().density;
        return Math.round(dp * density);
    }
}