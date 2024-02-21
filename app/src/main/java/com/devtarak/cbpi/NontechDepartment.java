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

public class NontechDepartment extends AppCompatActivity {
    ImageView nontecMail1, nontecMail2, nontecMail3, nontecMail4,nontecMail5,nontecMail6,nontecMail7,nontecMail8,nontecMail9, nontecCall1, nontecCall2, nontecCall3, nontecCall4,nontecCall5,nontecCall6,nontecCall7,nontecCall8,nontecCall9;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nontech_department);
        nontecMail1 = findViewById(R.id.nontecMail1);
        nontecMail2 = findViewById(R.id.nontecMail2);
        nontecMail3 = findViewById(R.id.nontecMail3);
        nontecMail4 = findViewById(R.id.nontecMail4);
        nontecMail5 = findViewById(R.id.nontecMail5);
        nontecMail6 = findViewById(R.id.nontecMail6);
        nontecMail7 = findViewById(R.id.nontecMail7);
        nontecMail8 = findViewById(R.id.nontecMail8);
        nontecMail9 = findViewById(R.id.nontecMail9);
        nontecCall1 = findViewById(R.id.nontecCall1);
        nontecCall2 = findViewById(R.id.nontecCall2);
        nontecCall3 = findViewById(R.id.nontecCall3);
        nontecCall4 = findViewById(R.id.nontecCall4);
        nontecCall5 = findViewById(R.id.nontecCall5);
        nontecCall6 = findViewById(R.id.nontecCall6);
        nontecCall7 = findViewById(R.id.nontecCall7);
        nontecCall8 = findViewById(R.id.nontecCall8);
        nontecCall9 = findViewById(R.id.nontecCall9);
        nontecCall1.setOnClickListener(v -> ClickRedirectnontec("tel:01997155988"));
        nontecCall2.setOnClickListener(v -> ClickRedirectnontec("tel:01948304050"));
        nontecCall3.setOnClickListener(v -> ClickRedirectnontec("tel:01818380309"));
        nontecCall4.setOnClickListener(v -> ClickRedirectnontec("tel:01933435258"));
        nontecCall5.setOnClickListener(v -> ClickRedirectnontec("tel:01835560087"));
        nontecCall6.setOnClickListener(v -> ClickRedirectnontec("tel:01734048169"));
        nontecCall7.setOnClickListener(v -> ClickRedirectnontec("tel:01734598154"));
        nontecCall8.setOnClickListener(v -> ClickRedirectnontec("tel:01737322532"));
        nontecCall9.setOnClickListener(v -> ClickRedirectnontec("tel:01737191044"));
        nontecMail1.setOnClickListener(v -> ClickRedirectnontec(getString(R.string.defult_mail)));
        nontecMail2.setOnClickListener(v -> ClickRedirectnontec(getString(R.string.defult_mail)));
        nontecMail3.setOnClickListener(v -> ClickRedirectnontec(getString(R.string.defult_mail)));
        nontecMail4.setOnClickListener(v -> ClickRedirectnontec("mailto:harunbba19@gmail.com"));
        nontecMail5.setOnClickListener(v -> ClickRedirectnontec("mailto:miftah0087@gmail.com"));
        nontecMail6.setOnClickListener(v -> ClickRedirectnontec(getString(R.string.defult_mail)));
        nontecMail7.setOnClickListener(v -> ClickRedirectnontec("mailto:aalim7107@gmail.com"));
        nontecMail8.setOnClickListener(v -> ClickRedirectnontec("mailto:mamunurrashidmamun3225@gmail.com"));
        nontecMail9.setOnClickListener(v -> ClickRedirectnontec("mailto:ma.motin.writer@gmail.com"));

        //mendotory for every page
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.baseline_arrow_back_ios_24);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this,R.color.Green));
        getSupportActionBar().setTitle("Non-Tech Department");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor(getString(R.color.Green))));
    }
    public void ClickRedirectnontec(String url){
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