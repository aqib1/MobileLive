package com.mobilelive.io;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeValidatorTest {

    private static final String EMPTY = "";
    private static final String NULL = null;
    private static final String BLANK = " ";
    private PalindromeValidator validator;

    @BeforeEach
    public void setUp() {
        validator = new PalindromeValidator();
    }

    @Test
    public void testPalindromeWithNullStr() {
        boolean result = validator.isPalindrome(NULL);
        assertFalse(result);
    }

    @Test
    public void testPalindromeWithEmptyStr() {
        boolean result = validator.isPalindrome(EMPTY);
        assertFalse(result);
    }

    @Test
    public void testPalindromeWithBlankStr() {
        boolean result = validator.isPalindrome(BLANK);
        assertFalse(result);
    }

    @Test
    public void testPalindromeWithValidString() {
        boolean result = validator.isPalindrome("abba");
        assertTrue(result);
    }

    @Test
    public void testPalindromeWithNonPalindrome() {
        boolean result = validator.isPalindrome("abab");
        assertFalse(result);
    }
}
