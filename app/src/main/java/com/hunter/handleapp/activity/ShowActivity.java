package com.hunter.handleapp.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.activeandroid.query.Select;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.hunter.handleapp.DB.AchivementDB;
import com.hunter.handleapp.DB.ExamPlanDB;
import com.hunter.handleapp.DB.InstitutionDB;
import com.hunter.handleapp.DB.TrainPlanDB;
import com.hunter.handleapp.R;
import com.hunter.handleapp.adapter.CurriculumAdapter;
import com.hunter.handleapp.adapter.TimetableAdapter;
import com.hunter.handleapp.bean.Authority;
import com.hunter.handleapp.bean.Curriculum;
import com.hunter.handleapp.bean.ExamPlan;
import com.hunter.handleapp.bean.Institution;
import com.hunter.handleapp.bean.Timetable;
import com.hunter.handleapp.bean.TrainPlan;
import com.hunter.handleapp.constants.UrlConstant;

import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by zxt on 2016/2/25.
 */
public class ShowActivity extends Activity {
    private String uid;
    private String urlString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        uid = getIntent().getStringExtra("uid");
        urlString = getIntent().getStringExtra("urlString");
        if (urlString.equals(UrlConstant.INST_URL)){
            InstitutionDB institutionDB = new Select().from(InstitutionDB.class).where("uid = ?", uid).orderBy("RANDOM()").executeSingle();
            initFromDB(institutionDB);
        } else if (urlString.equals(UrlConstant.TP_URL)){
            TrainPlanDB trainPlanDB = new Select().from(TrainPlanDB.class).where("uid = ?", uid).orderBy("RANDOM()").executeSingle();
            initFromDB(trainPlanDB);
        } else if (urlString.equals(UrlConstant.EP_URL)){
            ExamPlanDB examPlanDB = new Select().from(ExamPlanDB.class).where("uid = ?", uid).orderBy("RANDOM()").executeSingle();
            initFromDB(examPlanDB);
        } else if (urlString.equals(UrlConstant.ACHIVEMENT_URL)){
            AchivementDB achivementDB = new Select().from(AchivementDB.class).where("uid = ?", uid).orderBy("RANDOM()").executeSingle();
            initFromDB(achivementDB);
        }
    }
    void initFromDB(InstitutionDB institutionDB){
        setContentView(R.layout.show_institution);
        ((TextView)findViewById(R.id.type)).setText(institutionDB.getType());
        ((TextView)findViewById(R.id.approveType)).setText(institutionDB.getApproveType());
        ((TextView)findViewById(R.id.name)).setText(institutionDB.getName());
        ((TextView)findViewById(R.id.principal)).setText(institutionDB.getPrincipal());
        ((TextView)findViewById(R.id.telephone)).setText(institutionDB.getTelephone());
        ((TextView)findViewById(R.id.mobile)).setText(institutionDB.getMobile());
        ((TextView)findViewById(R.id.address)).setText(institutionDB.getAddress());
    }
    void initFromDB(TrainPlanDB trainPlanDB){
        setContentView(R.layout.show_trainplan);
        ((TextView)findViewById(R.id.instName)).setText(trainPlanDB.getInstName());
        ((TextView)findViewById(R.id.name)).setText(trainPlanDB.getName());
        ((TextView)findViewById(R.id.qualification)).setText(trainPlanDB.getQualification());
        ((TextView)findViewById(R.id.certificateType)).setText(trainPlanDB.getCertificateType());
        ((TextView)findViewById(R.id.companyType)).setText(trainPlanDB.getCompanyType());
        ((TextView)findViewById(R.id.workClass)).setText(trainPlanDB.getWorkClass());
        ((TextView)findViewById(R.id.workItem)).setText(trainPlanDB.getWorkItem());
        ((TextView)findViewById(R.id.year)).setText(trainPlanDB.getYear());
        ((TextView)findViewById(R.id.stage)).setText(trainPlanDB.getStage());
        ((TextView)findViewById(R.id.trainLimit)).setText(trainPlanDB.getTrainLimit());
        ((TextView)findViewById(R.id.trainAddress)).setText(trainPlanDB.getTrainAddress());
        ((TextView)findViewById(R.id.trainBeginDate)).setText(trainPlanDB.getTrainBeginDate());
        ((TextView)findViewById(R.id.trainEndDate)).setText(trainPlanDB.getTrainEndDate());
        ((TextView)findViewById(R.id.trainHours)).setText(trainPlanDB.getTrainHours());
        ((TextView)findViewById(R.id.about)).setText(trainPlanDB.getAbout());
        ((TextView)findViewById(R.id.contact)).setText(trainPlanDB.getContact());
        ((TextView)findViewById(R.id.telephone)).setText(trainPlanDB.getTelephone());
        Type type = new TypeToken<ArrayList<Curriculum>>() {
        }.getType();
        ArrayList<Curriculum> curriculums = new Gson().fromJson(trainPlanDB.getCurriculums(), type);
        ((ListView)findViewById(R.id.curriculums)).setAdapter(new CurriculumAdapter(curriculums,this));
    }
    void initFromDB(ExamPlanDB examPlanDB){
        setContentView(R.layout.show_examplan);
        ((TextView)findViewById(R.id.instName)).setText(examPlanDB.getInstName());
        ((TextView)findViewById(R.id.trainPlanName)).setText(examPlanDB.getTrainPlanName());
        ((TextView)findViewById(R.id.trainBeginDate)).setText(examPlanDB.getTrainBeginDate());
        ((TextView)findViewById(R.id.trainEndDate)).setText(examPlanDB.getTrainEndDate());
        ((TextView)findViewById(R.id.type)).setText(examPlanDB.getType());
        ((TextView)findViewById(R.id.examBeginDate)).setText(examPlanDB.getExamBeginDate());
        ((TextView)findViewById(R.id.examEndDate)).setText(examPlanDB.getExamEndDate());
        ((TextView)findViewById(R.id.examLimit)).setText(examPlanDB.getExamLimit());
        ((TextView)findViewById(R.id.allowExamTimes)).setText(examPlanDB.getAllowExamTimes());
        ((TextView)findViewById(R.id.paperForm)).setText(examPlanDB.getPaperForm());
        Type type = new TypeToken<ArrayList<Timetable>>() {
        }.getType();
        ArrayList<Timetable> timetables = new Gson().fromJson(examPlanDB.getTimetables(), type);
        ((ListView)findViewById(R.id.timetables)).setAdapter(new TimetableAdapter(timetables,this));
    }
    void initFromDB(AchivementDB achivementDB){
        setContentView(R.layout.show_achivement);
        ((TextView)findViewById(R.id.instName)).setText(achivementDB.getInstName());
        ((TextView)findViewById(R.id.trainPlanName)).setText(achivementDB.getTrainPlanName());
        ((TextView)findViewById(R.id.trainBeginDate)).setText(achivementDB.getTrainEndDate());
        ((TextView)findViewById(R.id.qualification)).setText(achivementDB.getQualification());
        ((TextView)findViewById(R.id.assessmentNature)).setText(achivementDB.getAssessmentNature());
        ((TextView)findViewById(R.id.certificateType)).setText(achivementDB.getCertificateType());
        ((TextView)findViewById(R.id.companyType)).setText(achivementDB.getCompanyType());
        ((TextView)findViewById(R.id.workClass)).setText(achivementDB.getWorkClass());
        ((TextView)findViewById(R.id.workItem)).setText(achivementDB.getWorkItem());
        ((TextView)findViewById(R.id.theoryExamScore)).setText(achivementDB.getTheoryExamScore());
        ((TextView)findViewById(R.id.theoryExamPassed)).setText(achivementDB.getTheoryExamPassed());
        ((TextView)findViewById(R.id.operationExamScore)).setText(achivementDB.getOperationExamScore());
        ((TextView)findViewById(R.id.operationExamPassed)).setText(achivementDB.getOperationExamPassed());
    }
}
