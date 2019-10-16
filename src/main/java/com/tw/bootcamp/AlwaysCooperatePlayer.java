package com.tw.bootcamp;

public class AlwaysCooperatePlayer extends Player {

    @Override
    public MoveType play() {
        return MoveType.COOPERATE;
    }
}
