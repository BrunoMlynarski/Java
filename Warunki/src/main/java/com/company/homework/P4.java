package com.company.homework;

import java.util.Scanner;

public class P4 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int y = 1; y <= n; y++){
                int result = a;
                result = result * b + 2;
                System.out.println(result);

                //trzeba dokończyć zaponialem spisac rozwiazania

            }

        }



        in.close();
    }
}
