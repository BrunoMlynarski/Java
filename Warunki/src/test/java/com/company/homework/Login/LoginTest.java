package com.company.homework.Login;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginTest {
    @Test
    void checkingCharacters() {
        //given
        Login login = new Login ("@@@");

        //when
        boolean result = login.checkingCharacters();

        //then
        assertEquals(result, false );
    }
    @Test
    void checkingLength() {
        //given
        Login login = new Login ("ubud");

        //when
        boolean result = login.checkingLength();

        //then
        assertEquals(result, false );
    }
    @Test
    void checkingFirstCharacter(){
        //given
        Login login = new Login ("aawdsaw");

        //when
        boolean result = login.checkingFirstCharacter();

        //then
        assertEquals(result, false);
    }

}