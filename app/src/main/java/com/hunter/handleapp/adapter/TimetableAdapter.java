package com.hunter.handleapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.hunter.handleapp.R;
import com.hunter.handleapp.bean.Curriculum;
import com.hunter.handleapp.bean.Timetable;

import java.util.ArrayList;

/**
 * Created by zxt on 2016/2/25.
 */
public class TimetableAdapter extends BaseAdapter {
    private ArrayList<Timetable> timetables ;
    private Context context;

    public TimetableAdapter(ArrayList<Timetable> timetables, Context context) {
        this.timetables = timetables;
        this.context = context;
    }

    @Override
    public int getCount() {
        return timetables.size();
    }

    @Override
    public Object getItem(int position) {
        return timetables.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = LayoutInflater.from(context).inflate(R.layout.timetable,null);
        Timetable timetable = timetables.get(position);
        ((TextView)v.findViewById(R.id.examInstitution)).setText(timetable.getExamInstitution());
        ((TextView)v.findViewById(R.id.roomName)).setText(timetable.getRoomName());
        ((TextView)v.findViewById(R.id.roomCapacity)).setText(timetable.getRoomCapacity());
        ((TextView)v.findViewById(R.id.beginTime)).setText(timetable.getBeginTime());
        ((TextView)v.findViewById(R.id.endTime)).setText(timetable.getEndTime());
        return v;
    }
}
