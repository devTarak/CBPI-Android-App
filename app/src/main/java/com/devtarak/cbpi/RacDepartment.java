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

public class RacDepartment extends AppCompatActivity {
    ImageView racMail1, racMail2, racMail3, racMail4,racMail5,racMail6, racCall1, racCall2, racCall3, racCall4,racCall5,racCall6;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rac_department);
        racMail1 = findViewById(R.id.racMail1);
        racMail2 = findViewById(R.id.racMail2);
        racMail3 = findViewById(R.id.racMail3);
        racMail4 = findViewById(R.id.racMail4);
        racMail5 = findViewById(R.id.racMail5);
        racMail6 = findViewById(R.id.racMail6);
        racCall1 = findViewById(R.id.racCall1);
        racCall2 = findViewById(R.id.racCall2);
        racCall3 = findViewById(R.id.racCall3);
        racCall4 = findViewById(R.id.racCall4);
        racCall5 = findViewById(R.id.racCall5);
        racCall6 = findViewById(R.id.racCall6);
        racCall1.setOnClickListener(v -> ClickRedirectrac("tel:01748045850"));
        racCall2.setOnClickListener(v -> ClickRedirectrac("tel:01845697348"));
        racCall3.setOnClickListener(v -> ClickRedirectrac("tel:01823153326"));
        racCall4.setOnClickListener(v -> ClickRedirectrac("tel:01814784600"));
        racCall5.setOnClickListener(v -> ClickRedirectrac("tel:01820191707"));
        racCall6.setOnClickListener(v -> ClickRedirectrac("tel:01723079651"));
        racMail1.setOnClickListener(v -> ClickRedirectrac(getString(R.string.defult_mail)));
        racMail2.setOnClickListener(v -> ClickRedirectrac(getString(R.string.defult_mail)));
        racMail3.setOnClickListener(v -> ClickRedirectrac(getString(R.string.defult_mail)));
        racMail4.setOnClickListener(v -> ClickRedirectrac(getString(R.string.defult_mail)));
        racMail5.setOnClickListener(v -> ClickRedirectrac(getString(R.string.defult_mail)));
        racMail6.setOnClickListener(v -> ClickRedirectrac(getString(R.string.defult_mail)));

        //mendotory for every page
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.baseline_arrow_back_ios_24);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this,R.color.Green));
        getSupportActionBar().setTitle("RAC Department");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor(getString(R.color.Green))));
    }
    public void ClickRedirectrac(String url){
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