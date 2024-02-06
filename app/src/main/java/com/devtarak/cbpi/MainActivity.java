package com.devtarak.cbpi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LinearLayout heroabout;
    LinearLayout heroteacher;
    LinearLayout herogallary;
    LinearLayout herostaffs;
    LinearLayout heronotice;
    LinearLayout herosupport;
    LinearLayout herojob;
    LinearLayout herobteb;
    LinearLayout heroTeam;
    LinearLayout heroMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        heroabout = findViewById(R.id.heroabout);
        heroteacher = findViewById(R.id.heroteacher);
        herogallary = findViewById(R.id.herogallary);
        herostaffs = findViewById(R.id.herostaffs);
        heronotice = findViewById(R.id.heronotice);
        herosupport = findViewById(R.id.herosupport);
        herojob = findViewById(R.id.herojob);
        herobteb = findViewById(R.id.herobteb);
        heroTeam = findViewById(R.id.heroTeam);
        heroMap = findViewById(R.id.heroMap);
        heroMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntenthel = new Intent(MainActivity.this,Location.class);
                startActivity(myIntenthel);
            }
        });
        heroTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntenthel = new Intent(MainActivity.this,Team.class);
                startActivity(myIntenthel);
            }
        });
        herobteb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickRedirect(getString(R.string.Bteb_notice));
            }
        });
        herojob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickRedirect(getString(R.string.Job_Tab));
            }
        });
        herosupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntenthel = new Intent(MainActivity.this,HelpLine.class);
                startActivity(myIntenthel);
            }
        });
        heronotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntentNot = new Intent(MainActivity.this,CollegeNotice.class);
                startActivity(myIntentNot);
            }
        });
        herostaffs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntentSta = new Intent(MainActivity.this,Staffs.class);
                startActivity(myIntentSta);
            }
        });
        herogallary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntentGal = new Intent(MainActivity.this,Gallery.class);
                startActivity(myIntentGal);
            }
        });
        heroteacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntenttea = new Intent(MainActivity.this,Teachers.class);
                startActivity(myIntenttea);
            }
        });
        heroabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,About.class);
                startActivity(myIntent);
            }
        });
        getWindow().setNavigationBarColor(ContextCompat.getColor(this,R.color.Green));
        getSupportActionBar().setTitle("Home");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#609513")));

        ImageSlider imageSlider;


        imageSlider =findViewById(R.id.image_slider);

        ArrayList<SlideModel> imageList = new ArrayList<>();


        imageList.add(new SlideModel(R.drawable.img1, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.img2,ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.img3,ScaleTypes.FIT));

        imageSlider.setImageList(imageList);

    }
    public void ClickRedirect(String url){
        Intent intenturl = new Intent(Intent.ACTION_VIEW);
        intenturl.setData(Uri.parse(url));
        startActivity(intenturl);

    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();

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