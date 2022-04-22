package com.company.homework.tictactoe;

class CoordinateBot {
    int x = 0, y = 0;
    private static final int MAX = 3, MIN = 1 ;

    CoordinateBot() {
        while(true){

            Integer number = 0;
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
