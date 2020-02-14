package com.example.kidsphonelimits;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button longpresss = (Button) findViewById(R.id.longclick);
   /*    longpresss.setOnLongClickListener(new View.OnLongClickListener() {

                                             public boolean onLongClick(View view) {
                                                 longclickk();
                                                 return true;
                                             }
                                         });
*/
        longpresss.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        longpresss.setEnabled(true);
                        longclickk();
                    }
                }, 500);

            }
        });


    }

    public void longclickk()
    {
        Toast.makeText(this, "Time over", Toast.LENGTH_LONG).show();

    }





}
