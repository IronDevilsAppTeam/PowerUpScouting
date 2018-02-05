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

        radLineCross = (RadioGroup) findViewById(R.id.autoLine);
        radAutoScale = (RadioGroup) findViewById(R.id.scaleChoice);
        radAutoSwitch = (RadioGroup) findViewById(R.id.switchChoice);
        radScaleControl = (RadioGroup) findViewById(R.id.autoScaleControl);
    }
    public void navigateTeleop (View v){
        switch(radLineCross.getCheckedRadioButtonId()){
            case R.id.crossTrue:
                ((GlobalVariables) this.getApplication()).scoutedTeam.autoCross = true;
                break;
        }
        switch (radAutoScale.getCheckedRadioButtonId()){
            case R.id.scaleAutoTrue:
                ((GlobalVariables) this.getApplication()).scoutedTeam.autoScaleBlock = true;
                break;
        }
        switch (radAutoSwitch.getCheckedRadioButtonId()){
            case R.id.switchAutoTrue:
                ((GlobalVariables) this.getApplication()).scoutedTeam.autoSwitchBlock = true;
                break;
        }
        switch (radScaleControl.getCheckedRadioButtonId()) {
            case R.id.autoScaleControl:
                ((GlobalVariables) this.getApplication()).scoutedTeam.scaleControl = true;
                break;
        }
        Intent intent = new Intent(this,Teleop.class);
        startActivity(intent);
    }
}
