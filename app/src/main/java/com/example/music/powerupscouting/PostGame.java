package com.example.music.powerupscouting;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

import java.io.File;
import java.io.FileWriter;

public class PostGame extends AppCompatActivity {

    RadioGroup radCardGiven;
    RadioGroup radMatchResults;
    EditText etRelevantComments;


    public void createFile(View v){

        switch (radCardGiven.getCheckedRadioButtonId()){
            case R.id.noCard:
                ((GlobalVariables) this.getApplication()).scoutedTeam.cardGiven = 0;
                break;
            case R.id.yellowCard:
                ((GlobalVariables) this.getApplication()).scoutedTeam.cardGiven = 1;
                break;
            case R.id.redCard:
                ((GlobalVariables) this.getApplication()).scoutedTeam.cardGiven = 2;
                break;
        }
        switch (radMatchResults.getCheckedRadioButtonId()){
            case R.id.resultsWin:
                ((GlobalVariables) this.getApplication()).scoutedTeam.matchResult = 2;
                break;
            case R.id.resultsTie:
                ((GlobalVariables) this.getApplication()).scoutedTeam.cardGiven = 1;
                break;
            case R.id.resultsLoss:
                ((GlobalVariables) this.getApplication()).scoutedTeam.cardGiven = 0;
                break;
        }
        ((GlobalVariables) this.getApplication()).scoutedTeam.relevantComments = etRelevantComments.getText().toString();

        String fileName = "PowerUpScouting.csv";
        File PowerUpScouring = new File(Environment.getExternalStorageDirectory(), "PowerUp Scouting 2018");
        PowerUpScouring.mkdirs();
        File outputFile = new File(PowerUpScouring, fileName);
        try{
            Boolean isExists = outputFile.exists();
            outputFile.createNewFile();
            FileWriter fw = new FileWriter(outputFile,true);
            String header = ("Team Number,Match Number,Crosses Baseline,Places Block In Scale In Auto,Places Block In Switch in Auto,Has Control of Scale at End of Auto,Recieves Blocks From Exhange,Parks on Platform,Climbs in Endgame,Supports Robots in Climbing,Recieves Ranking Point in Endgame,Cards Given,Match Result,Comments About Team During Match");
            String scoutingData = ((GlobalVariables)this.getApplication()).scoutedTeam.teamNumber + "," + ((GlobalVariables)this.getApplication()).scoutedTeam.matchNumber + "," + ((GlobalVariables)this.getApplication()).scoutedTeam.autoCross + "," + ((GlobalVariables)this.getApplication()).scoutedTeam.autoScaleBlock + "," + ((GlobalVariables)this.getApplication()).scoutedTeam.autoSwitchBlock + "," + ((GlobalVariables)this.getApplication()).scoutedTeam.scaleControl + "," + ((GlobalVariables)this.getApplication()).scoutedTeam.exchangeReceive + "," + ((GlobalVariables)this.getApplication()).scoutedTeam.platformPark + "," + ((GlobalVariables)this.getApplication()).scoutedTeam.endClimb + "," + ((GlobalVariables)this.getApplication()).scoutedTeam.climbSupport + "," + ((GlobalVariables)this.getApplication()).scoutedTeam.endRank + "," + ((GlobalVariables)this.getApplication()).scoutedTeam.cardGiven + "," + ((GlobalVariables)this.getApplication()).scoutedTeam.matchResult + "," + ((GlobalVariables)this.getApplication()).scoutedTeam.relevantComments;
            if(!isExists)
                fw.append(header + "\n");
            fw.append(scoutingData + "\n");
            fw.close();
        }catch (Exception e) {
            e.printStackTrace();
        }

        Intent intent = new Intent(this, TitlePage.class);
        startActivity(intent);
    }

}

