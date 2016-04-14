package com.example.asus.myrecycleview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Button;

import com.example.asus.myrecycleview.adapter.MyImageAdpter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 2016/4/14.
 */
public class StagActivity extends AppCompatActivity{
    private RecyclerView mRecycleView;
    private List<Integer> mList;
    private Button mButton;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stag_layout);
        mList=new ArrayList<>();
        mList.add(R.mipmap.dahan);
        mList.add(R.mipmap.liubei);
        mList.add(R.mipmap.guanyu);
        mList.add(R.mipmap.duola);
        mList.add(R.mipmap.guanyu);
        mList.add(R.mipmap.liubei);
        mList.add(R.mipmap.dahan);
        mList.add(R.mipmap.liubei);
        MyImageAdpter adpter=new MyImageAdpter(this,mList);
        StaggeredGridLayoutManager manager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        mRecycleView= (RecyclerView) findViewById(R.id.stag_activity);
        mRecycleView.setLayoutManager(manager);
        mRecycleView.setAdapter(adpter);

    }


}
