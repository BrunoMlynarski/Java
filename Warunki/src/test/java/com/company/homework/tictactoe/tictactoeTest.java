package com.company.homework.tictactoe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class tictactoeTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void shouldStartGameMustPrintAlert(){
    //given
        GamePlayerVsPlayer startAlert = new GamePlayerVsPlayer();

        //when
        startAlert.start();

        //then
        assertEquals("Start Game", outputStreamCaptor.toString().trim());
    }
    @Test
    void shouldPrintStartGameMap(){
        //given
        GamePlayerVsPlayer startAlert = new GamePlayerVsPlayer();

        //when
        startAlert.printBoard();
        String text = outputStreamCaptor.toString().trim();
        String[] stringTab = text.split("\n");

        //then
        assertEquals("Player One where want to give your O",stringTab[0] );
        assertEquals("    1 2 3",stringTab[1] );
        assertEquals("1: |_|_|_|",stringTab[2] );
        assertEquals("2: |_|_|_|",stringTab[3] );
        assertEquals("3: |_|_|_|",stringTab[4] );
    }
    @Test
    void ShouldGiveMeNotError(){
        //given
        GamePlayerVsPlayer startAlert = new GamePlayerVsPlayer();

        //when
        startAlert.start();

        //then
        assertEquals("Start Game", outputStreamCaptor.toString().trim());
    }





}