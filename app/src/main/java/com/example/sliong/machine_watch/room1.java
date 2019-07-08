package com.example.sliong.machine_watch;

import android.app.Service;
import android.content.Context;
import android.os.Handler;
import android.os.StrictMode;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.zigui.machine_watch.R;

public class room1 extends AppCompatActivity {
    private Handler handler = new Handler();

    TextView tvtemp;
    TextView tvhumi;
    TextView tvfire;
    TextView tvfan;
    TextView tvbeep;
    Button bt2;
    Mythread mythread1 = new Mythread();
    Mythread mythread2 = new Mythread();
    Mythread mythread3 = new Mythread();
    Mythread mythread4 = new Mythread();
    Mythread mythread5 = new Mythread();
    @Override

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
                if (android.os.Build.VERSION.SDK_INT > 9) {
                    StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
                    StrictMode.setThreadPolicy(policy);
                }

            final Vibrator vibrator = (Vibrator)getSystemService(Service.VIBRATOR_SERVICE);
            tvtemp=(TextView)findViewById(R.id.tv_temper);
            tvhumi=(TextView)findViewById(R.id.tv_humi);
            tvfire=(TextView)findViewById(R.id.fire);
            tvfan=(TextView)findViewById(R.id.fan);
            tvbeep=(TextView)findViewById(R.id.beep);

            handler.post(task);//立即调用
            setContentView(R.layout.activity_room1);
             }


    private Runnable task =new Runnable() {
        @Override
        public void run() {
            handler.postDelayed(this,5*50);
            tvtemp=(TextView)findViewById(R.id.tv_temper);
            tvhumi=(TextView)findViewById(R.id.tv_humi);
            tvfire=(TextView)findViewById(R.id.fire);
            tvfan=(TextView)findViewById(R.id.fan);
            tvbeep=(TextView)findViewById(R.id.beep);
            bt2=(Button)findViewById(R.id.button2);
            String temp1 = "temp1";
            String humi1 = "humi1";
            String fire1 = "fire_stat1";
            String fan1 = "fan_stat1";
            String beep1 = "beep_stat1";
            String temp = mythread1.Gettemp(temp1);
            String humi = mythread2.Gethumi(humi1);
            String fire = mythread3.Getfire(fire1);
            String fan = mythread4.Getfan(fan1);
            String beep = mythread5.Getbeep(beep1);

            tvtemp.setText(""+temp);//温度数据写入layout里面的tvtemp1
            tvhumi.setText(""+humi);
            int fi = Integer.parseInt(fire);
            int fa = Integer.parseInt(fan);
            int be = Integer.parseInt(beep);


            switch (fi){
                case 1:
                    tvfire.setText("出现紧急情况");
                    tvfire.setTextColor(getResources().getColor(R.color.red));
                    tvfire.getPaint().setFakeBoldText(true);
                    bt2.setVisibility(View.VISIBLE);
                    break;
                case 0:
                    tvfire.setText("当前状态良好");
                    tvfire.setTextColor(getResources().getColor(R.color.lawngreen));
                    break;
            }
            switch (fa){
                case 1:
                    tvfan.setText("智能降温已启动");
                    tvfan.setTextColor(getResources().getColor(R.color.red));
                    tvfan.getPaint().setFakeBoldText(true);
                    break;
            }
            switch (be) {
                    case 1:
                        //vibrator.vibrate(800);
                        Context v = tvbeep.getContext();
                        VibrateHelp.vSimple(v, 800);
                        break;
            }
            IniEvent();
        }
    };
            @Override
            protected void onDestroy() {
                super.onDestroy();
                handler.removeCallbacks(task);
            }
            private void IniEvent(){
                bt2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        VibrateHelp.stop();
                        finish();
                        handler.removeCallbacks(task);
                    }
                });
            }
}
