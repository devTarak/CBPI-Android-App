package com.devtarak.cbpi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

public class ScheduleAdapter extends BaseAdapter {
    private Context context;
    private List<String> scheduleList;

    public ScheduleAdapter(Context context, List<String> scheduleList) {
        this.context = context;
        this.scheduleList = scheduleList;
    }

    @Override
    public int getCount() {
        return scheduleList.size();
    }

    @Override
    public Object getItem(int position) {
        return scheduleList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.schedule_item, parent, false);
        }

        TextView scheduleTextView = convertView.findViewById(R.id.scheduleTextView);
        scheduleTextView.setText(scheduleList.get(position));

        return convertView;
    }
}

