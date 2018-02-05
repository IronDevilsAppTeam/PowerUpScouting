package com.example.music.powerupscouting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Teleop extends AppCompatActivity {

    RadioGroup radExchangeRecieve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teleop);

        radExchangeRecieve = (RadioGroup) findViewById(R.id.exchangeChoice);
    }

    public void navigateEndGame (View v){
        switch (radExchangeRecieve.getCheckedRadioButtonId()) {
            case R.id.exchangeChoice:
                ((GlobalVariables) this.getApplication()).scoutedTeam.exchangeReceive = true;
                break;
        }
        Intent intent = new Intent(this, EndGame.class);
        startActivity (intent);
    }


}
