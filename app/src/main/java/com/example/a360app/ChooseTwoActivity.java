package com.example.a360app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ChooseTwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_two);
    }

    public void goToWorkingAloneActivity(View view)
    {
        Intent btnGoWorkingAlone = new Intent(this, workingAloneActivity.class);
        startActivity(btnGoWorkingAlone);
    }

    public void goToSupervisingOnSite(View view)
    {
        Intent btnGoSupervising = new Intent(this, supervisingOnSiteActivity.class);
        startActivity(btnGoSupervising);
    }




}