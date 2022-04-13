package com.company.homework.Anagrams;

import com.company.homework.Tags.Tags;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramsTest {
    @Test
    void shouldAreTwoSameLenghtWords() {
        //given

        Anagrams word = new Anagrams ("Olga", "Mela");


        //when
        boolean result = word.checingTwoWordSize();

        //then
        assertEquals(result, "true" );
    }
     @Test
    void shouldGiveToFinalResult() {
        //given

        Anagrams word = new Anagrams ("Olga", "Mela");


        //when
        String result = word.checkingTwoWordsToSeeIfTheyAreAngrams();

        //then
        assertEquals(result, "Anagrams" );
    }



}