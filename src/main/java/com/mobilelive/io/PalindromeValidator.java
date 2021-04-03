package com.mobilelive.io;

import java.util.Objects;

public class PalindromeValidator {
    // saas -> saas (true)
    // a -> a (true)
    // aa -> aa (true)
    // ab -> ba (false)
    // null/empty -> false

    /**
     * Here is the efficient approach to solve this algorithm
     * Time complexity will be O(N)
     * Space complexity will be O(1)
     * Where N is number of characters
     * @param value
     *  @return
     * */
    public boolean isPalindrome(String value) {
        if(Objects.isNull(value) || value.isBlank()) {
            return Boolean.FALSE;
        }
        int low = 0;
        int high = value.length() - 1;
        while(low < high) {
            if(value.charAt(low++) != value.charAt(high--)) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }


    /**
     *  First i will do with Inefficient way
     *  Time complexity O(N) when we pass value in {@link StringBuilder}
     *  Time complexity O(N) when reverse will called {@link StringBuilder#reverse()}
     *  Space complexity will be O(N)
     *  Where N is the number of characters of value
     *  @param value
     *  @return
     */
    public boolean isPalindromeUsingStringBuilder(String value) {
        if(Objects.isNull(value) || value.isBlank()) {
            return Boolean.FALSE;
        }
        return value.equals(new StringBuilder(value).reverse().toString());
    }

}
