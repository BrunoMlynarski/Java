package com.company.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        text = text.replace("'"," ");
        text = text.replace(","," ");
        text = text.replace("!"," ");
        text = text.replace("?"," ");
        text = text.replace("."," ");
        text = text.replace("_"," ");
        text = text.replace("@"," ");

        String[] parts = text.split(" ");
        List<String> numbers = new ArrayList<>();
        for(int i = 0; i < parts.length; i++){
            if(!parts[i].isEmpty()){
                numbers.add(parts[i].trim());
            }
        }
        System.out.println(numbers.size());
        for(String s:numbers){
            System.out.println(s);
        }
    }
}

