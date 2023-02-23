package com.example.a360app;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class DailyDriverAssessmentNext extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_driver_assessment_next);

        ImageButton move = findViewById(R.id.imgButton7);

        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DailyDriverAssessmentNext.this, DailyDriverAssessmentNextNext.class);
                startActivity(intent);
            }
        });
    }
}