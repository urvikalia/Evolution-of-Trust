package com.tw.bootcamp;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Scanner;

public class InputReaderTest {

    @Test
    public void shouldAcceptConsoleInput() {

        InputReaderWrapper scanner =Mockito.mock(InputReaderWrapper.class);
        Mockito.when(scanner.nextLine()).thenReturn("CH");

        String stratergy=scanner.nextLine();
        Assert.assertEquals("CH",stratergy);

    }
}
