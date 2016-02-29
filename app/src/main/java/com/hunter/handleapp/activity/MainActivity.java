package com.hunter.handleapp.activity;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.hunter.handleapp.R;

import com.hunter.handleapp.bean.ProfileBean;
import com.hunter.handleapp.bean.Tab_main;
import com.hunter.handleapp.constants.QualificationNatureConstant;
import com.hunter.handleapp.constants.UrlConstant;
import com.hunter.handleapp.fragment.DirectFragment;
import com.hunter.handleapp.fragment.InfoFragment;
import com.hunter.handleapp.fragment.InspectFragment;
import com.hunter.handleapp.fragment.TaskFragment;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.apache.http.Header;

import java.lang.reflect.Type;
import java.util.ArrayList;


public class MainActivity extends FragmentActivity {
    private LayoutInflater layoutInflater = null;
    private ArrayList<Tab_main> fragmentTabList = null;
    private FragmentTabHost fragmentTabHost = null;
    private String id;
    private String password;

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    private String name;

    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            initFragmentTabHost();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id  = getIntent().getStringExtra("id");
        password = getIntent().getStringExtra("password");
        String name = getIntent().getStringExtra("name");
        layoutInflater = getLayoutInflater();

        initFragmentTabHost();


    }
    void initFragmentTabHost(){
        fragmentTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        fragmentTabHost.setup(this,getSupportFragmentManager(),R.id.real_tabcontent);
        fragmentTabList = new ArrayList<Tab_main>();

        fragmentTabList.add(new Tab_main(R.string.task,TaskFragment.class,R.drawable.selector_task));
        fragmentTabList.add(new Tab_main(R.string.direct,DirectFragment.class,R.drawable.selector_direct));
        fragmentTabList.add(new Tab_main(R.string.inspect,InspectFragment.class,R.drawable.selector_inspect));
        fragmentTabList.add(new Tab_main(R.string.info,InfoFragment.class,R.drawable.selector_info));

        for (Tab_main tab : fragmentTabList){
            View view = layoutInflater.inflate(R.layout.tab_main,null);
            ((ImageView)view.findViewById(R.id.tab_image)).setBackgroundResource(tab.getImage());
            fragmentTabHost.addTab(fragmentTabHost.newTabSpec(getString(tab.getName())).setIndicator(view), tab.getFragmentClass(),null);
        }

        fragmentTabHost.getTabWidget().setShowDividers(LinearLayout.SHOW_DIVIDER_NONE);

    }





}
