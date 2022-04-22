package com.company.homework.tictactoe;

import java.util.Random;

import static com.company.homework.tictactoe.EnumTicTacToe.EMPTY;

public class Game {
    EnumTicTacToe[][] tictactoeboard = new EnumTicTacToe[3][3];
    Player first;
    Player second;

    Game(Player first, Player second) {
        this.first = first;
        this.second = second;
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
        printBoard();
        int i = 0;
        while (true) {
            Player currentPlayer = currentPlayer(i);
            if (currentPlayer instanceof PlayerName) {
                questionForPlayer(currentPlayer);
                Coordinate playerCoordinate = new Coordinate();
                try {
                    addCoordinatePlayerInGameMap(playerCoordinate, currentPlayer);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    continue;
                }
            } else {
                addCoordinatePlayerInGameMapBot(currentPlayer);
            }

            printBoard();
            if (!checkingIsTheWinnerOnThereRound()) {
                System.out.println("Game winner is player " + currentPlayer.name());
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
        return (tictactoeboard[0][0].equals(EMPTY) || !tictactoeboard[0][0].equals(tictactoeboard[0][1]) || (!tictactoeboard[0][0].equals(tictactoeboard[0][2]))) &&
                (tictactoeboard[1][0].equals(EMPTY) || !tictactoeboard[1][0].equals(tictactoeboard[1][1]) || (!tictactoeboard[1][0].equals(tictactoeboard[1][2]))) &&
                (tictactoeboard[2][0].equals(EMPTY) || !tictactoeboard[2][0].equals(tictactoeboard[2][1]) || (!tictactoeboard[2][0].equals(tictactoeboard[2][2]))) &&
                (tictactoeboard[0][0].equals(EMPTY) || !tictactoeboard[0][0].equals(tictactoeboard[1][0]) || (!tictactoeboard[0][0].equals(tictactoeboard[2][0]))) &&
                (tictactoeboard[0][1].equals(EMPTY) || !tictactoeboard[0][1].equals(tictactoeboard[1][1]) || (!tictactoeboard[0][1].equals(tictactoeboard[1][2]))) &&
                (tictactoeboard[0][2].equals(EMPTY) || !tictactoeboard[0][2].equals(tictactoeboard[1][2]) || (!tictactoeboard[0][2].equals(tictactoeboard[2][2]))) &&
                (tictactoeboard[0][0].equals(EMPTY) || !tictactoeboard[0][0].equals(tictactoeboard[1][1]) || (!tictactoeboard[0][0].equals(tictactoeboard[2][2]))) &&
                (tictactoeboard[2][0].equals(EMPTY) || !tictactoeboard[2][0].equals(tictactoeboard[1][1]) || (!tictactoeboard[2][0].equals(tictactoeboard[0][2])));
    }

    void questionForPlayer(Player currentPlayer) {
        System.out.println("Player " + currentPlayer.name() + " where want to give your character ?");
    }

    Player currentPlayer(int i) {
        if (i % 2 == 0) {
            return first;
        } else {
            return second;
        }
    }

    void addCoordinatePlayerInGameMap(Coordinate playerCoordinate, Player currentPlayer) throws Exception {
        if (tictactoeboard[playerCoordinate.x - 1][playerCoordinate.y - 1] != EMPTY) {
            throw new Exception("You can't select already filled field");
        }
        tictactoeboard[playerCoordinate.x - 1][playerCoordinate.y - 1] = currentPlayer.sign();
    }

    void addCoordinatePlayerInGameMapBot(Player currentPlayer) {
        System.out.println("### " + currentPlayer.sign());
        Random random = new Random();
        while (true) {
            int randomFirstValue = random.nextInt(3);
            int randomSecondValue = random.nextInt(3);
            System.out.println(tictactoeboard[randomFirstValue][randomSecondValue].value() + "=" + randomFirstValue + "," + randomSecondValue);
            if (tictactoeboard[randomFirstValue][randomSecondValue] == EMPTY) {
                tictactoeboard[randomFirstValue][randomSecondValue] = currentPlayer.sign();
                return;
            }
        }
    }
}

