package com.company.homework.tictactoe;

import java.util.Random;

import static com.company.homework.tictactoe.EnumTicTacToe.*;
import static com.company.homework.tictactoe.EnumTicTacToe.EMPTY;

public class GamePlayerVsBot {
    EnumTicTacToe[][] tictactoeboard = new EnumTicTacToe[3][3];
    PlayerName firstPlayer;
    PlayerName bot;

    GamePlayerVsBot() {
        complitingArray();
    }

    void complitingArray() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tictactoeboard[i][j] = EMPTY;
            }
        }
    }

    void start() {
        System.out.println("Start Game");
        firstPlayer = new PlayerName(InputProvider.retrievingPlayerNameFromTheUser(), X);
        bot = new PlayerName("Bot", O);
        printBoard();
        int i = 0;
        while (true) {
            PlayerName currentPlayer = currentPlayer(i);
            questionForPlayer(currentPlayer);
            Coordinate playerCoordinate = new Coordinate();
            try {
                addCoordinatePlayerInGameMap(playerCoordinate, currentPlayer);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }
            printBoard();
            if (!checkingIsTheWinnerOnThereRound()) {
                System.out.println("Game winner is player " + currentPlayer.name);
                break;
            }
            i++;
        }
    }

    void printBoard() {
        System.out.println("    1 2 3");
        System.out.println("1: |" + tictactoeboard[0][0].value() + "|" + tictactoeboard[0][1].value() + "|" + tictactoeboard[0][2].value() + "|");
        System.out.println("2: |" + tictactoeboard[1][0].value() + "|" + tictactoeboard[1][1].value() + "|" + tictactoeboard[1][2].value() + "|");
        System.out.println("3: |" + tictactoeboard[2][0].value() + "|" + tictactoeboard[2][1].value() + "|" + tictactoeboard[2][2].value() + "|");
    }

    boolean checkingIsTheWinnerOnThereRound() {
        if ((!tictactoeboard[0][0].equals(EMPTY) && tictactoeboard[0][0].equals(tictactoeboard[0][1]) && (tictactoeboard[0][0].equals(tictactoeboard[0][2]))) ||
                (!tictactoeboard[1][0].equals(EMPTY) && tictactoeboard[1][0].equals(tictactoeboard[1][1]) && (tictactoeboard[1][0].equals(tictactoeboard[1][2]))) ||
                (!tictactoeboard[2][0].equals(EMPTY) && tictactoeboard[2][0].equals(tictactoeboard[2][1]) && (tictactoeboard[2][0].equals(tictactoeboard[2][2]))) ||
                (!tictactoeboard[0][0].equals(EMPTY) && tictactoeboard[0][0].equals(tictactoeboard[1][0]) && (tictactoeboard[0][0].equals(tictactoeboard[2][0]))) ||
                (!tictactoeboard[0][1].equals(EMPTY) && tictactoeboard[0][1].equals(tictactoeboard[1][1]) && (tictactoeboard[0][1].equals(tictactoeboard[1][2]))) ||
                (!tictactoeboard[0][2].equals(EMPTY) && tictactoeboard[0][2].equals(tictactoeboard[1][2]) && (tictactoeboard[0][2].equals(tictactoeboard[2][2]))) ||
                (!tictactoeboard[0][0].equals(EMPTY) && tictactoeboard[0][0].equals(tictactoeboard[1][1]) && (tictactoeboard[0][0].equals(tictactoeboard[2][2]))) ||
                (!tictactoeboard[2][0].equals(EMPTY) && tictactoeboard[2][0].equals(tictactoeboard[1][1]) && (tictactoeboard[2][0].equals(tictactoeboard[0][2])))) {
            return false;
        } else {
            return true;
        }
    }

    void questionForPlayer(PlayerName currentPlayer) {
        System.out.println("Player " + currentPlayer.name + " where want to give your character ?");
    }

    PlayerName currentPlayer(int i) {
        if (i % 2 == 0) {
            return firstPlayer;
        } else {
            return bot;
        }
    }

    void addCoordinatePlayerInGameMap(Coordinate playerCoordinate, PlayerName currentPlayer) throws Exception {
        if (tictactoeboard[playerCoordinate.x - 1][playerCoordinate.y - 1] != EMPTY) {
            throw new Exception("You can't select already filled field");
        }
        tictactoeboard[playerCoordinate.x - 1][playerCoordinate.y - 1] = currentPlayer.sign;
    }

    void addCoordinatePlayerInGameMapBot(PlayerName currentPlayer) {
        while (true) {
            Random random = new Random();
            int randomFirstValue = random.nextInt(3);
            int randomSecondValue = random.nextInt(3);
            if (tictactoeboard[randomFirstValue][randomSecondValue] == EMPTY) {
                tictactoeboard[randomFirstValue][randomSecondValue] = currentPlayer.sign;
                return;
            }
        }
    }
}

