package com.mobilelive.io;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Fibonacci {
    //  0, 1, 1, 2, 3, 5, 8, 13, 21 ....

    /**
     * @param number
     * @return
     */
    private int fibonacciRecursive(int number) {
        if(number == 0)
            return 0;
        if(number <= 2)
            return 1;

        return fibonacciRecursive(number - 2) + fibonacciRecursive(number - 1);
    }


    /**
     * Time complexity O(N2), O(N) for looping over number and O(N) for recursive call
     * Space complexity will be O(N)
     * Where N is the number requested
     * @param number
     * @return
     */
    public List<Integer> getFibonacciUsingRecursion(int number) {
        if(number < 0)
            throw new IllegalArgumentException("Number ["+number+"] can not be negative");
        List<Integer> fibonacci = new ArrayList<>();
        IntStream.range(0, number).forEach(i -> fibonacci.add(fibonacciRecursive(i)));
        return fibonacci;
    }

    /**
     * Time complexity will be O(N)
     * Space complexity will be O(N)
     * Where N is the number requested
     * @param number
     * @return
     */
    public List<Integer> getFibonacciUsingList(int number) {
        if(number < 0)
            throw new IllegalArgumentException("Number ["+number+"] can not be negative");
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        IntStream.range(2, number)
                .forEach(i -> fibonacci.add(fibonacci.get(i - 2) + fibonacci.get(i - 1)));
        return fibonacci;
    }

}
