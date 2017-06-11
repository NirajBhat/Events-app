package com.sourcey.materiallogindemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sourcey.materiallogindemo.R;
import com.sourcey.materiallogindemo.adapter.ActualViewpagerAdapter;

/**
 * Created by next on 11/6/17.
 */
public class ModuleFragment extends Fragment {
    RecyclerView mRecyclerView;
    GridLayoutManager gridLayoutManager;
    ActualViewpagerAdapter mActualViewpager;
    int mIntPage;
    String mStringTitle;



    public static ModuleFragment newInstance(int page, String title) {
        ModuleFragment fragment =new ModuleFragment();
        Bundle bundle =new Bundle();
        bundle.putInt("int", page);
        bundle.putString("title", title);
        fragment.setArguments(bundle);
        return fragment;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mIntPage = getArguments().getInt("int",0);
        mStringTitle = getArguments().getString("title");

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.module_fragment, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycleview_event_card);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(layoutManager);
        return view;
    }

}
