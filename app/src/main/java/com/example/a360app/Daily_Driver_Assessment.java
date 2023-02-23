package com.example.a360app;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Daily_Driver_Assessment extends AppCompatActivity {

    private ImageButton move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_driver_assessment);

        move = findViewById(R.id.imgButton6);

        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Daily_Driver_Assessment.this, DailyDriverAssessmentNext.class);
                startActivity(intent);
            }
        });
    }
}