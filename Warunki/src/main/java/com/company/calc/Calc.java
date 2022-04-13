package com.company.calc;

public class Calc {
    private final Addition addition;
    private final Subtraction subtraction;
    private final Multiplication multiplication;
    private final Division division;
    private final Exponentiation exponentiation;

    Calc(int first, int second) throws Exception {
        addition = new Addition(first, second);
        subtraction = new Subtraction(first, second);
        multiplication = new Multiplication(first, second);
        division = new Division(first, second);
        exponentiation  = new Exponentiation(first, second);
    }

    int add() {
        return addition.addition();
    }
}
