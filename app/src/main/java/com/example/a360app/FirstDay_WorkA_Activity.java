package com.example.a360app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FirstDay_WorkA_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_day_work_aactivity);
    }

    public void goToGasMonitorForm(View view){
        Intent btnGoToGasMonitorTesta = new Intent(this, GasMonitorBump_form.class);
        startActivity(btnGoToGasMonitorTesta);
    }

    public void goBtnGoBackWorkingAloneActivity(View view)
    {
        Intent btnGoBackWorkingAloneActivity = new Intent(this,workingAloneActivity.class);
        startActivity(btnGoBackWorkingAloneActivity);
    }

}