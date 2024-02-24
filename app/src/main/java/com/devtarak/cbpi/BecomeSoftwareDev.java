package com.devtarak.cbpi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class BecomeSoftwareDev extends AppCompatActivity {
    TextView textSoftdevShow;
    String TextMainHn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_become_software_dev);
        TextMainHn = "<b>প্রাথমিক ধাপ:</b>\n" +
                "<ul>\n" +
                "    <li>আগ্রহ ও দক্ষতা চিহ্নিতকরণ:\n" +
                "        <ul>\n" +
                "            <li><b>আপনার আগ্রহ আছে কিনা বোঝার জন্য:</b>\n" +
                "                <ul>\n" +
                "                    <Li>কোনো সমস্যা দেখে মাথা খাটান এবং সমাধানের চেষ্টা করেন কি? </Li>\n" +
                "                    <li>লজিক্যাল ধাঁধা বা গেমস উপভোগ করেন? </li>\n" +
                "                    <li>নতুন টেকনোলজি সম্পর্কে জানতে আগ্রহী হন?</li>\n" +
                "                </ul>\n" +
                "            <li><b>দক্ষতা আছে কিনা বোঝার জন্য:</b>\n" +
                "                <ul>\n" +
                "                    <li>কোডিংয়ের ধারণা মাত্র বুঝতে পারলেও কোনো ছোট প্রোগ্রাম লিখতে পারেন কি?</li>\n" +
                "                    <li>জটিল নির্দেশাবলী বুঝতে এবং অনুসরণ করতে পারেন কি? নিজের মতো কিছু তৈরি করার আগ্রহ আছে কি?</li>\n" +
                "                </ul></li>\n" +
                "        </ul>\n" +
                "    </li>\n" +
                "    <li>মৌলিক কম্পিউটার বিজ্ঞানের ধারণা:\n" +
                "        <ul>\n" +
                "            <li><b>অনলাইন কোর্স প্ল্যাটফর্ম:</b>Coursera, edX, Udemy, Khan Academy</li>\n" +
                "            <li><b>টিউটোরিয়াল ওয়েবসাইট:</b>W3Schools, Tutorialspoint</li>\n" +
                "            <li><b>বই:</b>Head First Programming by David Griffiths, Introduction to Algorithms by Thomas H. Cormen et al.</li>\n" +
                "        </ul>\n" +
                "    </li>\n" +
                "    <li>প্রোগ্রামিংয়ের প্রাথমিক ধাপ:\n" +
                "        <ul>\n" +
                "            <li><b>সহজ ল্যাঙ্গুয়েজ শুরু করুন</b> Python, JavaScript, Scratch</li>\n" +
                "            <li><b>অনলাইন কোর্স ও টিউটোরিয়াল:</b>Codecademy, FreeCodeCamp</li>\n" +
                "            <li><b>ইন্টারেক্টিভ ওয়েবসাইট:</b>Khan Academy, CodeCombat</li>\n" +
                "        </ul>\n" +
                "    </li>\n" +
                "</ul>\n" +
                "<b>মধ্যবর্তী ধাপ:</b>\n" +
                "<ul>\n" +
                "    <li>ডাটা স্ট্রাকচার ও অ্যালগোরিদম:\n" +
                "        <ul>\n" +
                "            <li><B>অনলাইন কোর্স:</B> MIT OpenCourseware, LeetCode</li>\n" +
                "            <li><b>বই:</b> Grokking Algorithms by Aditya Bhargava</li>\n" +
                "            <li><B>প্রতিযোগিতা:</B>HackerRank, Codeforces</li>\n" +
                "        </ul>\n" +
                "    </li>\n" +
                "    <li>ওয়েব ডেভেলপমেন্টের ভিত্তি:\n" +
                "         <ul>\n" +
                "            <li><b>HTML, CSS, JavaScript শেখার জন্য:</b>\n" +
                "                <ul>\n" +
                "                    <li>The Odin Project (বিনামূল্যের, প্রকল্পভিত্তিক)</li>\n" +
                "                    <li>Frontend Masters (সাবস্ক্রিপশন প্রয়োজন)</li>\n" +
                "                    <li>Mozilla Developer Network (MDN) (রেফারেন্স ওয়েবসাইট)</li>\n" +
                "                </ul>\n" +
                "            </li>\n" +
                "        </ul>\n" +
                "    \n" +
                "    </li>\n" +
                "    <li><b>ডাটাবেস ব্যবস্থাপনা:</b>\n" +
                "        <ul>\n" +
                "            <li><b>অনলাইন কোর্স: </b>Coursera, edX</li>\n" +
                "            <li><b>বই: </b>Head First SQL by Lynn Beighley</li>\n" +
                "            <li><b>অনলাইন ডাটাবেস: </b>MySQL Workbench, phpMyAdmin</li>\n" +
                "        </ul>\n" +
                "    </li>\n" +
                "    <li><b>প্রকল্প তৈরি:</b>\n" +
                "        <ul>\n" +
                "            <li><b>ছোট প্রকল্প শুরু করুন: </b>টু-ডু লিস্ট অ্যাপ, ওয়েবসাইট, গেম</li>\n" +
                "            <li>GitHub এ আপনার প্রকল্প পোস্ট করুন</li>\n" +
                "        </ul>\n" +
                "    </li>\n" +
                "</ul>\n" +
                "<b>উন্নত ধাপ:</b>\n" +
                "<ul>\n" +
                "    <li><b>বিশেষায়িত দক্ষতা অর্জন: </b>ওয়েব ডেভেলপমেন্ট (Frontend, Backend, Fullstack), মোবাইল অ্যাপ ডেভেলপমেন্ট (Android, iOS), ডেস্কটপ অ্যাপ ডেভেলপার, ডেটা সাইন্টিস্ট, Maching Learning Engineer ইত্যাদি ক্ষেত্রে আপনার আগ্রহ ও সম্ভাবনা বিবেচনা করে একটি নির্দিষ্ট ক্ষেত্রে বিশেষায়িত হোন।</li>\n" +
                "    <li><b>ফ্রেমওয়ার্ক ও লাইব্রেরি শেখা: </b>নির্বাচিত ক্ষেত্রের জনপ্রিয় ফ্রেমওয়ার্ক ও লাইব্রেরি শেখার জন্য অনলাইন কোর্স, টিউটোরিয়াল, এবং ডকুমেন্টেশন ব্যবহার করুন। উদাহরণস্বরূপ, ওয়েব ডেভেলপমেন্টের জন্য React, Django, Node.js; মোবাইল অ্যাপ ডেভেলপমেন্টের জন্য Flutter, Kotlin, Swift; এবং ডেটা সাইন্সের জন্য TensorFlow, PyTorch ইত্যাদি।</li>\n" +
                "    <li><b>সফটওয়্যার ইঞ্জিনিয়ারিং অনুশীলন: </b>সফটওয়্যার ডেভেলপমেন্টের বিভিন্ন ধাপ (প্ল্যানিং, ডিজাইন, ডেভেলপমেন্ট, টেস্টিং, ডিপ্লয়মেন্ট, মেইনটেন্যান্স) সম্পর্কে জানুন এবং প্রকৃত প্রকল্পে সেগুলো কাজে লাগান।</li>\n" +
                "    <li><b>ইন্টার্নশিপ ও ফ্রিল্যান্সিং: </b>অভিজ্ঞতা লাভের জন্য কোনো কোম্পানিতে ইন্টার্নশিপ করুন বা ফ্রিল্যান্সিং প্রকল্প নিন। এতে আপনি শুধু কাজ শেখাই নন, বরং পেশাগত যোগাযোগ, সময় ব্যবস্থাপনা, এবং টিমওয়ার্কের মতো দক্ষতাও অর্জন করবেন।</li>\n" +
                "    <li><b>ক্রমাগত শেখা: </b>প্রযুক্তি দ্রুত পরিবর্তন হয়, তাই সফল সফটওয়্যার ডেভেলপার হতে হলে ক্রমাগত শেখা অপরিহার্য। নতুন টেকনোলজি, ফ্রেমওয়ার্ক, এবং লাইব্রেরি সম্পর্কে জানতে থাকুন। অনলাইন কোর্স, টিউটোরিয়াল, বই, ব্লগ, এবং কমিউনিটি ফোরাম ব্যবহার করুন।</li>\n" +
                "</ul>\n" +
                "<b>অতিরিক্ত টিপস:</b>\n" +
                "<ul>\n" +
                "    <li><b>ইংরেজি শেখা: </b>অনেক ডকুমেন্টেশন, টিউটোরিয়াল, এবং অনলাইন সম্পদ ইংরেজিতে থাকে। তাই ইংরেজি শেখা আপনার পথচলা সহজ করে দেবে।</li>\n" +
                "    <li><b>পেশাগত নেটওয়ার্ক তৈরি করুন: </b>অন্যান্য সফটওয়্যার ডেভেলপার, প্রযুক্তি বিশেষজ্ঞ, এবং পেশাদারদের সাথে মিশে। এতে আপনি নতুন জিনিস শিখতে পারবেন, কাজের সুযোগ পেতে পারবেন, এবং আপনার ক্যারিয়ারের জন্য পরামর্শ নিতে পারবেন।</li>\n" +
                "    <li><b>কখনো হাল ছাড়বেন না: </b>সফটওয়্যার ডেভেলপমেন্ট শেখা একটি চ্যালেঞ্জিং কাজ। কখনো হাল ছাড়বেন না এবং সমস্যা সমাধানের ক্ষেত্রে ধৈর্য ধরুন। প্রতিদিন কিছু না কিছু শেখার চেষ্টা করুন।</li>\n" +
                "</ul>";
        textSoftdevShow = findViewById(R.id.textSoftdevShow);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            textSoftdevShow.setText(Html.fromHtml(TextMainHn, Html.FROM_HTML_MODE_LEGACY));
        }else {
            textSoftdevShow.setText(Html.fromHtml(TextMainHn));}
        //mendotory for every page
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.baseline_arrow_back_ios_24);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this,R.color.Green));
        getSupportActionBar().setTitle("Software Developer");
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