package com.company.homework.Login;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Login> logins = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();


        while(logins.size() < first) {
            String text = sc.nextLine();
            if (!text.isEmpty()) {
                logins.add(new Login(text));
            }
        }

        int count = logins.size();
        for(int i = 0; i < count ;i++){
            if(logins.get(i).checkingCharacters() == false){
                System.out.println("Invalid");
            }
            else if(logins.get(i).checkingFirstCharacter() == false){
                System.out.println("Invalid");
            }
            else if(logins.get(i).checkingLength() == false){
                System.out.println("Invalid");
            }
            else{
                System.out.println("Valid");
            }
        }
    }
}

