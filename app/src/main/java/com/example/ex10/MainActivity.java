package com.example.ex10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.graphics.Color;
import android.view.View;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity
{

    ToggleButton tb;
    Switch sw;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb = findViewById(R.id.tb);
        sw = findViewById(R.id.sw);
    }

    public void clicked(View view)
    {

        if (sw.isChecked()==true && tb.isChecked()==false)
        {
            getWindow().getDecorView().setBackgroundColor(Color.CYAN);
        }

        else if (sw.isChecked()==false && tb.isChecked()==true)
        {
            getWindow().getDecorView().setBackgroundColor(Color.MAGENTA);
        }

        else if (sw.isChecked()==true && tb.isChecked()==true)
        {
            getWindow().getDecorView().setBackgroundColor(Color.LTGRAY);
        }

        else
        {
            getWindow().getDecorView().setBackgroundColor(Color.RED);
        }

    }
}