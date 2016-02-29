package com.hunter.handleapp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.hunter.handleapp.R;
import com.hunter.handleapp.activity.InspectActivity;
import com.hunter.handleapp.activity.MainActivity;
import com.hunter.handleapp.bean.ProfileBean;
import com.hunter.handleapp.constants.UrlConstant;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.apache.http.Header;

import java.lang.reflect.Type;

/**
 * Created by zxt on 2016/2/2.
 */
public class InspectFragment extends Fragment {
    private static final AsyncHttpClient client = new AsyncHttpClient();
    private View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (rootView == null) {
            rootView = inflater.inflate(R.layout.fragment_inspect, null);
            ((Button)rootView.findViewById(R.id.check_button)).setOnClickListener(new CheckListener());
        }
        ViewGroup parent = (ViewGroup) rootView.getParent();
        if (parent != null)
        {
            parent.removeView(rootView);
        }
        return rootView;
    }
    class CheckListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            TextView identityTextView = (TextView)((MainActivity)getActivity()).findViewById(R.id.identityId);
            String identityId = identityTextView .getText().toString();
            RequestParams requestParams = new RequestParams();
            requestParams.put("id", ((MainActivity)getActivity()).getId());
            requestParams.put("password",((MainActivity)getActivity()).getPassword());
            requestParams.put("identityId",identityId);
            client.get(getActivity(), UrlConstant.CANDIDATE_PROFILE_URL, requestParams, new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int i, Header[] headers, byte[] bytes) {
                    String s = new String(bytes);
                    Intent intent = new Intent(getActivity(),InspectActivity.class);
                    intent.putExtra("data",s);
                    getActivity().startActivity(intent);
                }

                @Override
                public void onFailure(int i, Header[] headers, byte[] bytes, Throwable throwable) {

                }
            });
        }
    }
}
