package com.example.asus.myrecycleview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asus.myrecycleview.R;
import com.example.asus.myrecycleview.bean.Student;

import java.util.List;

/**
 * Created by Asus on 2016/4/14.
 */
public class MyRecycleAdapter extends RecyclerView.Adapter<MyRecycleAdapter.MyViewHolder> {
    private List<Student> list;
    private Context mContext;

    public MyRecycleAdapter(List<Student> list, Context mContext) {
        this.list = list;
        this.mContext = mContext;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mContext).inflate(R.layout.chirldrecycle_item,null);
        MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
            Student student=list.get(position);
            holder.imageView.setImageResource(student.getPhoto());
            holder.age.setText(student.getAge()+"");
            holder.name.setText(student.getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView name,age;
        public MyViewHolder(View itemView) {
            super(itemView);
            imageView=(ImageView)itemView.findViewById(R.id.recycle_image);
            name=(TextView)itemView.findViewById(R.id.recycle_name);
            age=(TextView)itemView.findViewById(R.id.recycle_age);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext,"点击了图片",Toast.LENGTH_SHORT).show();
                }
            });
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext,"点击了"+getLayoutPosition(),Toast.LENGTH_SHORT).show();

                }
            });
        }
    }
}
