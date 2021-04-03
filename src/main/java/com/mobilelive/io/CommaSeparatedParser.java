package com.mobilelive.io;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CommaSeparatedParser {

    private static final String EMPTY = "";
    private static final String EVEN_PREFIX = "e";
    private static final String ODD_PREFIX = "o";
    private static final String COMMA = ",";

    // [] -> ""
    // null -> ""
    // [12, 11] -> e12,o11

    /**
     * Time complexity O(N)
     * Space complexity O(1)
     * Where N is the number of data
     *
     * @param data
     * @return
     */
    public String parse(List<Integer> data) {
        if (Objects.isNull(data) || data.isEmpty()) {
            return EMPTY;
        }
        return data
                .stream()
                .map(this::parseInteger)
                .collect(Collectors.joining(COMMA));
    }

    /**
     * @param value
     * @return
     */
    public String parseInteger(int value) {
        int mod = value % 2;
        return switch (mod) {
            case 0 -> EVEN_PREFIX + value;
            case 1 -> ODD_PREFIX + value;
            default -> throw new IllegalStateException("Unexpected value: " + mod);
        };
    }

}
