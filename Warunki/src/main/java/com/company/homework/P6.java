package com.company.homework;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int lineIndex = 1;
        //has.NextLine sprawdza czy bedzie coś jeszcze wpisywane.
        while(sc.hasNextLine()){

            String read = sc.nextLine();
            System.out.println( lineIndex +" "+ read);
            lineIndex += 1;
        }

    }
}
