package com.devtarak.cbpi;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class TeacherScheduleMain extends AppCompatActivity {
    private EditText teacherNameInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_schedule_main);

        teacherNameInput = findViewById(R.id.teacherNameInput);

        //mendotory for every page
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.baseline_arrow_back_ios_24);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this,R.color.Green));
        getSupportActionBar().setTitle("Class Finder");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#609513")));
    }

    public void showSchedule(View view) {
        String teacherName = teacherNameInput.getText().toString().trim();
        Intent intent = new Intent(this, ScheduleDisplayActivity.class);
        intent.putExtra("teacherName", teacherName);
        startActivity(intent);
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
