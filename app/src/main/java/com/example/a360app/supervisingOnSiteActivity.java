package com.example.a360app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class supervisingOnSiteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supervising_on_site);
    }

    public void goToFirstDaySupervising(View view)
    {
        Intent btnGoToFirstDaySupervising = new Intent(this,FirstDay_SupervisingOS_Activity.class);
        startActivity(btnGoToFirstDaySupervising);
    }
}