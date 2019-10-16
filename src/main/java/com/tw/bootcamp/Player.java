package com.tw.bootcamp;

public abstract class Player {

    private int score;

    public int getScore() {
        return score;
    }

    public abstract MoveType play();

    public void addScore(int currScore){
        score+= currScore;
    }
}
