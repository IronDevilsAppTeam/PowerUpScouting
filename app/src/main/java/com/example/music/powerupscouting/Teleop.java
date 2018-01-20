package com.example.music.powerupscouting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Teleop extends AppCompatActivity implements View.OnClickListener{
    private Button btn;
    private int numtest = +1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teleop);
        btn = (Button) findViewById(R.id.scalePlus);
        btn.setOnClickListener((View.OnClickListener) this);
    }

    public void navigateEndGame (View v){
        Intent intent = new Intent(this, EndGame.class);
        startActivity (intent);
    }

    @Override
    public void onClick(View v) {
        btn.setText(+1);
    }


    public void addone(View v){
        numtest+=1;
        TextView t = (TextView) findViewById(R.id.scaleDisplay);
        t.setText(numtest+"");


    }

}
