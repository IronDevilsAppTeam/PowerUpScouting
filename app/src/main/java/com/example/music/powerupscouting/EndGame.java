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
    }

    public void navigatePostGame (View v){
        Intent intent = new Intent(this,PostGame.class);
        startActivity(intent);
    }
}

