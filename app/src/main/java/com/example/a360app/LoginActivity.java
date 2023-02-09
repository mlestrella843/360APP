package com.example.a360app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goToChooseActivity(View view)
    {
        Intent btnGoChoose = new Intent(this,ChooseTwoActivity.class);
        startActivity(btnGoChoose);
    }
}