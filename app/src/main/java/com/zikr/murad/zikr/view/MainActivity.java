package com.zikr.murad.zikr.view;

import android.content.Intent;
import android.os.CountDownTimer;
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

        new CountDownTimer(8000, 1000) {

            public void onTick(long millisUntilFinished) {
                float t=millisUntilFinished / 1000;
                Log.d("time ","seconds remaining: " + millisUntilFinished / 1000);
                if(4==t){
                        salam1.setVisibility(View.VISIBLE);
                    }
                    if(3==t){
                        salam2.setVisibility(View.VISIBLE);
                    }
                    if(2==t){
                        salam3.setVisibility(View.VISIBLE);
                    }
            }

            public void onFinish() {
                finish();
            }
        }.start();

    }
    @Override
    public void finish(){
        Intent intent =new Intent(MainActivity.this, ZikrActivity.class);
        startActivity(intent);
        super.finish();
    }
}
