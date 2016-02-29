package com.hunter.handleapp.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.hunter.handleapp.R;
import com.hunter.handleapp.bean.ProfileBean;
import com.hunter.handleapp.constants.UrlConstant;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;
import com.ndktools.javamd5.Mademd5;

import org.apache.http.Header;
import org.apache.http.entity.StringEntity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;

/**
 * Created by zxt on 2016/2/2.
 */
public class LoginActivity extends Activity {
    private EditText usernameEdit ;
    private EditText passwordEdit ;
    private Button loginButton;
    private static Mademd5 mad = new Mademd5();
    private static AsyncHttpClient client = new AsyncHttpClient();
    private String userName = null;
    private String pwd_md5 = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initActivity();
    }
    public void initActivity(){
        usernameEdit = (EditText)findViewById(R.id.username);
        passwordEdit = (EditText)findViewById(R.id.password);
        loginButton = (Button)findViewById(R.id.login_button);
        loginButton.setOnClickListener(new LoginButtonOnClickLitener());
    }
    private class LoginButtonOnClickLitener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            userName = usernameEdit.getText().toString();
            pwd_md5 = mad.toMd5(passwordEdit.getText().toString()).toLowerCase();
            RequestParams requestParams = new RequestParams();
            requestParams.put("id", userName);
            requestParams.put("password", pwd_md5);
            client.get(LoginActivity.this, UrlConstant.PROFILE_URL, requestParams, new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int i, Header[] headers, byte[] bytes) {
                    String s = new String(bytes);
                    final Type type = new TypeToken <ProfileBean> () {
                    }.getType();
                    ProfileBean profileBean = new Gson().fromJson(s,type);
                    if (profileBean.getSuccess()) {
                        Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                        intent.putExtra("id",userName);
                        intent.putExtra("password",pwd_md5);
                        intent.putExtra("name",profileBean.getName());
                        LoginActivity.this.startActivity(intent);
                        LoginActivity.this.finish();
                    } else {

                    }
                }

                @Override
                public void onFailure(int i, Header[] headers, byte[] bytes, Throwable throwable) {

                }
            });
        }
    }
}
