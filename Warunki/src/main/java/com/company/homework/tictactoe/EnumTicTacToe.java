package com.company.homework.tictactoe;

public enum EnumTicTacToe {
    X("X"), O("O"), EMPTY("_");
    private String value;

    EnumTicTacToe(String s) {
        value = s;
    }

    String value() {
        return this.value;
    }

}
