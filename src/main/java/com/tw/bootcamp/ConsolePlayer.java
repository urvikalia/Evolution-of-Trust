package com.tw.bootcamp;

public class ConsolePlayer extends Player {

    private InputReaderWrapper inputReaderWrapper;

    public ConsolePlayer(InputReaderWrapper inputReaderWrapper) {
        super();
        this.inputReaderWrapper = inputReaderWrapper;
    }

    @Override
    public MoveType play() {
        //TODO : do while loop for input error
        return MoveType.valueOf(inputReaderWrapper.nextLine());

    }
}
