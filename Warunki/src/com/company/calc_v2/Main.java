package com.company.calc_v2;

import com.company.calc.Addition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        System.out.println("Give me calcuation: ");
//        Scanner operation = new Scanner(System.in);
//        String data = operation.next();

        String in = "2 + 2";
        String[] data;
       if(in.contains("+")) {
           data = in.split("\\+");
       }
       else if(in.contains("-")){
            data = in.split("\\-");
       }
       else if(in.contains("*")){
           data = in.split("\\*");
       }
       else if(in.contains("/")){
           data = in.split("\\/");
       }
       else {
           throw new RuntimeException();
       }
        //pobieranie do zmiennej i zparsowanie do inta oraz urzycie trim na zmiennej data
        int first = Integer.parseInt(data[0].trim());
        int second= Integer.parseInt(data[1].trim());

        Addition addition = new Addition(first, second);
        System.out.println("Result: "+ +addition.addition());


        //String calculation = firstNumber.next(); // 2 + 3, 2+3, 2-3, a-a - error

    }
}
