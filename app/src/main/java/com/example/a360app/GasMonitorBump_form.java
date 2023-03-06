package com.example.a360app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GasMonitorBump_form extends AppCompatActivity implements View.OnClickListener{

    public CardView c1, c2, c3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gas_monitor_bump_form);

        c1 = (CardView) findViewById(R.id.Card1);
        c2 = (CardView) findViewById(R.id.Card2);
        c3 = (CardView) findViewById(R.id.Card3);

        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
    }


        @Override
        public void onClick(View view) {
        Intent i;
            switch(view.getId()) {
                case R.id.Card1:
                    i = new Intent(this, Row1_Activity.class);
                    startActivity(i);
                    break;

                case R.id.Card2:
                    i = new Intent(this, Row2_Activity.class);
                    startActivity(i);
                    break;

                case R.id.Card3:
                    i = new Intent(this, Row3_Activity.class);
                    startActivity(i);
                    break;
            }
    }


}