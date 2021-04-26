package com.example.balloonbombergame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {
    ImageButton imageButton;
    int countN;
    int randomNum;

    void initNUm(){
        countN = 0;
        randomNum = randomNum = (int)(Math.random() * (10 - 1 + 1) + 1);
        Log.d("randomNum", "" + randomNum);
        //램덤수 생성
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton = (ImageButton)findViewById(R.id.imageButton);

        initNUm();
        //초기화

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countN++;
                Log.d("countN", "" + countN);
                if(countN==randomNum){
                    imageButton.setImageResource(R.drawable.ic_baseline_add_alert_24); }
               else if(countN > randomNum){
                    initNUm();
                    imageButton.setImageResource(R.drawable.ic_baseline_10mp_24);
                }else {

                }
            }
        });

    }
}