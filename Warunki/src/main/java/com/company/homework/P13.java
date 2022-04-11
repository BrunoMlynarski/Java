package main.java.com.company.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P13 {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int value = 0;

        while(words.size() < first){
            String text = sc.nextLine();
            if(!text.isEmpty()) {
                words.add(text);
            }
        }
        int count = words.size();

        for(int i = 0; i < count; i++){
            value = 0;

            for(int j = 0; j < words.get(i).length(); j++) {

                if((words.get(i).charAt(j) >= 97 && words.get(i).charAt(j) <= 122 )||
                        (words.get(i).charAt(j) >= 65 && words.get(i).charAt(j) <= 90 )||
                        (words.get(i).charAt(j) >= 48 && words.get(i).charAt(j) <= 57 )||
                        (words.get(i).charAt(j) == 95)){
                    value = 0;
                }
                else{
                    value = 1;
                    break;
                }
            }
                    if(words.get(i).length() < 8){
                        System.out.println("Invalid");
                    }
                    else if(words.get(i).length() > 30){
                        System.out.println("Invalid");
                    }
                    else if(!(words.get(i).charAt(0) >= 65 && words.get(i).charAt(0) <= 90 )){
                        System.out.println("Invalid");
                    }
                    else if(value == 1){
                        System.out.println("Invalid");
                    }
                    else{
                        System.out.println("Valid");
                    }
        }
    }
}
// 3 9 literka

//
