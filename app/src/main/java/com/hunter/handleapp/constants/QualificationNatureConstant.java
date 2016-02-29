package com.hunter.handleapp.constants;

import com.loopj.android.http.RequestParams;

import java.util.ArrayList;

/**
 * Created by zxt on 2016/2/22.
 */
public class QualificationNatureConstant {
    private static String QUALIFICATION_NAME = "qualificationId";
    private static String ASSESSMENT_NATURE_NAME = "assessmentNatureId";
    private static ArrayList<RequestParams> paramsArrayList = new ArrayList<RequestParams>();
    private static ArrayList<String> qualificationIdList = new ArrayList<String>();
    private static ArrayList<String> asseeessmentNatureIdList = new ArrayList<String>();
    static {
        qualificationIdList.add("manager");
        qualificationIdList.add("charge");
        qualificationIdList.add("sw");

        asseeessmentNatureIdList.add("reissue");
        asseeessmentNatureIdList.add("renewal");
        asseeessmentNatureIdList.add("review");
        asseeessmentNatureIdList.add("drawing");

        for (int i = 0; i<qualificationIdList.size(); i++){
            for (int j = 0; j<asseeessmentNatureIdList.size(); j++){
                RequestParams requestParams = new RequestParams();
                requestParams.put(QUALIFICATION_NAME,qualificationIdList.get(i));
                requestParams.put(ASSESSMENT_NATURE_NAME,asseeessmentNatureIdList.get(j));
                paramsArrayList.add(requestParams);
            }
        }
    }

    public static int size(){
        return paramsArrayList.size();
    }

    public static RequestParams get(int index){
        return paramsArrayList.get(index);
    }
}
