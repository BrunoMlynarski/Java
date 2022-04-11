package main.java.com.company.students;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Wypisywanie wartości na konsole
        System.out.println("Podaj liczbe: ");

        //Pobieranie wartość
        Scanner take = new Scanner(System.in);

        int x = take.nextInt();

        //warunek if
        if (x < 0) {
            System.out.println("Liczba ujemna");
        } else {
            System.out.println("to jest liczba dodatnia");
        }

        //pętla for
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }


    }
}
