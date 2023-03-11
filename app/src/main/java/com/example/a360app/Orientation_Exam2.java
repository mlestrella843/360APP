package com.example.a360app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Orientation_Exam2 extends AppCompatActivity {

    private RadioButton rbtn1, rbtn2, rbtn3, rbtn4, rbtn5, rbtn6, rbtn7, rbtn8, rbtn9, rbtn10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orientation_exam2);

        rbtn1 = findViewById(R.id.radioBtn_Q6A1);
        rbtn2 = findViewById(R.id.radioBtn_Q6A2);
        rbtn3 = findViewById(R.id.radioBtn_Q7A1);
        rbtn4 = findViewById(R.id.radioBtn_Q7A2);
        rbtn5 = findViewById(R.id.radioBtn_Q8A1);
        rbtn6 = findViewById(R.id.radioBtn_Q8A2);
        rbtn7 = findViewById(R.id.radioBtn_Q9A1);
        rbtn8 = findViewById(R.id.radioBtn_Q9A2);
        rbtn9 = findViewById(R.id.radioBtn_Q10A1);
        rbtn10 = findViewById(R.id.radioBtn_Q10A2);

    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked.
        switch (view.getId()) {
            case R.id.radioBtn_Q6A1:
                if (checked)

                    break;
            case R.id.radioBtn_Q6A2:
                if (checked)

                    break;
            case R.id.radioBtn_Q7A1:
                if (checked)

                    break;
            case R.id.radioBtn_Q8A2:
                if (checked)

                    break;
            case R.id.radioBtn_Q9A1:
                if (checked)

                    break;
            case R.id.radioBtn_Q9A2:
                if (checked)

                    break;
            case R.id.radioBtn_Q10A1:
                if (checked)

                    break;
            case R.id.radioBtn_Q10A2:
                if (checked)

                    break;

        }
    }

    public void goToOrientationFill(View view)
    {
        Intent btnGoToOrientationFill = new Intent(this, Orientation.class);
        startActivity(btnGoToOrientationFill);
    }
}