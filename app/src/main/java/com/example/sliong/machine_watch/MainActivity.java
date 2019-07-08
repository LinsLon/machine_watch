package com.example.sliong.machine_watch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.zigui.machine_watch.R;

public class MainActivity extends AppCompatActivity {

    //定义一个访问图片的数组
    int[] images = new int[]{
            R.drawable.conc,
            R.drawable.serv,
            //R.drawable.xin,
           // R.drawable.zf,
    };
    //用于图片切换
    int currenImg = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取Linearlayout布局容器
        LinearLayout main = (LinearLayout) findViewById(R.id.root);
        LinearLayout main2 = (LinearLayout) findViewById(R.id.root2);
        LinearLayout main3 = (LinearLayout) findViewById(R.id.root3);
        LinearLayout main4 = (LinearLayout) findViewById(R.id.root4);
        //创建ImageView组件
        final ImageView image = new ImageView(this);
        final ImageView image2 = new ImageView(this);
        final ImageView image3 = new ImageView(this);
        final ImageView image4 = new ImageView(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(350,350);
        //将ImageView组建添加到linearlayout布局中
        main.addView(image);
        main2.addView(image2);
        main3.addView(image3);
        main4.addView(image4);
        //初始化显示第一张图片
        image.setLayoutParams(params);
        image.setImageResource(images[0]);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, room1.class);
                startActivity(intent);
            }
        });
        image2.setLayoutParams(params);
        image2.setImageResource(images[0]);
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,room2.class);
                startActivity(intent);
            }
        });
        image3.setLayoutParams(params);
        image3.setImageResource(images[1]);
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, room3.class);
                startActivity(intent);
            }
        });
        image4.setLayoutParams(params);
        image4.setImageResource(images[1]);
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, room4.class);
                startActivity(intent);
            }
        });

    }
}
