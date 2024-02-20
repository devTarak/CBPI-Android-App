package com.devtarak.cbpi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;

import com.facebook.shimmer.ShimmerFrameLayout;

import java.util.ArrayList;

public class Gallery extends AppCompatActivity {
    private GridView gridView;
    private ArrayList<Integer> imageList;
    ShimmerFrameLayout mainGalleryPlace;
    LinearLayout mainGalleryField;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        mainGalleryPlace = findViewById(R.id.mainGalleryPlace);
        mainGalleryField = findViewById(R.id.mainGalleryField);
        mainGalleryField.setVisibility(View.INVISIBLE);
        mainGalleryPlace.startShimmerAnimation();
        Handler handler = new Handler();
        handler.postDelayed(()->{
            mainGalleryField.setVisibility(View.VISIBLE);
            mainGalleryPlace.stopShimmerAnimation();
            mainGalleryPlace.setVisibility(View.INVISIBLE);
        },5000);

        gridView = findViewById(R.id.myGrid);

        imageList = new ArrayList<>();
        imageList.add(R.drawable.imggel1);
        imageList.add(R.drawable.imggel2);
        imageList.add(R.drawable.imggel3);
        imageList.add(R.drawable.imggel4);
        imageList.add(R.drawable.imggel6);
        imageList.add(R.drawable.imggel9);
        imageList.add(R.drawable.imggel10);
        imageList.add(R.drawable.imggel11);
        imageList.add(R.drawable.slider2);

        // Add more images as needed

        ImageAdapter adapter = new ImageAdapter(this, imageList);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Gallery.this, ImagePreviewActivity.class);
                intent.putExtra("imageResourceId", imageList.get(position));
                startActivity(intent);
            }
        });

        //mendotory for every page
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.baseline_arrow_back_ios_24);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this,R.color.Green));
        getSupportActionBar().setTitle("Institute Gallery");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor(getString(R.color.Green))));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.new_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();

        if (itemId == R.id.menItem1) {
            // Share option
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Get CBPI Official Application");
            shareIntent.putExtra(Intent.EXTRA_TEXT, getString(R.string.app_share));
            startActivity(Intent.createChooser(shareIntent, "Share via"));
            return true;

        } else if (itemId == R.id.menItem2) {
            // Team option
            Intent teamIntent = new Intent(this, Team.class);
            startActivity(teamIntent);
            return true;

        }else if (itemId == R.id.menuItem3) {
            // Team option
            Intent versionIntent = new Intent(this, version.class);
            startActivity(versionIntent);
            return true;

        } else {
            // Handle other menu items if needed
            return super.onOptionsItemSelected(item);
        }
    }
}