package com.example.music.powerupscouting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TitlePage extends AppCompatActivity {

    EditText etTeamNumber;
    EditText etMatchNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_page);
    }
    public void navigateMain (View v) {
        Intent intent = new Intent(this,Autonomous.class);
        startActivity(intent);
    }

}
