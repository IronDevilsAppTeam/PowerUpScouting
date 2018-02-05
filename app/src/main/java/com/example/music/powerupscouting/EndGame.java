package com.example.music.powerupscouting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class EndGame extends AppCompatActivity {

    RadioGroup radPlatformPark;
    RadioGroup radEndClimb;
    RadioGroup radClimbSupport;
    RadioGroup radEndRank;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_game);

        radPlatformPark = (RadioGroup) findViewById(R.id.platformPark);
        radEndClimb = (RadioGroup) findViewById(R.id.climbAnswer);
        radClimbSupport = (RadioGroup) findViewById(R.id.climbSupport);
        radEndRank = (RadioGroup) findViewById(R.id.rankingPoint);
    }

    public void navigatePostGame (View v){
        switch (radPlatformPark.getCheckedRadioButtonId()) {
            case R.id.doesPark:
                ((GlobalVariables) this.getApplication()).scoutedTeam.platformPark = true;
                break;
        }
        switch (radEndClimb.getCheckedRadioButtonId()) {
            case R.id.climbAnswer:
                ((GlobalVariables) this.getApplication()).scoutedTeam.endClimb = true;
                break;
        }
        switch (radClimbSupport.getCheckedRadioButtonId()) {
            case R.id.climbSupport:
                ((GlobalVariables) this.getApplication()).scoutedTeam.climbSupport = true;
                break;
        }
        switch (radEndRank.getCheckedRadioButtonId()) {
            case R.id.rankingPoint:
                ((GlobalVariables) this.getApplication()).scoutedTeam.endRank = true;
                break;
        }


        Intent intent = new Intent(this,PostGame.class);
        startActivity(intent);
    }
}

