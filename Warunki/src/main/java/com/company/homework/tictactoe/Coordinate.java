package com.company.homework.tictactoe;

import java.util.InputMismatchException;
import java.util.Scanner;

class Coordinate {
    int x = 0, y = 0;
    private static final int MAX = 3, MIN = 1 ;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Coordinate() {
        while(true){
            System.out.println("Give first coordinate: ");
            Integer number = InputProvider.retrivingCoordinateFromTheUser();
            if(number <= MAX && number >= MIN) {
                x = number;
                break;
            }
        }
        while(true){
            System.out.println("Give second coordinate: ");
            Integer number = InputProvider.retrivingCoordinateFromTheUser();
            if(number <= MAX && number >= MIN) {
                y = number;
                break;
            }
        }
    }
}
