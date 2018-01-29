package com.example.music.powerupscouting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class Autonomous extends AppCompatActivity {

    RadioGroup radLineCross;
    RadioGroup radAutoScale;
    RadioGroup radAutoSwitch;
    RadioGroup radScaleControl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autonomous);
    }
    public void navigateTeleop (View v){
        Intent intent = new Intent(this,Teleop.class);
        startActivity(intent);
    }
}
