package com.company.calc;

public class Exponentiation {

    int x, y;

    Exponentiation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int exponentiation(){
        int result = x;
        for(int i = 1; i < y; i++){

            result = result * x;
        }
        return result;
    }
}
