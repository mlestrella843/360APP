package com.example.a360app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class workingAloneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_working_alone);
    }

   public void goToFirstDayWorkingAlone(View view){
        Intent btnGoFistDayWorkAlone = new Intent(this, FirstDay_WorkA_Activity.class);
        startActivity(btnGoFistDayWorkAlone);
   }

    public void goToThroughoutWorkingAlone(View view){
        Intent btnGoThroughWorkAlone = new Intent(this, ThroughOut_WorkA_Activity.class);
        startActivity(btnGoThroughWorkAlone);
    }

    public void goToPostProjectWorkingAlone(View view){
        Intent btnGoPostProjectWorkAlone = new Intent(this, PostProject_WorkA_Activity.class);
        startActivity(btnGoPostProjectWorkAlone);
    }

    public void goBtnGoBackTwoSection(View view)
    {
        Intent btnGoBackTwoSection = new Intent(this,ChooseTwoActivity.class);
        startActivity(btnGoBackTwoSection);
    }




}