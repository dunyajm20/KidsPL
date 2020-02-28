package com.example.kidsphonelimits;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageButton unlockBtn = findViewById(R.id.unlock_btn);

       //The code below will work whenever user click button it just delay 500 millis
       /*
       unlockBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        unlockBtn.setEnabled(true);
                        showToast();
                    }
                }, 500);

            }
        });
        */

        unlockBtn.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    view.getHandler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            showToast();
                        }
                    }, 5000);

                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    view.getHandler().removeCallbacksAndMessages(null);
                }

                return false;
            }
        });


    }

    public void showToast() {
        Toast.makeText(this, "Time over", Toast.LENGTH_LONG).show();

    }


}
