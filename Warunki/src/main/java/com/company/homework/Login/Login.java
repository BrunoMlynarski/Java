package com.company.homework.Login;

public class Login {
    private String text;

    Login (String text){
        this.text = text;
    }

    boolean checkingCharacters(){
    for(int i = 0; i < text.length(); i++){
        if(!(isUnderScore(i) || isNumber(i) || isLowerLetter(i) || isUpperLetter(i))){
        return false;
        }
    }
    return true;
 }
    boolean checkingLength(){
        if(!(isShortLogin() && isLongLogin())){
            return false;
        }
        return true;
    }
    boolean checkingFirstCharacter(){
        if(!(isFirstUpperLetterCharacter() || isFirstLowerLetterCharacter())){
            return false;
        }
        return true;
    }


     private boolean isUnderScore(int j){
        return text.charAt(j) == 95;
    }
     private boolean isNumber(int j){
        return text.charAt(j) >= 48 && text.charAt(j) <= 57 ;
    }
    private boolean isUpperLetter(int j){
        return text.charAt(j) >= 65 && text.charAt(j) <= 90  ;
    }
    private boolean isLowerLetter(int j){
        return text.charAt(j) >= 97 && text.charAt(j) <= 122  ;
    }
    private boolean isShortLogin() {
        return text.length() >= 8;
    }
    private boolean isLongLogin(){
        return text.length() <= 30;
    }
    private boolean isFirstUpperLetterCharacter(){
     return text.charAt(0) >= 65 && text.charAt(0) <= 90 ;
    }
    private boolean isFirstLowerLetterCharacter(){
        return text.charAt(0) >= 97 && text.charAt(0) <= 122 ;
    }
}

