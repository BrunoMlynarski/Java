package com.company.homework.Tags;

import com.company.homework.Login.Login;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TagsTest {
    @Test
    void shouldNotRemoveAnythingWhenIsNoTag() {
        //given
        Tags  tags = new Tags ("Hello");

        //when
        String result = tags.betterCheckingText();

        //then
        assertEquals(result, "Hello" );
    }
    @Test
    void whenTagIsCorrectRemoveTag() {
        //given
        Tags  tags = new Tags ("<h1>hello</h1>");

        //when
        String result = tags.betterCheckingText();

        //then
        assertEquals(result, "hello" );
    }
    @Test
    void whenTextDontHaveTagReturnNone() {
        //given
        Tags  tags = new Tags ("<h1>world</h2>");

        //when
        String result = tags.betterCheckingText();

        //then
        assertEquals(result, "None" );
    }
    @Test
    void whenTextHaveMoreTags() {
        //given
        Tags  tags = new Tags ("<h1>very</h1><h2>good</h2>");

        //when
        String result = tags.betterCheckingText();

        //then
        assertEquals(result, "very good" );
    }
    @Test
    void whenTextHaveMoreTagsButInOtherConfiguration() {
        //given
        Tags  tags = new Tags ("<h1>@@@<h2></h1>ttt</h2>");

        //when
        String result = tags.betterCheckingText();

        //then
        assertEquals(result, "None" );
    }
}