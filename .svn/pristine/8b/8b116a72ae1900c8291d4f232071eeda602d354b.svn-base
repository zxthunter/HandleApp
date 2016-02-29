package com.hunter.handleapp.listener;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.activeandroid.query.Select;
import com.hunter.handleapp.DB.InstitutionDB;
import com.hunter.handleapp.DB.TrainPlanDB;
import com.hunter.handleapp.activity.ShowActivity;
import com.hunter.handleapp.bean.TaskSimple;
import com.hunter.handleapp.constants.UrlConstant;

/**
 * Created by zxt on 2016/2/25.
 */
public class TaskListener implements View.OnClickListener {
    private Context context;
    private String uid;
    private String urlString;
    public TaskListener(Context context,TaskSimple taskSimple){
        this.context = context;
        uid = taskSimple.getUid();
        urlString = taskSimple.getUrlString();
    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(context,ShowActivity.class);
        intent.putExtra("uid",uid);
        intent.putExtra("urlString",urlString);
        context.startActivity(intent);

    }
}
