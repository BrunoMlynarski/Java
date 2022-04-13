package com.company.homework.Tags;

import java.util.ArrayList;
import java.util.List;

public class Tags {
    private String text;

    Tags(String text){
        this.text = text;
    }
//            if (result.contains("</" + tag + ">")) { //tags.get(j)
//                result = result.replace("<" + tag + ">", "");
//                result = result.replace("</" + tag + ">", "");
//                size = result.length();


    String betterCheckingText() {
        String firstTag = "";
        String secondTag = "";
        String result = text;
        String temporaryResult = "";
        String finalScore = "";

        int size = result.length();
        boolean found = false;
        int value = 0;
        for (int i = 0; i < size; i++) {//  hunting to first tag and now hunting to secondtag
            if (secondTag.isEmpty()) {
                if (result.charAt(i) == '>') {
                    found = false;
                    value = i ;
                }
                if (found) {
                    firstTag += result.charAt(i);
                    //int j = i + 1;
                    if (result.charAt(i) == '/') {
                        firstTag = "";
                        found = false;
                    }

                }
                if (result.charAt(i) == '<') {
                    found = true;
                }
            }
            else {
                temporaryResult = temporaryResult + result.charAt(i);
                if (result.charAt(i) == '>') {
                    found = false;
                }
                if (found) {
                    secondTag += result.charAt(i);
                    if (!(result.charAt(i) == '/')) {
//                        firstTag = "";
                        found = false;
                    }
                }
                if (result.charAt(i) == '<') {
                    found = true;
                }

            if(firstTag.equals(secondTag.substring(1,secondTag.length() - 1))){
                finalScore = finalScore +" "+temporaryResult;
            }
            else if(!(firstTag.equals(secondTag.substring(1,secondTag.length() - 1)))){
                firstTag = "";
                secondTag = "";
                temporaryResult = "";
                i = value;
            }
            else{
                finalScore = "None";
            }
            }
            //return finalScore;
        }
        System.out.println(finalScore);
        return finalScore;
    }
}




