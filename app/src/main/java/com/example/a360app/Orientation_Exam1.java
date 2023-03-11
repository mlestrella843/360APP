package com.example.a360app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class Orientation_Exam1 extends AppCompatActivity {

    private RadioButton rbtn1, rbtn2, rbtn3, rbtn4, rbtn5, rbtn6, rbtn7, rbtn8, rbtn9, rbtn10, rbtn11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orientation_exam1);


        rbtn1 = findViewById(R.id.radioBtn_Q1A1);
        rbtn2 = findViewById(R.id.radioBtn_Q1A2);
        rbtn3 = findViewById(R.id.radioBtn_Q1A3);
        rbtn4 = findViewById(R.id.radioBtn_Q2A1);
        rbtn5 = findViewById(R.id.radioBtn_Q2A2);
        rbtn6 = findViewById(R.id.radioBtn_Q3A1);
        rbtn7 = findViewById(R.id.radioBtn_Q3A2);
        rbtn8 = findViewById(R.id.radioBtn_Q4A1);
        rbtn9 = findViewById(R.id.radioBtn_Q4A2);
        rbtn10 = findViewById(R.id.radioBtn_Q5A1);
        rbtn11 = findViewById(R.id.radioBtn_Q5A2);

    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked.
        switch (view.getId()) {
            case R.id.radioBtn_Q1A1:
                if (checked)

                break;
            case R.id.radioBtn_Q1A2:
                if (checked)

                break;
            case R.id.radioBtn_Q1A3:
                if (checked)

                break;
            case R.id.radioBtn_Q2A1:
                if (checked)

                break;
            case R.id.radioBtn_Q2A2:
                if (checked)

                break;
            case R.id.radioBtn_Q3A1:
                if (checked)

                break;
            case R.id.radioBtn_Q3A2:
                if (checked)

                break;
            case R.id.radioBtn_Q4A1:
                if (checked)

                break;
            case R.id.radioBtn_Q4A2:
                if (checked)

                    break;
            case R.id.radioBtn_Q5A1:
                if (checked)

                    break;
            case R.id.radioBtn_Q5A2:
                if (checked)

                    break;

        }
    }

    public void goToOrientationExam(View view)
    {
        Intent btnGoToOrientationExam = new Intent(this, Orientation_Exam2.class);
        startActivity(btnGoToOrientationExam);
    }
}