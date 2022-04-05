package com.company.calc;

public class Division {

    int x , y;

    Division(int x, int y) throws Exception {
        checkNumber(y);
        this.x = x ;
        this.y = y;

    }

    //

    public void checkNumber(int y) throws Exception {
        if (y == 0) {
            throw new Exception("Can not division by  0");
        }
    }
    double division(){
        double result;
        //konwertowanie do doubla (doble) x
        result= (double) x / (double) y;
        return result;
    }

}
