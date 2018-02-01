package com.zikr.murad.zikr.view;

import android.os.CountDownTimer;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.zikr.murad.zikr.R;

public class MainActivity extends AppCompatActivity {
    private TextView salam1;
    private TextView salam2;
    private TextView salam3;
    private int time =6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        salam1= (TextView) findViewById(R.id.tv_salam1);
        salam2= (TextView) findViewById(R.id.tv_salam2);
        salam3= (TextView) findViewById(R.id.tv_salam3);

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                float t=0;
//                while (t<=time+2){
//                    t+=0.00005;
//                    if((time/3)<=t){
//                        salam1.setVisibility(View.VISIBLE);
//                    }
//                    if((time/2)<=t){
//                        salam2.setVisibility(View.VISIBLE);
//                    }
//                    if((time)<=t){
//                        salam3.setVisibility(View.VISIBLE);
//                    }
//                    Log.d("time", t+"");
//                }
//            }
//        }).start();
        new CountDownTimer(8000, 1000) {

            public void onTick(long millisUntilFinished) {
                float t=millisUntilFinished / 1000;
                Log.d("time ","seconds remaining: " + millisUntilFinished / 1000);
                if(7==t){
                        salam1.setVisibility(View.VISIBLE);
                    }
                    if(5==t){
                        salam2.setVisibility(View.VISIBLE);
                    }
                    if(3==t){
                        salam3.setVisibility(View.VISIBLE);
                    }
            }

            public void onFinish() {
                Log.d("time","done!");
            }
        }.start();

    }
}
