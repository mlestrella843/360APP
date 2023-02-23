package com.example.a360app;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class Vehicle_PreTrip_Inspection extends AppCompatActivity {

    private EditText comments, comments2, comments3, comments4;
    private RadioButton rbtn1, rbtn2, rbtn3, rbtn4, rbtn5, rbtn6, rbtn7, rbtn8;

    private ImageButton move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_pre_trip_inspection);

        move = findViewById(R.id.imageBtn_move1);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Vehicle_PreTrip_Inspection.this, Vehicle_PreTrip_Inspection_next.class);
                startActivity(intent);
            }
        });

        rbtn1 = findViewById(R.id.radioBtn_TiresSatisfactory);
        rbtn2 = findViewById(R.id.radioBtn_TiresDefective);
        rbtn3 = findViewById(R.id.radioBtn_RimsSatisfactory);
        rbtn4 = findViewById(R.id.radioBtn_RimsDefective);
        rbtn5 = findViewById(R.id.radioBtn_OilLeaksSatisfactory);
        rbtn6 = findViewById(R.id.radioBtn_OilLeaksDefective);
        rbtn7 = findViewById(R.id.radioBtn_WindshieldFluidSatisfactory);
        rbtn8 = findViewById(R.id.radioBtn_WindshieldFluidDefective);
        comments = findViewById(R.id.editText_TiresComments);
        comments2 = findViewById(R.id.editText_RimsComments);
        comments3 = findViewById(R.id.editText_OilLeaksComments);
        comments4 = findViewById(R.id.editText_WindshieldFluidComments);

    }

        public void onRadioButtonClicked (View view){
            boolean checked = ((RadioButton) view).isChecked();
            // Check which radio button was clicked.
            switch (view.getId()) {
                case R.id.radioBtn_TiresSatisfactory:
                    if (checked)
                        comments.setVisibility(View.INVISIBLE);
                    break;
                case R.id.radioBtn_TiresDefective:
                    if (checked)
                        comments.setVisibility(View.VISIBLE);
                    break;
                case R.id.radioBtn_RimsSatisfactory:
                    if (checked)
                        comments2.setVisibility(View.INVISIBLE);
                    break;
                case R.id.radioBtn_RimsDefective:
                    if (checked)
                        comments2.setVisibility(View.VISIBLE);
                    break;
                case R.id.radioBtn_OilLeaksSatisfactory:
                    if (checked)
                        comments3.setVisibility(View.INVISIBLE);
                    break;
                case R.id.radioBtn_OilLeaksDefective:
                    if (checked)
                        comments3.setVisibility(View.VISIBLE);
                    break;
                case R.id.radioBtn_WindshieldFluidSatisfactory:
                    if (checked)
                        comments4.setVisibility(View.INVISIBLE);
                    break;
                case R.id.radioBtn_WindshieldFluidDefective:
                    if (checked)
                        comments4.setVisibility(View.VISIBLE);
                    break;

            }
        }
    }
