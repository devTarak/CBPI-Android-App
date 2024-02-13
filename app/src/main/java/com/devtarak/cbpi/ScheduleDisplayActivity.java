package com.devtarak.cbpi;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScheduleDisplayActivity extends AppCompatActivity {
    private GridView scheduleGridView;
    private TextView headingTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_display);

        headingTextView = findViewById(R.id.headingTextView);
        scheduleGridView = findViewById(R.id.scheduleGridView);

        // Retrieve the teacher's name from the intent
        String teacherName = getIntent().getStringExtra("teacherName");

        // Get the current day
        String today = getToday();

        // Set the heading text dynamically
        headingTextView.setText("Schedule for " + teacherName + " today (" + today + "):");

        // Get the schedule for the teacher and display it
        List<String> schedule = getTeacherSchedule(teacherName);
        ScheduleAdapter adapter = new ScheduleAdapter(this, schedule);
        scheduleGridView.setAdapter(adapter);



        //mendotory for every page
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.baseline_arrow_back_ios_24);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this,R.color.Green));
        getSupportActionBar().setTitle("Your Schedule");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#609513")));
    }

    // Method to retrieve the schedule for the teacher
    private List<String> getTeacherSchedule(String teacherName) {
        List<Map<String, Object>> teacherList = new ArrayList<>();

        // Create Tarak's schedule
        Map<String, Object> tarak = new HashMap<>();
        tarak.put("name", "Tarak");
        List<Map<String, String[]>> tarakSchedule = new ArrayList<>();
        tarakSchedule.add(Map.of("sunday", new String[]{"English-2nd-1st-12:45pm to 1:30pm-302", "Math-2nd-2nd-1:30pm to 2:15pm-302", "Physics-2nd-1st-12:45pm to 1:30pm-302", "Milestone-2nd-1st-12:45pm to 1:30pm-302"}));
        tarakSchedule.add(Map.of("monday", new String[]{"Bangla-2nd-1st-12:45pm to 1:30pm-302", "Chemistry-2nd-1st-12:45pm to 1:30pm-302", "Math-2nd-1st-12:45pm to 1:30pm-302", "ICT-2nd-1st-12:45pm to 1:30pm-302"}));
        tarakSchedule.add(Map.of("thursday", new String[]{"English-2nd-1st-12:45pm to 1:30pm-302", "H.Math-2nd-1st-12:45pm to 1:30pm-302", "Physics-2nd-1st-12:45pm to 1:30pm-302", "Business-2nd-1st-12:45pm to 1:30pm-302"}));
        tarakSchedule.add(Map.of("wednesday", new String[]{"Math-2nd-1st-12:45pm to 1:30pm-302", "Fun-2nd-1st-12:45pm to 1:30pm-302", "Lab Class-2nd-1st-12:45pm to 1:30pm-302", "BSK-2nd-1st-12:45pm to 1:30pm-302"}));
        tarakSchedule.add(Map.of("thursday", new String[]{"Python-2nd-1st-12:45pm to 1:30pm-302", "OS-2nd-1st-12:45pm to 1:30pm-302", "Physics-2nd-1st-12:45pm to 1:30pm-302", "DSH-2nd-1st-12:45pm to 1:30pm-302"}));
        tarak.put("schedule", tarakSchedule);
        teacherList.add(tarak);

        // Create Rahim's schedule
        Map<String, Object> rahim = new HashMap<>();
        rahim.put("name", "Rahim");
        List<Map<String, String[]>> rahimSchedule = new ArrayList<>();
        rahimSchedule.add(Map.of("sunday", new String[]{"English-2nd-1st-12:45pm to 1:30pm-302", "Math-2nd-1st-12:45pm to 1:30pm-302", "Physics-2nd-1st-12:45pm to 1:30pm-302", "Milestone-2nd-1st-12:45pm to 1:30pm-302"}));
        rahimSchedule.add(Map.of("monday", new String[]{"Bangla-2nd-1st-12:45pm to 1:30pm-302", "Chemistry-2nd-1st-12:45pm to 1:30pm-302", "Math-2nd-1st-12:45pm to 1:30pm-302", "ICT-2nd-1st-12:45pm to 1:30pm-302"}));
        rahimSchedule.add(Map.of("thursday", new String[]{"English-2nd-1st-12:45pm to 1:30pm-302", "H.Math-2nd-1st-12:45pm to 1:30pm-302", "Physics-2nd-1st-12:45pm to 1:30pm-302", "Business-2nd-1st-12:45pm to 1:30pm-302"}));
        rahimSchedule.add(Map.of("wednesday", new String[]{"Math-2nd-1st-12:45pm to 1:30pm-302", "Fun-2nd-1st-12:45pm to 1:30pm-302", "Lab Class-2nd-1st-12:45pm to 1:30pm-302", "BSK-2nd-1st-12:45pm to 1:30pm-302"}));
        rahimSchedule.add(Map.of("thursday", new String[]{"Python-2nd-1st-12:45pm to 1:30pm-302", "OS-2nd-1st-12:45pm to 1:30pm-302", "Physics-2nd-1st-12:45pm to 1:30pm-302", "DSH-2nd-1st-12:45pm to 1:30pm-302"}));
        rahim.put("schedule", rahimSchedule);
        teacherList.add(rahim);

        List<String> scheduleList = new ArrayList<>();

        boolean teacherFound = false;
        for (Map<String, Object> teacher : teacherList) {
            String name = (String) teacher.get("name");
            if (name.equalsIgnoreCase(teacherName)) {
                teacherFound = true;
                List<Map<String, String[]>> schedule = (List<Map<String, String[]>>) teacher.get("schedule");
                String today = getToday();
                if (!today.equals("friday") && !today.equals("saturday")) {
                    boolean classFound = false;
                    for (Map<String, String[]> daySchedule : schedule) {
                        if (daySchedule.containsKey(today)) {
                            String[] subjects = daySchedule.get(today);
                            for (String subject : subjects) {
                                String[] parts = subject.split("-");
                                if (parts.length >= 5) {
                                    StringBuilder scheduleBuilder = new StringBuilder();
                                    scheduleBuilder.append(parts[0]).append("\n");
                                    scheduleBuilder.append(parts[1]).append("\n");
                                    scheduleBuilder.append(parts[2]).append("\n");
                                    scheduleBuilder.append(parts[3]).append("\n");
                                    scheduleBuilder.append(parts[4]).append("\n\n");
                                    scheduleList.add(scheduleBuilder.toString());
                                }
                            }
                            classFound = true;
                            break;
                        }
                    }
                    if (!classFound) {
                        scheduleList.add("No class today for " + name + "\n");
                    }
                } else {
                    scheduleList.add("No class today for " + name + "\n");
                }
                break;
            }
        }
        if (!teacherFound) {
            scheduleList.add("No teacher found with name " + teacherName + "\n");
        }

        return scheduleList;
    }

    private String getToday() {
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        switch (dayOfWeek) {
            case Calendar.SUNDAY:
                return "sunday";
            case Calendar.MONDAY:
                return "monday";
            case Calendar.TUESDAY:
                return "tuesday";
            case Calendar.WEDNESDAY:
                return "wednesday";
            case Calendar.THURSDAY:
                return "thursday";
            case Calendar.FRIDAY:
                return "friday";
            case Calendar.SATURDAY:
                return "saturday";
            default:
                return "";
        }
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
