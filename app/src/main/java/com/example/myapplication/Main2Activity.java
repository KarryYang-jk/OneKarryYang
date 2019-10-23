package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    private ImageView iv;
    private TextView tv;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
    }

    private void initView() {
        iv = (ImageView) findViewById(R.id.iv);
        tv = (TextView) findViewById(R.id.tv);
        Intent intent = getIntent();
        String image = intent.getStringExtra("image");
        String food = intent.getStringExtra("food");
        Glide.with(Main2Activity.this).load(image).into(iv);
        tv.setText(food);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn:
                Toast.makeText(this, "收藏成功", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
