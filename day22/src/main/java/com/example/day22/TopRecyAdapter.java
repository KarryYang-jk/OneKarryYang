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


public class TopRecyAdapter extends RecyclerView.Adapter {
    private List<GsonBean.HxListBeansBean> list;
    private Context context;
    private OnItemClick onItemClick;

    public void setOnItemClick(OnItemClick onItemClick) {
        this.onItemClick = onItemClick;
    }

    public TopRecyAdapter(List<GsonBean.HxListBeansBean> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.item_recy1, null);
        return new MyHanlder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        final GsonBean.HxListBeansBean bean = list.get(position);
        MyHanlder hanlder = (MyHanlder) holder;
        RequestOptions requestOptions = new RequestOptions().circleCrop();
        Glide.with(context).load(list.get(position).getShop_image_url()).apply(requestOptions).into(hanlder.item1_iv);
        hanlder.item1_tv.setText(list.get(position).getShop_title());
        hanlder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onItemClick != null) {
                    onItemClick.onitemclick(position, bean);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyHanlder extends RecyclerView.ViewHolder {
        ImageView item1_iv;
        TextView item1_tv;

        public MyHanlder(@NonNull View itemView) {
            super(itemView);
            item1_iv = itemView.findViewById(R.id.item1_iv);
            item1_tv = itemView.findViewById(R.id.item1_tv);
        }
    }

    interface OnItemClick {
        void onitemclick(int position, GsonBean.HxListBeansBean bean);
    }
}
