package com.InterLink;

import java.util.List;

/**
 * Created by employee on 7/8/16.
 */
public class Calculator {
    public static int add(String input){

        if (input.length()==0){return 0;}
        String[] digitsForAdding=input.split(",|\n");
        int result=0;
        for (String digit :
                digitsForAdding) {
            result += Integer.parseInt(digit);
        }
        return result;
    }
}
