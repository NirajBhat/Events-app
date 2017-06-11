package com.sourcey.materiallogindemo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.sourcey.materiallogindemo.R;
import com.sourcey.materiallogindemo.adapter.ActualViewpagerAdapter;

import java.util.ArrayList;

/**
 * Created by next on 11/6/17.
 */
public class ActualActivity extends AppCompatActivity {

    ArrayList<String>  mStringList = new ArrayList<>();
    ActualViewpagerAdapter mAdapter;
    ViewPager  mViewPager;
    TabLayout mTabLayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actualactivity_tab);
        mViewPager = (ViewPager) findViewById(R.id.Viewpager);
        mTabLayout = (TabLayout) findViewById(R.id.tabLayout);
        mStringList.add("All");
        mStringList.add("Today");
        mStringList.add("Tomorrow");
        mStringList.add("WeekEnd");

       if (mAdapter == null) {
           mAdapter = new ActualViewpagerAdapter(getSupportFragmentManager(), mStringList);
           mViewPager.setAdapter(mAdapter);
       }
        else {
           mAdapter.setData(mStringList);
       }

      mTabLayout.setupWithViewPager(mViewPager);
        mAdapter.notifyDataSetChanged();

    }

}
