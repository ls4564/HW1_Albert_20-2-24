package com.example.hw1_albert_20_2_24;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Switch sw;
    ToggleButton toogBtn;
    boolean boolSw;
    boolean boolToogBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sw = findViewById(R.id.sw);
        toogBtn = findViewById(R.id.toogBtn);
    }

    public void mainBtn(View view) {
        if(sw.isChecked() && toogBtn.isChecked() )
        {

        }

        if(!sw.isChecked() && toogBtn.isChecked() )
        {

        }

        if(sw.isChecked() && !toogBtn.isChecked() )
        {

        }

        if(!sw.isChecked() && !toogBtn.isChecked() )
        {

        }

    }
}