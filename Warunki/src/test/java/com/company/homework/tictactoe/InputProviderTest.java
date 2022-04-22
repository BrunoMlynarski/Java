package com.company.homework.tictactoe;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static com.company.homework.tictactoe.GameMode.BOT;
import static com.company.homework.tictactoe.GameMode.TWO_PLAYERS;
import static org.junit.jupiter.api.Assertions.*;

class InputProviderTest {
    @Test
    void shouldReturnOnePlayerWhenInputIs1(){
    //given
    String input = "1";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    //when
    System.setIn(in);

    //then
    assertEquals(BOT, InputProvider.chooseGameMode());
    }

    @Test
    void shouldReturnOnePlayerWhenInputIs2(){
        //given
        String input = "2";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        //when
        System.setIn(in);

        //then
        assertEquals(TWO_PLAYERS, InputProvider.chooseGameMode());
    }

    @Test
    void shouldReturnPlayerNames(){
        //given
        String returnPlayerName = "Mario";
        InputStream in = new ByteArrayInputStream(returnPlayerName.getBytes());
        //when
        System.setIn(in);

        //then
        assertEquals("Mario", InputProvider.retrievingPlayerNameFromTheUser());
    }
}