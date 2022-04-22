package com.company.homework.tictactoe;

import org.junit.jupiter.api.Test;

import static com.company.homework.tictactoe.EnumTicTacToe.O;
import static com.company.homework.tictactoe.EnumTicTacToe.X;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    @Test
    void shoudWin() throws Exception {
        Game game = new Game(new BotName(X), new BotName(O));

        game.addCoordinatePlayerInGameMap(new Coordinate(1, 1), new BotName(O));
        game.addCoordinatePlayerInGameMap(new Coordinate(1, 2), new BotName(X));
        game.addCoordinatePlayerInGameMap(new Coordinate(1, 3), new BotName(O));
        game.addCoordinatePlayerInGameMap(new Coordinate(2, 2), new BotName(X));
        game.addCoordinatePlayerInGameMap(new Coordinate(2, 3), new BotName(X));
        game.addCoordinatePlayerInGameMap(new Coordinate(3, 1), new BotName(X));
        game.addCoordinatePlayerInGameMap(new Coordinate(3, 3), new BotName(O));

        game.printBoard();
        assertTrue(game.checkingIsTheWinnerOnThereRound());
    }
}