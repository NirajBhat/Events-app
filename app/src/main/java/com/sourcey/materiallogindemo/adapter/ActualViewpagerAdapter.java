package com.sourcey.materiallogindemo.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.sourcey.materiallogindemo.fragment.ModuleFragment;

import java.util.ArrayList;

/**
 * Created by next on 11/6/17.
 */
public class ActualViewpagerAdapter extends FragmentPagerAdapter {
    ArrayList<String> mStringArrayList;
    public ActualViewpagerAdapter(FragmentManager fm, ArrayList<String> arrayList) {
        super(fm);
        this.mStringArrayList = arrayList;
    }

    @Override
    public Fragment getItem(int position) {
return ModuleFragment.newInstance(position, mStringArrayList.get(position));

    }

    @Override
    public int getCount() {
        return mStringArrayList.size();
    }

    public void setData(ArrayList<String> mStringList) {
        this.mStringArrayList = mStringList;
        notifyDataSetChanged();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mStringArrayList.get(position);
    }
}

