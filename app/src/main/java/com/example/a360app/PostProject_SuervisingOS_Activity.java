package com.example.a360app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PostProject_SuervisingOS_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_project_suervising_os);
    }




    public void goBtnGoBackSupervisingActivity(View view)
    {
        Intent btnGoBackSupervisingActivity = new Intent(this,supervisingOnSiteActivity.class);
        startActivity(btnGoBackSupervisingActivity);
    }

}