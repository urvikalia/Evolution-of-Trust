package com.tw.bootcamp;

public class AlwaysCheatPlayer extends Player {

    @Override
    public MoveType play() {
        return MoveType.CHEAT;
    }
}
