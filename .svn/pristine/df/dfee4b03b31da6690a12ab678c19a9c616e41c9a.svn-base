package com.hunter.handleapp.constants;

import com.loopj.android.http.RequestParams;

import java.util.ArrayList;

/**
 * Created by zxt on 2016/2/24.
 */
public class InstConstant {
    private static String TYPE_NAME = "type";
    private static ArrayList<String> typeList = new ArrayList<String>();
    private static ArrayList<RequestParams> paramsArrayList = new ArrayList<RequestParams>();
    static {
        typeList.add("review");
        typeList.add("change");
        for (int i = 0; i<typeList.size(); i++){
            RequestParams requestParams = new RequestParams();
            requestParams.put(TYPE_NAME,typeList.get(i));
            paramsArrayList.add(requestParams);
        }
    }
    public static int size(){
        return paramsArrayList.size();
    }

    public static RequestParams get(int index){
        return paramsArrayList.get(index);
    }
}
