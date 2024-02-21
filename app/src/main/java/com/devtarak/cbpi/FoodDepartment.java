package com.devtarak.cbpi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;

public class FoodDepartment extends AppCompatActivity {
    ImageView foodMail1, foodMail2, foodMail3, foodMail4,foodMail5,foodMail6, foodCall1, foodCall2, foodCall3, foodCall4,foodCall5,foodCall6;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_department);
        foodMail1 = findViewById(R.id.foodMail1);
        foodMail2 = findViewById(R.id.foodMail2);
        foodMail3 = findViewById(R.id.foodMail3);
        foodMail4 = findViewById(R.id.foodMail4);
        foodMail5 = findViewById(R.id.foodMail5);
        foodMail6 = findViewById(R.id.foodMail6);
        foodCall1 = findViewById(R.id.foodCall1);
        foodCall2 = findViewById(R.id.foodCall2);
        foodCall3 = findViewById(R.id.foodCall3);
        foodCall4 = findViewById(R.id.foodCall4);
        foodCall5 = findViewById(R.id.foodCall5);
        foodCall6 = findViewById(R.id.foodCall6);
        foodCall1.setOnClickListener(v -> ClickRedirectfood("tel:01737918900"));
        foodCall2.setOnClickListener(v -> ClickRedirectfood("tel:01934210356"));
        foodCall3.setOnClickListener(v -> ClickRedirectfood("tel:01925244234"));
        foodCall4.setOnClickListener(v -> ClickRedirectfood("tel:01723789744"));
        foodCall5.setOnClickListener(v -> ClickRedirectfood("tel:01840013761"));
        foodCall6.setOnClickListener(v -> ClickRedirectfood("tel:01828700803"));
        foodMail1.setOnClickListener(v -> ClickRedirectfood("mailto:selimreza.just@gmail.com"));
        foodMail2.setOnClickListener(v -> ClickRedirectfood(getString(R.string.defult_mail)));
        foodMail3.setOnClickListener(v -> ClickRedirectfood(getString(R.string.defult_mail)));
        foodMail4.setOnClickListener(v -> ClickRedirectfood("mailto:sarower.008@gmail.com"));
        foodMail5.setOnClickListener(v -> ClickRedirectfood(getString(R.string.defult_mail)));
        foodMail6.setOnClickListener(v -> ClickRedirectfood("mailto:nasaruddinft@gmail.com"));

        //mendotory for every page
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.baseline_arrow_back_ios_24);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this,R.color.Green));
        getSupportActionBar().setTitle("Food Department");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor(getString(R.color.Green))));
    }
    public void ClickRedirectfood(String url){
        Intent intenturl = new Intent(Intent.ACTION_VIEW);
        intenturl.setData(Uri.parse(url));
        startActivity(intenturl);

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