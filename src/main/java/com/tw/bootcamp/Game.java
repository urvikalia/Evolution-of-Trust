package com.tw.bootcamp;

public class Game {

    private Player p1;
    private Player p2;
    private int numberOfRounds;

    public Game(Player p1, Player p2, int rounds) {
        this.p1 = p1;
        this.p2 = p2;
        numberOfRounds = rounds;
    }

    public void compute() {

        for (int count = 0; count < numberOfRounds; count++) {

            MoveType moveType1 = p1.play();
            MoveType moveType2 = p2.play();

            updateScore(moveType1, moveType2);
        }

    }

    private void updateScore(MoveType moveType1, MoveType moveType2) {
        if (moveType1.equals(MoveType.COOPERATE) && moveType2.equals(MoveType.COOPERATE)) {
            this.p1.addScore(2);
            this.p2.addScore(2);
        }
        else if(moveType1.equals(MoveType.CHEAT) && moveType2.equals(MoveType.CHEAT))
        {
            this.p1.addScore(0);
            this.p2.addScore(0);
        }else if(moveType1.equals(MoveType.COOPERATE) && moveType2.equals(MoveType.CHEAT))
        {
            this.p1.addScore(-1);
            this.p2.addScore(3);
        }
        else if(moveType1.equals(MoveType.CHEAT) && moveType2.equals(MoveType.COOPERATE))
        {
            this.p1.addScore(3);
            this.p2.addScore(-1);
        }
    }
}
