package com.company.homework.Tags;

import com.company.homework.Login.Login;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Tags2> tags = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        while (tags.size() < value) {
            String text = scan.nextLine();
            if (!(text.isEmpty())) {
                tags.add(new Tags2(text));
            }
        }
        for (Tags2 tag : tags) {
            System.out.println(tag.removeText());
        }

    }
}
 class Tags2 {
    private String text;

    Tags2(String text){
        this.text = text;
    }



    String removeText() {
        String tag = "";
        String result = text;
        int size = result.length();
        boolean found = false;
        for(int i = 0; i < size;i++){
            if(result.charAt(i) == '>'){
                found = false;
                if (result.contains("</" + tag + ">")) { //tags.get(j)
                    result = result.replace("<" + tag + ">", "");
                    result = result.replace("</" + tag + ">", "");
                    size = result.length();
                    i = 0;
                } else if (tag == "") {
                } else {
                    return "None";
                    //nie wiem czy tu nie ma być break
                }
                tag = ""; //Rest of tag
                //break;
            }
            if(found){
                tag += result.charAt(i);

            }
            if(result.charAt(i) == '<'){
                found = true;
            }

        }
        System.out.println(tag);

        return result;
    }


}

