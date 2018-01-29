package com.example.music.powerupscouting;

/**
 * Created by music on 1/29/2018.
 */

public class MatchInfo {


    // Pre Match
    public int teamNumber;
    public int matchNumber;

    //Auto
    public boolean autoCross;
    public boolean autoScaleBlock;
    public boolean autoSwitchBlock;
    public boolean scaleControl;

    //Teleop
    public boolean exchangeReceive;

    //End Game
    public boolean platformPark;
    public boolean endClimb;
    public boolean climbSupport;
    public boolean endRank;

    // Post Game
    public int cardGiven;
    public int matchResult;
    public String relevantComments;
}
