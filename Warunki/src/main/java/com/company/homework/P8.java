package main.java.com.company.homework;

import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        Integer number = scan.nextInt();

        if(number >= -100 && number <= 100) {
            System.out.println("Good job");
        }
        else{
            System.out.print("Wrong answer");
        }

    }
}


