package com.example.asus.myrecycleview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.asus.myrecycleview.R;

import java.util.List;

/**
 * Created by Asus on 2016/4/14.
 */
public class MyImageAdpter extends RecyclerView.Adapter<MyImageAdpter.MyViewHoder> {
   private Context mContext;
    private List<Integer> list;

    public MyImageAdpter(Context mContext, List<Integer> list) {
        this.mContext = mContext;
        this.list = list;
    }

    @Override
    public MyViewHoder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(mContext).inflate(R.layout.stag_recycle,null);
        MyViewHoder hoder=new MyViewHoder(view);
        return hoder;
    }

    @Override
    public void onBindViewHolder(MyViewHoder holder, int position) {
                    holder.imageView.setImageResource(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class MyViewHoder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        public MyViewHoder(View itemView) {
            super(itemView);
            imageView=(ImageView)itemView.findViewById(R.id.stag_image);

        }
    }
}
