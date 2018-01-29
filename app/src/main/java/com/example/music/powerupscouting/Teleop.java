package com.example.music.powerupscouting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Teleop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teleop);
    }

    public void navigateEndGame (View v){
        Intent intent = new Intent(this, EndGame.class);
        startActivity (intent);
    }


}
