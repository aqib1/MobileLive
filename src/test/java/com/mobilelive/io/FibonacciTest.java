package com.mobilelive.io;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonacciTest {
    private Fibonacci fibonacci;

    @BeforeEach
    public void setUp() {
        fibonacci = new Fibonacci();
    }

    @Test
    public void testGetFibonacciUsingListWithNegativeValue() {
        assertThrows(IllegalArgumentException.class, () ->
            fibonacci.getFibonacciUsingList(-1)
        );
    }

    @Test
    public void testGetFibonacciUsingRecursionWithNegativeValue() {
        assertThrows(IllegalArgumentException.class, () ->
            fibonacci.getFibonacciUsingRecursion(-1)
        );
    }

    @Test
    public void testGetFibonacciUsingList() {
        List<Integer> fibonacciList = fibonacci.getFibonacciUsingList(8);
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13), fibonacciList);
    }

    @Test
    public void testGetFibonacciUsingRecursion() {
        List<Integer> fibonacciList = fibonacci.getFibonacciUsingRecursion(8);
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13), fibonacciList);
    }
}
