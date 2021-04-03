package com.mobilelive.io;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommaSeparatedParserTest {

    public CommaSeparatedParser parser;
    private static final String EMPTY = "";

    @BeforeEach
    public void setUp() {
        parser = new CommaSeparatedParser();
    }

    @Test
    public void parseNullList() {
        String result = parser.parse(null);
        assertEquals(EMPTY, result);
    }

    @Test
    public void parseEmptyList() {
        String result = parser.parse(Arrays.asList());
        assertEquals(EMPTY, result);
    }

    @Test
    public void parseList() {
        String result = parser.parse(Arrays.asList(2, 13, 16, 1, 6));
        assertEquals("e2,o13,e16,o1,e6", result);
    }
}
