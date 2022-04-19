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

    static EnumTicTacToe from(String value) throws Exception {
        if ("X".equals(value)){
            return X;
        }
        else if("O".equals(value)){
            return O;
        }
        else {
            throw new Exception("true value is only X or O");
        }
    }
}
