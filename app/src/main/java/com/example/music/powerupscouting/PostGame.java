package com.example.music.powerupscouting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;

public class PostGame extends AppCompatActivity {

    RadioGroup radCardGiven;
    RadioGroup radMatchResults;
    EditText etRelevantComments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_game);
    }



}
