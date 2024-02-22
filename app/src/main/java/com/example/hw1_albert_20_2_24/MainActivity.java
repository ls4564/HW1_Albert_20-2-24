package com.example.hw1_albert_20_2_24;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Switch sw;
    ToggleButton toogBtn;
    ConstraintLayout cl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sw = findViewById(R.id.sw);
        toogBtn = findViewById(R.id.toogBtn);
        cl = findViewById(R.id.cl);

    }

    public void mainBtn(View view) {
        if(sw.isChecked() && toogBtn.isChecked() )
        {
            cl.setBackgroundColor(Color.GREEN);
        }

        if(!sw.isChecked() && toogBtn.isChecked() )
        {
            cl.setBackgroundColor(Color.RED);
        }

        if(sw.isChecked() && !toogBtn.isChecked() )
        {
            cl.setBackgroundColor(Color.MAGENTA);
        }

        if(!sw.isChecked() && !toogBtn.isChecked() )
        {
            cl.setBackgroundColor(Color.CYAN);
        }

    }
}