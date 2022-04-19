package com.company.homework.tictactoe;

import com.company.homework.Tags.Tags;
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
        FiledChoosingAndCompletingArray startAlert = new FiledChoosingAndCompletingArray();

        //when
        startAlert.start();

        //then
        assertEquals("Start Game", outputStreamCaptor.toString().trim());
    }
    @Test
    void shouldPrintStartGameMap(){
        //given
        FiledChoosingAndCompletingArray startAlert = new FiledChoosingAndCompletingArray();

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
    void takingPlayerNames(){
        //given
        FiledChoosingAndCompletingArray nameText = new FiledChoosingAndCompletingArray("ona);

                //when
    }
    @Test
    void ShouldGiveMeNotError(){
        //given
        FiledChoosingAndCompletingArray startAlert = new FiledChoosingAndCompletingArray();

        //when
        startAlert.start();

        //then
        assertEquals("Start Game", outputStreamCaptor.toString().trim());
    }


}