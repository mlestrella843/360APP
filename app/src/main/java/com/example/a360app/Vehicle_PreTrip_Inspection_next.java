package com.example.a360app;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class Vehicle_PreTrip_Inspection_next extends AppCompatActivity {

    private ImageButton move;
    private RadioButton rbtn1, rbtn2, rbtn3, rbtn4, rbtn5, rbtn6, rbtn7, rbtn8;
    private EditText comments, comments2, comments3, comments4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_pre_trip_inspection_next);

        move = findViewById(R.id.imageBtn_Move3);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Vehicle_PreTrip_Inspection_next.this, Vehicle_PreTrip_Inspection_Next_Next.class);
                startActivity(intent);
            }
        });

        rbtn1=findViewById(R.id.radioBtn_WindshieldWipersSatisfactory);
        rbtn2=findViewById(R.id.radioBtn_WindshieldWipersDefective);
        rbtn3=findViewById(R.id.radioBtn_WindshieldDentsCracksSatisfactory);
        rbtn4=findViewById(R.id.radioBtn_WindshieldDentsCracksDefective);
        rbtn5=findViewById(R.id.radioBtn_MirrorsSatisfactory);
        rbtn6=findViewById(R.id.radioBtn_MirrorsDefective);
        rbtn7=findViewById(R.id.radioBtn_HeadLightsSatisfactory);
        rbtn8=findViewById(R.id.radioBtn_HeadLightsDefective);
        comments=findViewById(R.id.editText_WindshieldWipersComments);
        comments2=findViewById(R.id.editText_WindshieldDentsCracksComments);
        comments3=findViewById(R.id.editText_MirrorsComments);
        comments4=findViewById(R.id.editText_HeadLightsComments);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked.
        switch (view.getId()) {
            case R.id.radioBtn_WindshieldWipersSatisfactory:
                if (checked)
                    comments.setVisibility(View.INVISIBLE);
                break;
            case R.id.radioBtn_WindshieldWipersDefective:
                if (checked)
                    comments.setVisibility(View.VISIBLE);
                break;
            case R.id.radioBtn_WindshieldDentsCracksSatisfactory:
                if (checked)
                    comments2.setVisibility(View.INVISIBLE);
                break;
            case R.id.radioBtn_WindshieldDentsCracksDefective:
                if (checked)
                    comments2.setVisibility(View.VISIBLE);
                break;
            case R.id.radioBtn_MirrorsSatisfactory:
                if (checked)
                    comments3.setVisibility(View.INVISIBLE);
                break;
            case R.id.radioBtn_MirrorsDefective:
                if (checked)
                    comments3.setVisibility(View.VISIBLE);
                break;
            case R.id.radioBtn_HeadLightsSatisfactory:
                if (checked)
                    comments4.setVisibility(View.INVISIBLE);
                break;
            case R.id.radioBtn_HeadLightsDefective:
                if (checked)
                    comments4.setVisibility(View.VISIBLE);
                break;

        }

    }
}