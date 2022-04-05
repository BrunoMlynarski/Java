package com.company.calc;

public class Addition {

    private int x, y;

    public Addition(int x, int y){
        this.x = x ;
        this.y = y;
    }

    public int addition(){
        int result;
        result= x + y;
        return result;
    }
}
