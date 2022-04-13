package com.company.homework;

import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        if(palindrom(A.toLowerCase()) == true) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    static boolean palindrom(String text){
        int h = text.length();

        for(int i = 0; i < h; i++) {
            if (text.charAt(i) != text.charAt(h - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
