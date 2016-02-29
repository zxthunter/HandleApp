package com.hunter.handleapp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hunter.handleapp.R;
import com.hunter.handleapp.bean.Achivement;
import com.hunter.handleapp.bean.ExamPlan;
import com.hunter.handleapp.bean.Institution;
import com.hunter.handleapp.bean.TaskSimple;
import com.hunter.handleapp.bean.TrainPlan;
import com.hunter.handleapp.listener.TaskListener;

import java.util.ArrayList;

/**
 * Created by zxt on 2016/2/25.
 */
public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.ViewHolder> {
    private ArrayList<TaskSimple> list = new ArrayList<TaskSimple>();
    private Context context ;
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (context == null) context = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }
    public void add(Institution institution){
        TaskSimple taskSimple = new TaskSimple(institution);
        list.add(taskSimple);
        notifyDataSetChanged();
    }

    public void add(TrainPlan trainPlan){
        TaskSimple taskSimple = new TaskSimple(trainPlan);
        list.add(taskSimple);
        notifyDataSetChanged();
    }
    public void add(ExamPlan examPlan){
        TaskSimple taskSimple = new TaskSimple(examPlan);
        list.add(taskSimple);
        notifyDataSetChanged();
    }

    public void add (Achivement achivement){
        TaskSimple taskSimple = new TaskSimple(achivement);
        list.add(taskSimple);
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        TaskSimple taskSimple = list.get(position);
        holder.titleTextView.setText(taskSimple.getTitle());
        holder.descTextView.setText(taskSimple.getDescription());
        holder.setOnClickListener(new TaskListener(context,taskSimple));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private TextView titleTextView;
        private TextView descTextView;
        private ViewHolder(View itemView) {
            super(itemView);
            titleTextView = (TextView)itemView.findViewById(R.id.title);
            descTextView = (TextView)itemView.findViewById(R.id.desc);
        }
        public void setOnClickListener (View.OnClickListener onClickListenr){
            itemView.setOnClickListener(onClickListenr);
        }
    }
}
