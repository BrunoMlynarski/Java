package main.java.com.company.homework;

import java.util.Scanner;

public class P1 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
            //double d = scan.nextDouble();
            Double d = scan.nextDouble();
            String s = "";
            while(scan.hasNextLine()){
                s += scan.nextLine();
            }

            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);

    }
}
