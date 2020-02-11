package com.tw.bootcamp;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

// sample gameTest
public class GameTest {


    @Test
    public void shouldComputeScoresForCooperate() {
        Player p1 =new AlwaysCooperatePlayer();
        Player p2 = new AlwaysCooperatePlayer();

        Game game =new Game(p1,p2, 1);
        game.compute();
        Assert.assertEquals(p1.getScore(),2);
        Assert.assertEquals(p2.getScore(),2);

    }

    @Test
    public void shouldComputeScoresForBothPlayersCooperating() {
        Player p1 =new AlwaysCooperatePlayer();
        Player p2 = new AlwaysCooperatePlayer();

        Game game =new Game(p1,p2,3);
        game.compute();
        Assert.assertEquals(p1.getScore(),6);
        Assert.assertEquals(p2.getScore(),6);
    }

    @Test
    public void shouldComputeScoresForBothPlayersCheating() {
        Player p1 =new AlwaysCheatPlayer();
        Player p2 = new AlwaysCheatPlayer();

        Game game =new Game(p1,p2,3);
        game.compute();
        Assert.assertEquals(p1.getScore(),0);
        Assert.assertEquals(p2.getScore(),0);
    }

    @Test
    public void shouldComputeScoresForCoperateAndCheat() {
        Player p1 =new AlwaysCooperatePlayer();
        Player p2 = new AlwaysCheatPlayer();

        Game game =new Game(p1,p2,3);
        game.compute();
        Assert.assertEquals(p1.getScore(),-3);
        Assert.assertEquals(p2.getScore(),9);
    }
    @Test
    public void shouldComputeScoresForCheatAndCoperate() {
        Player p1 =new AlwaysCheatPlayer();
        Player p2 = new AlwaysCooperatePlayer();

        Game game =new Game(p1,p2,3);
        game.compute();
        Assert.assertEquals(p1.getScore(),9);
        Assert.assertEquals(p2.getScore(),-3);
    }

    @Test
    public void shouldComputeScoresforConsolePlayers(){

         InputReaderWrapper inputReaderWrapper = Mockito.mock(InputReaderWrapper.class);
        Mockito.when(inputReaderWrapper.nextLine()).thenReturn("COOPERATE","CHEAT");

        Player p1 =new ConsolePlayer(inputReaderWrapper);

        inputReaderWrapper = Mockito.mock(InputReaderWrapper.class);
        Mockito.when(inputReaderWrapper.nextLine()).thenReturn("CHEAT","CHEAT");
        Player p2 = new ConsolePlayer(inputReaderWrapper);

        Game game =new Game(p1,p2,2);

        game.compute();
        Assert.assertEquals(p1.getScore(),-1);
        Assert.assertEquals(p2.getScore(),3);
    }


}
