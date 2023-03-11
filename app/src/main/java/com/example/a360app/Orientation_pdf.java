package com.example.a360app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Orientation_pdf extends AppCompatActivity {

    private RecyclerView orientationRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orientation_pdf);

        orientationRecyclerView=findViewById(R.id.RecyclerView_Orientation);
        orientationRecyclerView.setHasFixedSize(true);
        orientationRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        List<Integer> imageList = new ArrayList<>();
        imageList.add(R.drawable.orientation_1);
        imageList.add(R.drawable.orientation_2);
        imageList.add(R.drawable.orientation_3);
        imageList.add(R.drawable.orientation_4);
        imageList.add(R.drawable.orientation_5);
        imageList.add(R.drawable.orientation_6);
        imageList.add(R.drawable.orientation_7);
        imageList.add(R.drawable.orientation_8);
        imageList.add(R.drawable.orientation_9);
        imageList.add(R.drawable.orientation_10);
        //imageList.add(R.drawable.orientation_sop1024_1);
        //imageList.add(R.drawable.orientation_sop1024_2);
        //imageList.add(R.drawable.orientation_sop1024_3);
        //imageList.add(R.drawable.orientation_sop1024_4);
        //imageList.add(R.drawable.orientation_sop1024_5);
        //imageList.add(R.drawable.orientation_sop1024_6);

        Orientation_Adapter orientationRecyclerViewAdapter = new Orientation_Adapter(imageList);

        orientationRecyclerView.setAdapter(orientationRecyclerViewAdapter);


    }

    public void goToOrientationFill(View view)
    {
        Intent btnGoToOrientationFill = new Intent(this, Orientation_Exam1.class);
        startActivity(btnGoToOrientationFill);
    }


}