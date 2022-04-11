package main.java.com.company.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());


        for(int i = 1;  i <= 10 ; i++){
            int result;
            result = i * N;
            System.out.println(N + " x "+ i + " = "+ result);
        }



        bufferedReader.close();
    }
}
