package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ShowRecyAdapter extends RecyclerView.Adapter {
    private List<Person> list;
    private Context context;
    private OnItemClick onItemClick;

    public void setOnItemClick(OnItemClick onItemClick) {
        this.onItemClick = onItemClick;
    }

    public ShowRecyAdapter(List<Person> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.item_recy, null);
        return new MyHanlder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        final Person person = list.get(position);
        MyHanlder hanlder = (MyHanlder) holder;
        Glide.with(context).load(list.get(position).getImagePath()).into(hanlder.iv);
        hanlder.tv.setText(list.get(position).getFood());
        hanlder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onItemClick != null) {
                    onItemClick.onitemclick(position, person);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyHanlder extends RecyclerView.ViewHolder {


        ImageView iv;
        TextView tv;

        public MyHanlder(@NonNull View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.iv);
            tv = itemView.findViewById(R.id.tv);
        }
    }

    interface OnItemClick {
        void onitemclick(int position, Person person);
    }
}
