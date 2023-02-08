package com.example.a360app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //metodo que dispara boton start para que vaya a Login Page

    public void goToLogin(View view)
    {
        Intent btnGoLogin = new Intent(this,LoginActivity.class);
        startActivity(btnGoLogin);
    }



}