package com.InterLink;

import java.util.List;

/**
 * Created by employee on 7/8/16.
 */
public class Calculator {
    public static int add(String input){

        if (input.length()==0){return 0;}
        String[] digitsForAdding=input.split(",");
        int result=0;
        if (digitsForAdding.length==1){result+=Integer.parseInt(digitsForAdding[0]);}
        if (digitsForAdding.length==2){
            result+=Integer.parseInt(digitsForAdding[0])+Integer.parseInt(digitsForAdding[1]);
        }
        if (digitsForAdding.length>2){
            throw new RuntimeException("You must enter now more than 2 numbers");
        }
        return result;
    }
}
