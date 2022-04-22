package com.company.homework.tictactoe;

class BotName implements Player {
    EnumTicTacToe sign;

    BotName(EnumTicTacToe sign) {
        this.sign = sign;
    }

    @Override
    public String name() {
        return "BOT";
    }

    @Override
    public EnumTicTacToe sign() {
        return sign;
    }


}
