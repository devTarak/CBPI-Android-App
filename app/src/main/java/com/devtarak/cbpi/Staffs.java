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

public class Staffs extends AppCompatActivity {
    ImageView staffMail1, staffMail2, staffMail3, staffMail4,staffMail5,staffMail6,staffMail7,staffMail8,staffMail9,staffMail10,staffMail11,staffMail12,staffMail13,staffMail14,staffMail15,staffMail16,staffMail17,staffMail18,staffMail19,staffMail20,staffMail21,staffMail22,staffMail23,staffMail24,staffMail25,staffMail26,staffMail27,staffMail28,staffMail29,staffMail30,staffMail31,staffMail32,staffMail33,staffMail34,staffMail35, staffCall1, staffCall2, staffCall3, staffCall4,staffCall5,staffCall6,staffCall7,staffCall8,staffCall9,staffCall10,staffCall11,staffCall12,staffCall13,staffCall14,staffCall15,staffCall16,staffCall17,staffCall18,staffCall19,staffCall20,staffCall21,staffCall22,staffCall23,staffCall24,staffCall25,staffCall26,staffCall27,staffCall28,staffCall29,staffCall30,staffCall31,staffCall32,staffCall33,staffCall34,staffCall35;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staffs);
        staffMail1 = findViewById(R.id.staffMail1);
        staffMail2 = findViewById(R.id.staffMail2);
        staffMail3 = findViewById(R.id.staffMail3);
        staffMail4 = findViewById(R.id.staffMail4);
        staffMail5 = findViewById(R.id.staffMail5);
        staffMail6 = findViewById(R.id.staffMail6);
        staffMail7 = findViewById(R.id.staffMail7);
        staffMail8 = findViewById(R.id.staffMail8);
        staffMail9 = findViewById(R.id.staffMail9);
        staffMail10 = findViewById(R.id.staffMail10);
        staffMail11 = findViewById(R.id.staffMail11);
        staffMail12 = findViewById(R.id.staffMail12);
        staffMail13 = findViewById(R.id.staffMail13);
        staffMail14 = findViewById(R.id.staffMail14);
        staffMail15 = findViewById(R.id.staffMail15);
        staffMail16 = findViewById(R.id.staffMail16);
        staffMail17 = findViewById(R.id.staffMail17);
        staffMail18 = findViewById(R.id.staffMail18);
        staffMail19 = findViewById(R.id.staffMail19);
        staffMail20 = findViewById(R.id.staffMail20);
        staffMail21 = findViewById(R.id.staffMail21);
        staffMail22 = findViewById(R.id.staffMail22);
        staffMail23 = findViewById(R.id.staffMail23);
        staffMail24 = findViewById(R.id.staffMail24);
        staffMail25 = findViewById(R.id.staffMail25);
        staffMail26 = findViewById(R.id.staffMail26);
        staffMail27 = findViewById(R.id.staffMail27);
        staffMail28 = findViewById(R.id.staffMail28);
        staffMail29 = findViewById(R.id.staffMail29);
        staffMail30 = findViewById(R.id.staffMail30);
        staffMail31 = findViewById(R.id.staffMail31);
        staffMail32 = findViewById(R.id.staffMail32);
        staffMail33 = findViewById(R.id.staffMail33);
        staffMail34 = findViewById(R.id.staffMail34);
        staffMail35 = findViewById(R.id.staffMail35);
        staffCall1 = findViewById(R.id.staffCall1);
        staffCall2 = findViewById(R.id.staffCall2);
        staffCall3 = findViewById(R.id.staffCall3);
        staffCall4 = findViewById(R.id.staffCall4);
        staffCall5 = findViewById(R.id.staffCall5);
        staffCall6 = findViewById(R.id.staffCall6);
        staffCall7 = findViewById(R.id.staffCall7);
        staffCall8 = findViewById(R.id.staffCall8);
        staffCall9 = findViewById(R.id.staffCall9);
        staffCall10 = findViewById(R.id.staffCall10);
        staffCall11 = findViewById(R.id.staffCall11);
        staffCall12 = findViewById(R.id.staffCall12);
        staffCall13 = findViewById(R.id.staffCall13);
        staffCall14 = findViewById(R.id.staffCall14);
        staffCall15 = findViewById(R.id.staffCall15);
        staffCall16 = findViewById(R.id.staffCall16);
        staffCall17 = findViewById(R.id.staffCall17);
        staffCall18 = findViewById(R.id.staffCall18);
        staffCall19 = findViewById(R.id.staffCall19);
        staffCall20 = findViewById(R.id.staffCall20);
        staffCall21 = findViewById(R.id.staffCall21);
        staffCall22 = findViewById(R.id.staffCall22);
        staffCall23 = findViewById(R.id.staffCall23);
        staffCall24 = findViewById(R.id.staffCall24);
        staffCall25 = findViewById(R.id.staffCall25);
        staffCall26 = findViewById(R.id.staffCall26);
        staffCall27 = findViewById(R.id.staffCall27);
        staffCall28 = findViewById(R.id.staffCall28);
        staffCall29 = findViewById(R.id.staffCall29);
        staffCall30 = findViewById(R.id.staffCall30);
        staffCall31 = findViewById(R.id.staffCall31);
        staffCall32 = findViewById(R.id.staffCall32);
        staffCall33 = findViewById(R.id.staffCall33);
        staffCall34 = findViewById(R.id.staffCall34);
        staffCall35 = findViewById(R.id.staffCall35);

        staffCall1.setOnClickListener(v -> ClickRedirectstaff("tel:01816382217"));
        staffCall2.setOnClickListener(v -> ClickRedirectstaff("tel:01812368299"));
        staffCall3.setOnClickListener(v -> ClickRedirectstaff("tel:01306276981"));
        staffCall4.setOnClickListener(v -> ClickRedirectstaff("tel:01756434228"));
        staffCall5.setOnClickListener(v -> ClickRedirectstaff("tel:01722930979"));
        staffCall6.setOnClickListener(v -> ClickRedirectstaff("tel:01722930979"));
        staffCall7.setOnClickListener(v -> ClickRedirectstaff("tel:01674475775"));
        staffCall8.setOnClickListener(v -> ClickRedirectstaff("tel:0117555930408"));
        staffCall9.setOnClickListener(v -> ClickRedirectstaff("tel:01521408861"));
        staffCall10.setOnClickListener(v -> ClickRedirectstaff("tel:01829446290"));
        staffCall11.setOnClickListener(v -> ClickRedirectstaff("tel:01813095885"));
        staffCall12.setOnClickListener(v -> ClickRedirectstaff("tel:01905242098"));
        staffCall13.setOnClickListener(v -> ClickRedirectstaff("tel:01521554266"));
        staffCall14.setOnClickListener(v -> ClickRedirectstaff("tel:01853435654"));
        staffCall15.setOnClickListener(v -> ClickRedirectstaff("tel:01741100800"));
        staffCall16.setOnClickListener(v -> ClickRedirectstaff("tel:01930858985"));
        staffCall17.setOnClickListener(v -> ClickRedirectstaff("tel:01916519959"));
        staffCall18.setOnClickListener(v -> ClickRedirectstaff("tel:01823311832"));
        staffCall19.setOnClickListener(v -> ClickRedirectstaff("tel:01965789105"));
        staffCall20.setOnClickListener(v -> ClickRedirectstaff("tel:018320643661"));
        staffCall21.setOnClickListener(v -> ClickRedirectstaff("tel:01849214461"));
        staffCall22.setOnClickListener(v -> ClickRedirectstaff("tel:01521484506"));
        staffCall23.setOnClickListener(v -> ClickRedirectstaff("tel:01538118053"));
        staffCall24.setOnClickListener(v -> ClickRedirectstaff("tel:01818308662"));
        staffCall25.setOnClickListener(v -> ClickRedirectstaff("tel:01517113273"));
        staffCall26.setOnClickListener(v -> ClickRedirectstaff("tel:01608848008"));
        staffCall27.setOnClickListener(v -> ClickRedirectstaff("tel:01720932626"));
        staffCall28.setOnClickListener(v -> ClickRedirectstaff("tel:01816130186"));
        staffCall29.setOnClickListener(v -> ClickRedirectstaff("tel:01722543623"));
        staffCall30.setOnClickListener(v -> ClickRedirectstaff("tel:01815674073"));
        staffCall31.setOnClickListener(v -> ClickRedirectstaff("tel:01813590587"));
        staffCall32.setOnClickListener(v -> ClickRedirectstaff("tel:01863882736"));
        staffCall33.setOnClickListener(v -> ClickRedirectstaff("tel:01614855325"));
        staffCall34.setOnClickListener(v -> ClickRedirectstaff("tel:01531489700"));
        staffCall35.setOnClickListener(v -> ClickRedirectstaff("tel:01861628872"));
        staffMail1.setOnClickListener(v -> ClickRedirectstaff("mailto:saifulislamcoxpoly@gmail.com"));
        staffMail2.setOnClickListener(v -> ClickRedirectstaff("mailto:mosharaf.8299@gmail.com"));
        staffMail3.setOnClickListener(v -> ClickRedirectstaff("mailto:proloyfst50@gmail.com"));
        staffMail4.setOnClickListener(v -> ClickRedirectstaff("mailto:monir228md@gmail.com"));
        staffMail5.setOnClickListener(v -> ClickRedirectstaff("mailto:roman.eee.ctg@gmail.com"));
        staffMail6.setOnClickListener(v -> ClickRedirectstaff("mailto:rezayr94@gmail.com"));
        staffMail7.setOnClickListener(v -> ClickRedirectstaff("mailto:iftakharhossain@gmail.com"));
        staffMail8.setOnClickListener(v -> ClickRedirectstaff("mailto:subha.ustc@gmail.com"));
        staffMail9.setOnClickListener(v -> ClickRedirectstaff("mailto:abdulmannan7525@gmail.com"));
        staffMail10.setOnClickListener(v -> ClickRedirectstaff("mailto:smkibria90@gmail.com"));
        staffMail11.setOnClickListener(v -> ClickRedirectstaff("mailto:noor.mohammed5885@gmail.com"));
        staffMail12.setOnClickListener(v -> ClickRedirectstaff("mailto:rahisorowar@gmail.com"));
        staffMail13.setOnClickListener(v -> ClickRedirectstaff("mailto:rakhic290@gmail.com"));
        staffMail14.setOnClickListener(v -> ClickRedirectstaff("mailto:faridfarhanche@gmail.com"));
        staffMail15.setOnClickListener(v -> ClickRedirectstaff("mailto:mafsar631@gmail.com"));
        staffMail16.setOnClickListener(v -> ClickRedirectstaff("mailto:Ipesshorif.du@gmail.com"));
        staffMail17.setOnClickListener(v -> ClickRedirectstaff("mailto:jewelparvaz94@gmail.com"));
        staffMail18.setOnClickListener(v -> ClickRedirectstaff("mailto:ku32605@gmail.com"));
        staffMail19.setOnClickListener(v -> ClickRedirectstaff("mailto:himikaetu643@gmail.com"));
        staffMail20.setOnClickListener(v -> ClickRedirectstaff("mailto:sayeda.physics@gmail.com"));
        staffMail21.setOnClickListener(v -> ClickRedirectstaff("mailto:aporajitadutta2021@gmail.com"));
        staffMail22.setOnClickListener(v -> ClickRedirectstaff("mailto:sujwncu@gmail.com"));
        staffMail23.setOnClickListener(v -> ClickRedirectstaff("mailto:saif.cox24@gmail.com"));
        staffMail24.setOnClickListener(v -> ClickRedirectstaff("mailto:rabiul.hasan164040@gmail.com"));
        staffMail25.setOnClickListener(v -> ClickRedirectstaff("mailto:tripurabijoy@gmail.com"));
        staffMail26.setOnClickListener(v -> ClickRedirectstaff("mailto:sharaf.mamico@gmail.com"));
        staffMail27.setOnClickListener(v -> ClickRedirectstaff("mailto:masud.cbpi@gmail.com"));
        staffMail28.setOnClickListener(v -> ClickRedirectstaff("mailto:nazat007@gmail.com"));
        staffMail29.setOnClickListener(v -> ClickRedirectstaff("mailto:jhirulbargunapoly@gmail.com"));
        staffMail30.setOnClickListener(v -> ClickRedirectstaff("mailto:mohammadjakaria865@gmail.com"));
        staffMail31.setOnClickListener(v -> ClickRedirectstaff("mailto:sabuj.barua.coxpoly@gmail.com"));
        staffMail32.setOnClickListener(v -> ClickRedirectstaff("mailto:sagorcox2736@gmail.com"));
        staffMail33.setOnClickListener(v -> ClickRedirectstaff(getString(R.string.defult_mail)));
        staffMail34.setOnClickListener(v -> ClickRedirectstaff("mailto:uhlamongmarma83@gmail.com"));
        staffMail35.setOnClickListener(v -> ClickRedirectstaff("mailto:triandrew2@gmail.com"));
        //mendotory for every page
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.baseline_arrow_back_ios_24);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this,R.color.Green));
        getSupportActionBar().setTitle("Staff's Details");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor(getString(R.color.Green))));
    }
    public void ClickRedirectstaff(String url){
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