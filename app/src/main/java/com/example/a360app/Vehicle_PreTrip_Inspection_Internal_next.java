package com.example.a360app;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class Vehicle_PreTrip_Inspection_Internal_next extends AppCompatActivity {
    private ImageButton move;
    private RadioButton rbtn1, rbtn2, rbtn3, rbtn4, rbtn5, rbtn6, rbtn7, rbtn8;
    private EditText comments, comments2, comments3, comments4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_pre_trip_inspection_internal_next);
        move = findViewById(R.id.imageBtn_Move6);

        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Vehicle_PreTrip_Inspection_Internal_next.this, Daily_Driver_Assessment.class);
                startActivity(intent);
            }
        });

        rbtn1=findViewById(R.id.radioBtn_SOSKitSatisfactory);
        rbtn2=findViewById(R.id.radioBtn_SOSKitDefective);
        rbtn3=findViewById(R.id.radioBtn_FirstAidKitSatisfactory);
        rbtn4=findViewById(R.id.radioBtn_FirstAidKitDefective);
        rbtn5=findViewById(R.id.radioBtn_SpillKitSatisfactory);
        rbtn6=findViewById(R.id.radioBtn_SpillKitDefective);
        rbtn7=findViewById(R.id.radioBtn_FireExtinguisherSatisfactory);
        rbtn8=findViewById(R.id.radioBtn_FireExtinguisherDefective);
        comments=findViewById(R.id.editText_SOSKitComments);
        comments2=findViewById(R.id.editText_FirstAidKitComments);
        comments3=findViewById(R.id.editText_SpillKitComments);
        comments4=findViewById(R.id.editText_FireExtinguisherComments);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked.
        switch (view.getId()) {
            case R.id.radioBtn_SOSKitSatisfactory:
                if (checked)
                    comments.setVisibility(View.INVISIBLE);
                break;
            case R.id.radioBtn_SOSKitDefective:
                if (checked)
                    comments.setVisibility(View.VISIBLE);
                break;
            case R.id.radioBtn_FirstAidKitSatisfactory:
                if (checked)
                    comments2.setVisibility(View.INVISIBLE);
                break;
            case R.id.radioBtn_FirstAidKitDefective:
                if (checked)
                    comments2.setVisibility(View.VISIBLE);
                break;
            case R.id.radioBtn_SpillKitSatisfactory:
                if (checked)
                    comments3.setVisibility(View.INVISIBLE);
                break;
            case R.id.radioBtn_SpillKitDefective:
                if (checked)
                    comments3.setVisibility(View.VISIBLE);
                break;
            case R.id.radioBtn_FireExtinguisherSatisfactory:
                if (checked)
                    comments4.setVisibility(View.INVISIBLE);
                break;
            case R.id.radioBtn_FireExtinguisherDefective:
                if (checked)
                    comments4.setVisibility(View.VISIBLE);
                break;
        }

    }
}