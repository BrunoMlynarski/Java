package com.company.homework.tictactoe;

class PlayerName implements Player {
    String name ;
    EnumTicTacToe sign ;
    PlayerName(String name, EnumTicTacToe sign){
        this.name = name;
        this.sign = sign;
    }


    @Override
    public String name() {
        return name;
    }

    @Override
    public EnumTicTacToe sign() {
        return sign;
    }
}
