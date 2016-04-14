package com.example.asus.myrecycleview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.example.asus.myrecycleview.adapter.MyRecycleAdapter;
import com.example.asus.myrecycleview.bean.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 2016/4/14.
 */
public class HorizontalActivity extends AppCompatActivity {
    private RecyclerView mRecycleView;
    private List<Student> mList;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycle_layout);
        mRecycleView=(RecyclerView)findViewById(R.id.horizontla_recycle);
        mList=new ArrayList<>();
        mList.add(new Student(R.mipmap.comma_face_01, "王平",23));
        mList.add(new Student(R.mipmap.comma_face_02, "王平1",23));
        mList.add(new Student(R.mipmap.comma_face_03, "王平2",23));
        mList.add(new Student(R.mipmap.comma_face_04, "王平3",23));
        mList.add(new Student(R.mipmap.comma_face_05, "王平4",23));
        mList.add(new Student(R.mipmap.comma_face_06, "王平5",23));
        MyRecycleAdapter adapter=new MyRecycleAdapter(mList,this);
        LinearLayoutManager manager=new LinearLayoutManager(this, LinearLayout.VERTICAL,false);
        mRecycleView.setLayoutManager(manager);
        mRecycleView.setAdapter(adapter);
    }
}
