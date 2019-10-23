package com.example.day22;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;


public class BottomRecyAdapter extends RecyclerView.Adapter {
    private List<GsonBean.HxListBeansBean> list;
    private Context context;

    public BottomRecyAdapter(List<GsonBean.HxListBeansBean> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.item_recy2, null);
        return new MyHanlder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyHanlder hanlder = (MyHanlder) holder;
        Glide.with(context).load(list.get(position).getShop_image_url()).into(hanlder.item2_iv);
        hanlder.title.setText(list.get(position).getShop_title());
        hanlder.desc.setText(list.get(position).getShop_content());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyHanlder extends RecyclerView.ViewHolder {


        ImageView item2_iv;
        TextView title;
        TextView desc;

        public MyHanlder(@NonNull View itemView) {
            super(itemView);
            item2_iv = itemView.findViewById(R.id.item2_iv);
            title = itemView.findViewById(R.id.title);
            desc = itemView.findViewById(R.id.desc);
        }
    }
}
