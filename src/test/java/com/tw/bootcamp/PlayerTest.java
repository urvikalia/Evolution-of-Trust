package com.tw.bootcamp;

import org.junit.Assert;
import org.junit.Test;

public class PlayerTest {

    @Test
    public void shouldReturnCooperate() {
        Player player = new AlwaysCooperatePlayer();
        String played=player.play().toString();
        Assert.assertEquals("COOPERATE",played);
    }

    @Test
    public void shouldReturnAlwaysCheatPlayer() {
        Player player=new AlwaysCheatPlayer();
        String played = player.play().toString();
        Assert.assertEquals("CHEAT",played);
    }




}
