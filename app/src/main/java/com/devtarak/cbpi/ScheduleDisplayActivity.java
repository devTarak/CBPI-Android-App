package com.devtarak.cbpi;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScheduleDisplayActivity extends AppCompatActivity {
    private TextView scheduleTextView;
    private TextView headingTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_display);

        headingTextView = findViewById(R.id.headingTextView);
        scheduleTextView = findViewById(R.id.scheduleTextView);

        // Retrieve the teacher's name from the intent
        String teacherName = getIntent().getStringExtra("teacherName");

        // Get the current day
        String today = getToday();

        // Set the heading text dynamically
        headingTextView.setText("Schedule for " + teacherName + " today (" + today + "):");

        // Get the schedule for the teacher and display it
        String schedule = getTeacherSchedule(teacherName);
        scheduleTextView.setText(schedule);
    }

    // Method to retrieve the schedule for the teacher
    private String getTeacherSchedule(String teacherName) {
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
        // Add both teachers' schedules to the list
        teacherList.add(tarak);
        teacherList.add(rahim);

        StringBuilder scheduleBuilder = new StringBuilder();

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
                                    scheduleBuilder.append("Subject: ").append(parts[0]).append("\n");
                                    scheduleBuilder.append("Shift: ").append(parts[1]).append("\n");
                                    scheduleBuilder.append("Semester: ").append(parts[2]).append("\n");
                                    scheduleBuilder.append("Time Schedule: ").append(parts[3]).append("\n");
                                    scheduleBuilder.append("Classroom Number: ").append(parts[4]).append("\n\n");
                                }
                            }
                            classFound = true;
                            break;
                        }
                    }
                    if (!classFound) {
                        scheduleBuilder.append("No class today for ").append(name).append("\n");
                    }
                } else {
                    scheduleBuilder.append("No class today for ").append(name).append("\n");
                }
                break;
            }
        }
        if (!teacherFound) {
            scheduleBuilder.append("No teacher found with name ").append(teacherName).append("\n");
        }

        return scheduleBuilder.toString();
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
}
