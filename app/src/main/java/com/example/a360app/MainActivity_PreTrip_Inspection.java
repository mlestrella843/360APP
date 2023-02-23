package com.example.a360app;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_PreTrip_Inspection extends AppCompatActivity {

    private ImageButton move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pre_trip_inspection);

        move = findViewById(R.id.imgButtonNext);

        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_PreTrip_Inspection.this, Vehicle_PreTrip_Inspection.class);
                startActivity(intent);
            }
        });

    }

}