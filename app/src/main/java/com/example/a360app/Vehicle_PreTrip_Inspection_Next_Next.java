package com.example.a360app;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class Vehicle_PreTrip_Inspection_Next_Next extends AppCompatActivity {

    private ImageButton move;
    private RadioButton rbtn1, rbtn2, rbtn3, rbtn4, rbtn5, rbtn6, rbtn7, rbtn8;
    private EditText comments, comments2, comments3, comments4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_pre_trip_inspection_next_next);
        move = findViewById(R.id.imageBtn_Move4);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Vehicle_PreTrip_Inspection_Next_Next.this, Vehicle_PreTrip_Inspection_Internal.class);
                startActivity(intent);
            }
        });

        rbtn1=findViewById(R.id.radioBtn_BrakeLightsSatisfactory);
        rbtn2=findViewById(R.id.radioBtn_BrakeLightsDefective);
        rbtn3=findViewById(R.id.radioBtn_SignalLightsSatisfactory);
        rbtn4=findViewById(R.id.radioBtn_SignalLightsDefective);
        rbtn5=findViewById(R.id.radioBtn_DashLightsSatisfactory);
        rbtn6=findViewById(R.id.radioBtn_DashLightsDefective);
        rbtn7=findViewById(R.id.radioBtn_GaugesSatisfactory);
        rbtn8=findViewById(R.id.radioBtn_GaugesDefective);
        comments=findViewById(R.id.editText_BrakeLightsComments);
        comments2=findViewById(R.id.editText_SignalLightsComments);
        comments3=findViewById(R.id.editText_DashLightsComments);
        comments4=findViewById(R.id.editText_GaugesComments);

    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked.
        switch (view.getId()) {
            case R.id.radioBtn_BrakeLightsSatisfactory:
                if (checked)
                    comments.setVisibility(View.INVISIBLE);
                break;
            case R.id.radioBtn_BrakeLightsDefective:
                if (checked)
                    comments.setVisibility(View.VISIBLE);
                break;
            case R.id.radioBtn_SignalLightsSatisfactory:
                if (checked)
                    comments2.setVisibility(View.INVISIBLE);
                break;
            case R.id.radioBtn_SignalLightsDefective:
                if (checked)
                    comments2.setVisibility(View.VISIBLE);
                break;
            case R.id.radioBtn_DashLightsSatisfactory:
                if (checked)
                    comments3.setVisibility(View.INVISIBLE);
                break;
            case R.id.radioBtn_DashLightsDefective:
                if (checked)
                    comments3.setVisibility(View.VISIBLE);
                break;
            case R.id.radioBtn_GaugesSatisfactory:
                if (checked)
                    comments4.setVisibility(View.INVISIBLE);
                break;
            case R.id.radioBtn_GaugesDefective:
                if (checked)
                    comments4.setVisibility(View.VISIBLE);
                break;

        }

    }
}