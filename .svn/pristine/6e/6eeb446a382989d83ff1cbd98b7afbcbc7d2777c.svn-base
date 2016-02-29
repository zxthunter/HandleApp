package com.hunter.handleapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.hunter.handleapp.R;
import com.hunter.handleapp.bean.Curriculum;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by zxt on 2016/2/25.
 */
public class CurriculumAdapter extends BaseAdapter {
    private ArrayList<Curriculum> curriculums ;
    private Context context;

    public CurriculumAdapter(ArrayList<Curriculum> curriculums,Context context) {
        this.curriculums = curriculums;
        this.context = context;
    }

    @Override
    public int getCount() {
        return curriculums.size();
    }

    @Override
    public Object getItem(int position) {
        return curriculums.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = LayoutInflater.from(context).inflate(R.layout.curriculum,null);
        Curriculum curriculum = curriculums.get(position);
        ((TextView)v.findViewById(R.id.content)).setText(curriculum.getContent());
        ((TextView)v.findViewById(R.id.beginDate)).setText(curriculum.getBeginDate());
        ((TextView)v.findViewById(R.id.endDate)).setText(curriculum.getEndDate());
        ((TextView)v.findViewById(R.id.hours)).setText(curriculum.getHours());
        ((TextView)v.findViewById(R.id.teacher)).setText(curriculum.getTeacher());
        return v;
    }
}
