package com.company.homework.tictactoe;

import static com.company.homework.tictactoe.EnumTicTacToe.O;
import static com.company.homework.tictactoe.EnumTicTacToe.X;

public class Tictactoe {
    public static void main(String[] args) {
        InputProvider mainMenu = new InputProvider();
        mainMenu.welcome();
        GameMode gameMode = InputProvider.chooseGameMode();

        if(gameMode == GameMode.TWO_PLAYERS) {
            Game game = new Game(new PlayerName(InputProvider.retrievingPlayerNameFromTheUser(), X), new PlayerName(InputProvider.retrievingPlayerNameFromTheUser(), O));
            game.start();
        } else if (gameMode == GameMode.BOT) {
            Game game = new Game(new PlayerName(InputProvider.retrievingPlayerNameFromTheUser(), X), new BotName(O));
            game.start();
        } else if(gameMode == GameMode.TWO_BOTS) {
            Game game = new Game(new BotName(X), new BotName(O));
            game.start();
        }

//        if(gameMode == GameMode.TWO_PLAYERS){
//             GamePlayerVsPlayer game = new GamePlayerVsPlayer();
//             game.start();
//        }
//        else if(gameMode == GameMode.BOT){
//            GamePlayerVsBot game = new GamePlayerVsBot();
//            game.start();
//        }

    }
}

