package com.example.a360app;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class Vehicle_PreTrip_Inspection_Internal extends AppCompatActivity {
    private ImageButton move;
    private EditText comments, comments2, comments3, comments4;
    private RadioButton rbtn1, rbtn2, rbtn3, rbtn4, rbtn5, rbtn6, rbtn7, rbtn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_pre_trip_inspection_internal);

        move = findViewById(R.id.imageBtn_Move5);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Vehicle_PreTrip_Inspection_Internal.this, Vehicle_PreTrip_Inspection_Internal_next.class);
                startActivity(intent);
            }
        });

        rbtn1=findViewById(R.id.radioBtn_HornSatisfactory);
        rbtn2=findViewById(R.id.radioBtn_HornDefective);
        rbtn3=findViewById(R.id.radioBtn_HeaterDefrostSatisfactory);
        rbtn4=findViewById(R.id.radioBtn_HeaterDefrostDefective);
        rbtn5=findViewById(R.id.radioBtn_ParkingBrakeSatisfactory);
        rbtn6=findViewById(R.id.radioBtn_ParkingBrakeDefective);
        rbtn7=findViewById(R.id.radioBtn_SteeringSatisfactory);
        rbtn8=findViewById(R.id.radioBtn_SteeringDefective);
        comments=findViewById(R.id.editText_HornComments);
        comments2=findViewById(R.id.editText_HeaterDefrostComments);
        comments3=findViewById(R.id.editText_ParkingBrakeComments);
        comments4=findViewById(R.id.editText_SteeringComments);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked.
        switch (view.getId()) {
            case R.id.radioBtn_HornSatisfactory:
                if (checked)
                    comments.setVisibility(View.INVISIBLE);
                break;
            case R.id.radioBtn_HornDefective:
                if (checked)
                    comments.setVisibility(View.VISIBLE);
                break;
            case R.id.radioBtn_HeaterDefrostSatisfactory:
                if (checked)
                    comments2.setVisibility(View.INVISIBLE);
                break;
            case R.id.radioBtn_HeaterDefrostDefective:
                if (checked)
                    comments2.setVisibility(View.VISIBLE);
                break;
            case R.id.radioBtn_ParkingBrakeSatisfactory:
                if (checked)
                    comments3.setVisibility(View.INVISIBLE);
                break;
            case R.id.radioBtn_ParkingBrakeDefective:
                if (checked)
                    comments3.setVisibility(View.VISIBLE);
                break;
            case R.id.radioBtn_SteeringSatisfactory:
                if (checked)
                    comments4.setVisibility(View.INVISIBLE);
                break;
            case R.id.radioBtn_SteeringDefective:
                if (checked)
                    comments4.setVisibility(View.VISIBLE);
                break;

        }
    }

}