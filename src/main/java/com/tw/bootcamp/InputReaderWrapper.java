package com.tw.bootcamp;

import java.util.Scanner;

public class InputReaderWrapper {

    private Scanner scanner = new Scanner(System.in);

    public String nextLine(){
        return scanner.nextLine();
    }
}
