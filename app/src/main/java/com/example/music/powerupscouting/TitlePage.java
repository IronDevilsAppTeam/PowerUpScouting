package com.example.music.powerupscouting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.app.Application;

import static android.util.Log.d;

public class TitlePage extends AppCompatActivity {

    EditText etTeamNumber;
    EditText etMatchNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_page);

        etTeamNumber = (EditText)findViewById(R.id.Team_Number);
        etMatchNumber = (EditText)findViewById(R.id.Match_Number);
    }
    public void navigateMain (View v) {
        if(!etTeamNumber.getText().toString().equals("") && !etMatchNumber.getText().toString().equals("")) {

            ((GlobalVariables) this.getApplication()).scoutedTeam.teamNumber = Integer.parseInt(etTeamNumber.getText().toString());
            ((GlobalVariables) this.getApplication()).scoutedTeam.matchNumber = Integer.parseInt(etMatchNumber.getText().toString());
        }


        Intent intent = new Intent(this,Autonomous.class);
        startActivity(intent);
    }

}
