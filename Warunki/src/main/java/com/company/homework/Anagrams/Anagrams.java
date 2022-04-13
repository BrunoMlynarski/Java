package com.company.homework.Anagrams;

 class Anagrams {
     private String firstWord;
     private String secondWord;

     Anagrams(String firstWord, String secondWord) {
         this.firstWord = firstWord;
         this.secondWord = secondWord;
     }

     String checkingTwoWordsToSeeIfTheyAreAngrams() {
         boolean twoWordsAreCorrect;
         String finalResult= "";
         if(firstWord.length() != secondWord.length()){
             twoWordsAreCorrect = false;
         }
         else {
             twoWordsAreCorrect = true ;
         }

         firstWord.toUpperCase();
         secondWord.toUpperCase();
         if(!twoWordsAreCorrect){
             for(int i = 0;i <= firstWord.length(); i++)
             {
                 if(firstWord.charAt(i) == secondWord.charAt(i)){
                 }
                 else{
                     twoWordsAreCorrect == false;
                 }

             }
         }

         if(!twoWordsAreCorrect){
             finalResult = "Not Anagrams";
         }
         else{
             finalResult = "Anagrams";
         }
        return finalResult ;
     }
}
