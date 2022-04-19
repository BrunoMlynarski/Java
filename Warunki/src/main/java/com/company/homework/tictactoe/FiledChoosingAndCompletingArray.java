package com.company.homework.tictactoe;

import java.util.Scanner;

import static com.company.homework.tictactoe.EnumTicTacToe.*;

public class FiledChoosingAndCompletingArray {
    EnumTicTacToe[][] tictactoeboard = new EnumTicTacToe[3][3];
    String countPlayer;
    String firstPlayerName;
    String secondPlayerName;
    int firstScan;
    int secondScan;
    String character;
    String playerCharacter = "EMPTY";

    FiledChoosingAndCompletingArray(){
    }

    void complitingArray() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tictactoeboard[i][j] = EMPTY;
            }
        }
    }
    void takingPlayersName(){
        Scanner scanName = new Scanner(System.in);
        System.out.println("Give the first player a name");
        firstPlayerName = scanName.nextLine();
        System.out.println("Give the second player a name");
        secondPlayerName = scanName.nextLine();
        scanName.close();
    }
    void start(){
        complitingArray();
        System.out.println("Start Game");
        for(int k = 0;k <9 ;k++){
            if(k% 2 == 0){
                countPlayer = "one";//firstPlayerName;
                playerCharacter = "X";
            }
            else{
                countPlayer = "two";//secondPlayerName;
                playerCharacter ="O";
            }
            printBoard();
            allAboutArray();
            if(!checkingIsTheWinnerOnThereRound()){
                System.out.println("Game winner is player "+ countPlayer);
                break;
            }
            //System.out.println(tictactoeboard);
        }
    }
    void printBoard(){
        System.out.println("Player "+countPlayer+" where want to give your character");
        System.out.println("    1 2 3");
        System.out.println("1: |"+ tictactoeboard[0][0].value() + "|"+ tictactoeboard[0][1].value() +"|"+ tictactoeboard[0][2].value() +"|");
        System.out.println("2: |"+ tictactoeboard[1][0].value() + "|"+ tictactoeboard[1][1].value() +"|"+ tictactoeboard[1][2].value() +"|");
        System.out.println("3: |"+ tictactoeboard[2][0].value() + "|"+ tictactoeboard[2][1].value() +"|"+ tictactoeboard[2][2].value() +"|");
    }

    void allAboutArray() {


        //tictactoeboard[0][0] = EnumTicTacToe.X;

        Scanner scan = new Scanner(System.in);
        System.out.println("Give First Coordinate: ");
        firstScan = scan.nextInt();
        System.out.println("Give Second Coordinate: ");
        secondScan = scan.nextInt();
        while (true) {
            try {
                character = playerCharacter;
                setCoordination();
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    boolean checkingIsTheWinnerOnThereRound() {
        if ((!tictactoeboard[0][0].equals(EMPTY) && tictactoeboard[0][0].equals(tictactoeboard[0][1]) && (tictactoeboard[0][0].equals(tictactoeboard[0][2]))) ||
                (!tictactoeboard[0][0].equals(EMPTY) && tictactoeboard[1][0].equals(tictactoeboard[1][1]) && (tictactoeboard[1][0].equals(tictactoeboard[1][2]))) ||
                        (!tictactoeboard[0][0].equals(EMPTY) && tictactoeboard[2][0].equals(tictactoeboard[2][1]) && (tictactoeboard[2][0].equals(tictactoeboard[2][2]))) ||
                                ( !tictactoeboard[0][0].equals(EMPTY) && tictactoeboard[0][0].equals(tictactoeboard[1][0]) && (tictactoeboard[0][0].equals(tictactoeboard[2][0])))||
                                        (!tictactoeboard[0][0].equals(EMPTY) && tictactoeboard[0][1].equals(tictactoeboard[1][1]) && (tictactoeboard[0][1].equals(tictactoeboard[1][2]))) ||
                                                (!tictactoeboard[0][0].equals(EMPTY) && tictactoeboard[0][2].equals(tictactoeboard[1][2]) && (tictactoeboard[0][2].equals(tictactoeboard[2][2])))||
                                                                (!tictactoeboard[0][0].equals(EMPTY) && tictactoeboard[0][0].equals(tictactoeboard[1][1]) && (tictactoeboard[0][0].equals(tictactoeboard[2][2]))) ||
                                                                        (!tictactoeboard[0][0].equals(EMPTY) && tictactoeboard[2][0].equals(tictactoeboard[1][1]) && (tictactoeboard[2][0].equals(tictactoeboard[0][2])))){
                                                                            return false;
        }
        else{
            return true;
        }
    }
    void setCoordination() throws Exception {
         tictactoeboard[firstScan-1][secondScan-1] = from(character);
    }

//    static  from(int second) throws Exception {
//        if (second < 0 && ){
//            return X;
//        }
//        else if("O".equals(value)){
//            return O;
//        }
//        else {
//            throw new Exception("true value is only X or O");
//        }
//    }
}
