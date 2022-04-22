package com.company.homework.tictactoe;

import java.util.InputMismatchException;
import java.util.Scanner;

class InputProvider {



    void welcome(){
        System.out.println("Welcome in Tic-Tac-Toe game!");
    }
    static GameMode chooseGameMode(){
        Scanner gameModeScan = new Scanner(System.in);
        while (true) {
            System.out.println("Choose game mode.");
            System.out.println("1: player vs bot ");
            System.out.println("2: player vs player ");
            System.out.println("3: bot vs bot ");
            int gameMode = 0;
            try {
                gameMode = gameModeScan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please choose again game mode.");
                gameModeScan.next();
            }
            if (gameMode == 1) {
                return GameMode.BOT;
            } else if (gameMode == 2) {
                return GameMode.TWO_PLAYERS;
            } else if (gameMode == 3) {
                return GameMode.TWO_BOTS;
            }
        }
    }
    //this method retriving only one player name and return  it.
     static String retrievingPlayerNameFromTheUser(){
        Scanner scanName = new Scanner(System.in);
        System.out.println("Give the first player a name");
        String retrivingPlayerName = scanName.nextLine();

        return retrivingPlayerName;
    }
    static Integer retrivingCoordinateFromTheUser(){
        Scanner scanCoordinate = new Scanner(System.in);
        Integer number = 0;
        try{
            String retrivingCoordinate = scanCoordinate.nextLine();
            number = Integer.valueOf(retrivingCoordinate);
        }
        catch(NumberFormatException exception){
            System.out.println("Please enter a valid coordinate");
        }
        return number;
    }
}

