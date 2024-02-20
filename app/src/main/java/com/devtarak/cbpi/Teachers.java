package com.devtarak.cbpi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class Teachers extends AppCompatActivity {
    LinearLayout nontech, electrical, food,  rac, civil, computer, principle;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachers);
        principle=findViewById(R.id.principle);
        computer = findViewById(R.id.computer);
        civil = findViewById(R.id.civil);
        rac = findViewById(R.id.rac);
        food = findViewById(R.id.food);
        electrical = findViewById(R.id.electrical);
        nontech = findViewById(R.id.nontech);
        nontech.setOnClickListener(v -> {
            Intent myIntenthelNon = new Intent(Teachers.this,NontechDepartment.class);
            startActivity(myIntenthelNon);
        });
        electrical.setOnClickListener(v -> {
            Intent myIntenthelEle = new Intent(Teachers.this,ElectricalDepartment.class);
            startActivity(myIntenthelEle);
        });
        food.setOnClickListener(v -> {
            Intent myIntenthelfood = new Intent(Teachers.this,FoodDepartment.class);
            startActivity(myIntenthelfood);
        });
        rac.setOnClickListener(v -> {
            Intent myIntenthelRac = new Intent(Teachers.this,RacDepartment.class);
            startActivity(myIntenthelRac);
        });
        civil.setOnClickListener(v -> {
            Intent myIntenthelCiv = new Intent(Teachers.this,CivilDepartment.class);
            startActivity(myIntenthelCiv);
        });
        computer.setOnClickListener(v -> {
            Intent myIntenthelCom = new Intent(Teachers.this,ComputerDepartment.class);
            startActivity(myIntenthelCom);
        });
        principle.setOnClickListener(v -> {
            Intent myIntenthelPrin = new Intent(Teachers.this,Principal.class);
            startActivity(myIntenthelPrin);
        });

        //mendotory for every page
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.baseline_arrow_back_ios_24);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this,R.color.Green));
        getSupportActionBar().setTitle("Teacher's Details");
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