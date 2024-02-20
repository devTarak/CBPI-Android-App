package com.devtarak.cbpi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class ComputerDepartment extends AppCompatActivity {
    ImageView cmtMail1, cmtMail2, cmtMail3, cmtMail4,cmtCall1, cmtCall2, cmtCall3, cmtCall4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_department);
        cmtMail1 = findViewById(R.id.cmtMail1);
        cmtMail2 = findViewById(R.id.cmtMail2);
        cmtMail3 = findViewById(R.id.cmtMail3);
        cmtMail4 = findViewById(R.id.cmtMail4);
        cmtCall1 = findViewById(R.id.cmtCall1);
        cmtCall2 = findViewById(R.id.cmtCall2);
        cmtCall3 = findViewById(R.id.cmtCall3);
        cmtCall4 = findViewById(R.id.cmtCall4);
        cmtCall1.setOnClickListener(v -> ClickRedirectCst("tel:+8801962823150"));
        cmtCall2.setOnClickListener(v -> ClickRedirectCst("tel:+8801719508316"));
        cmtCall3.setOnClickListener(v -> ClickRedirectCst("tel:+8801721153960"));
        cmtCall4.setOnClickListener(v -> ClickRedirectCst("tel:+8801868672498"));
        cmtMail1.setOnClickListener(v -> ClickRedirectCst("mailto:pravas.kanti.dey@gmail.com"));
        cmtMail2.setOnClickListener(v -> ClickRedirectCst("mailto:mrana130@gmail.com"));
        cmtMail3.setOnClickListener(v -> ClickRedirectCst("mailto:coxpoly2@gmail.com"));
        cmtMail4.setOnClickListener(v -> ClickRedirectCst("mailto:sarif914101@gmail.com"));

        //mendotory for every page
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.baseline_arrow_back_ios_24);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this,R.color.Green));
        getSupportActionBar().setTitle("Computer Department");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#609513")));
    }
    public void ClickRedirectCst(String url){
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