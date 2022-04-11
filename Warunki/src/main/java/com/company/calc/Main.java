package main.java.com.company.calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Give a first number: ");
        Scanner firstNumber = new Scanner(System.in);
        int first = firstNumber.nextInt();

        System.out.println("Give a second number: ");
        Scanner secondNumber = new Scanner(System.in);
        int second = secondNumber.nextInt();

        try {
            Division division = new Division(first, second);
            System.out.printf("Wynik dzielenia dwoch liczb: %.2f%n", division.division());
//            System.out.format("%.2f",division.division());

            Calc calc = new Calc(first, second);
            System.out.println(calc.add());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



        Addition addition = new Addition(first, second);
        Subtraction subtraction = new Subtraction(first, second);
        Multiplication multiplication = new Multiplication(first, second);
        Exponentiation exponentiation  = new Exponentiation(first, second);



        //wywoluje obiekt i odnosze sie do utworzonego obiektu oraz na fuknkcji z danej klasy)
        System.out.println("Wynik dodawanie dwoch liczb: "+addition.addition());
        System.out.println("Wynik odejmowania dwoch liczb: "+subtraction.subtraction());
        System.out.println("Wynik mnozenia dwoch liczb: "+multiplication.multiplication());

        System.out.println("Wynik potegowania dwoch liczb: "+exponentiation.exponentiation());





    }
}
