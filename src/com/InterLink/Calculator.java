package com.InterLink;

import java.util.List;

/**
 * Created by employee on 7/8/16.
 */
public class Calculator {
    public static int add(String input) {

        if (input.length() == 0) {
            return 0;
        }
        String customDelimiter = "\n";
        if (input.contains("//") == true) {
            customDelimiter = input;
            customDelimiter = customDelimiter.substring(0, customDelimiter.indexOf("\n")).substring(2);
            input = input.substring(3 + customDelimiter.length());
        }


        String[] digitsForAdding = input.split(",|\n|" + customDelimiter);

        int result = 0;
        for (String digit :
                digitsForAdding) {
            result += Integer.parseInt(digit);
        }
        return result;
    }
}
