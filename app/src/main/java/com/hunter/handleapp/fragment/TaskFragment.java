package com.hunter.handleapp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.activeandroid.query.Select;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.hunter.handleapp.DB.AchivementDB;
import com.hunter.handleapp.DB.ExamPlanDB;
import com.hunter.handleapp.DB.InstitutionDB;
import com.hunter.handleapp.DB.TrainPlanDB;
import com.hunter.handleapp.R;
import com.hunter.handleapp.activity.MainActivity;
import com.hunter.handleapp.adapter.TaskAdapter;
import com.hunter.handleapp.bean.Achivement;
import com.hunter.handleapp.bean.AchivementBean;
import com.hunter.handleapp.bean.Authority;
import com.hunter.handleapp.bean.EpBean;
import com.hunter.handleapp.bean.ExamPlan;
import com.hunter.handleapp.bean.InstBean;
import com.hunter.handleapp.bean.Institution;
import com.hunter.handleapp.bean.TaskSimple;
import com.hunter.handleapp.bean.TpBean;
import com.hunter.handleapp.bean.TrainPlan;
import com.hunter.handleapp.constants.InstConstant;
import com.hunter.handleapp.constants.QualificationNatureConstant;
import com.hunter.handleapp.constants.UrlConstant;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.apache.http.Header;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/**
 * Created by zxt on 2016/2/2.
 */
public class TaskFragment extends Fragment {
    private static final AsyncHttpClient client = new AsyncHttpClient();
    private View rootView;
    private TaskAdapter adapter;
    private RecyclerView recyclerView ;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (rootView == null){
            rootView = inflater.inflate(R.layout.fragment_task,null);
            recyclerView = (RecyclerView)rootView.findViewById(R.id.recycler_view);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
            recyclerView.setLayoutManager(linearLayoutManager);
            adapter = new TaskAdapter();
            recyclerView.setAdapter(adapter);
            httpGet(UrlConstant.INST_URL);
            httpGet(UrlConstant.TP_URL);
            httpGet(UrlConstant.EP_URL);
            httpGet(UrlConstant.ACHIVEMENT_URL);
        }
        ViewGroup parent = (ViewGroup) rootView.getParent();
        if (parent != null)
        {
            parent.removeView(rootView);
        }
        return rootView;
    }

    void httpGet(String urlString){
        if (urlString.equals(UrlConstant.INST_URL)){
            for (int i=0; i< InstConstant.size(); i++){
                RequestParams requestParams = InstConstant.get(i);

                requestParams.put("id", ((MainActivity)getActivity()).getId());
                requestParams.put("password",((MainActivity)getActivity()).getPassword());

                asyncHttpGet(urlString,requestParams);
            }
        } else {
            for (int i=0; i< QualificationNatureConstant.size(); i++){
                RequestParams requestParams = QualificationNatureConstant.get(i);

                requestParams.put("id", ((MainActivity)getActivity()).getId());
                requestParams.put("password",((MainActivity)getActivity()).getPassword());

                asyncHttpGet(urlString,requestParams);
            }
        }

    }

    void asyncHttpGet(final String urlString, RequestParams requestParams){
        client.get(getActivity(), urlString , requestParams, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int i, Header[] headers, byte[] bytes) {
                String s = new String(bytes);

                Type type = new TypeToken<Authority>() {
                }.getType();
                Authority authority = new Gson().fromJson(s, type);
                if (authority.getSuccess()){
                    if (urlString.equals(UrlConstant.INST_URL)){
                        Type type1 = new TypeToken<InstBean>() {
                        }.getType();
                        InstBean instBean = new Gson().fromJson(s,type1);
                        ArrayList<Institution> institutions = instBean.getInstitutions();
                        for (Institution institution : institutions){
                            InstitutionDB institutionDB = new InstitutionDB(institution);
                            institutionDB.save();
                            adapter.add(institution);
                        }

                    } else if (urlString.equals(UrlConstant.TP_URL)){
                        Type type1 = new TypeToken<TpBean>() {
                        }.getType();
                        TpBean tpBean = new Gson().fromJson(s,type1);
                        ArrayList<TrainPlan> trainPlans = tpBean.getPlans();
                        for (TrainPlan trainPlan :trainPlans){
                            TrainPlanDB trainPlanDB = new TrainPlanDB(trainPlan);
                            trainPlanDB.save();
                            adapter.add(trainPlan);
                        }
                    } else if (urlString.equals(UrlConstant.EP_URL)){
                        Type type1 = new TypeToken<EpBean>() {
                        }.getType();
                        EpBean epBean = new Gson().fromJson(s,type1);
                        ArrayList<ExamPlan> examPlans = epBean.getPlans();
                        for (ExamPlan examPlan :examPlans){
                            ExamPlanDB examPlanDB = new ExamPlanDB(examPlan);
                            examPlanDB.save();
                            adapter.add(examPlan);
                        }
                    } else if (urlString.equals(UrlConstant.ACHIVEMENT_URL)){
                        Type type1 = new TypeToken<AchivementBean>() {
                        }.getType();
                        AchivementBean achivementBean = new Gson().fromJson(s,type1);
                        ArrayList<Achivement> achivements = achivementBean.getAchivements();
                        for (Achivement achivement :achivements){
                            AchivementDB achivementDB = new AchivementDB(achivement);
                            achivementDB.save();
                            adapter.add(achivement);
                        }
                    }

                }
            }

            @Override
            public void onFailure(int i, Header[] headers, byte[] bytes, Throwable throwable) {

            }
        });
    }
}
