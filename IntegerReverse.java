package com.scratchy.hackerrank;

/**
 *
 * @version 1.0 25/09/20
 * @author scratchy
 */

public class IntegerReverse {
    private static StringBuilder reversedNumber = new StringBuilder();

    public static int reverse(int value) {
        if(isNull(value))
            return 0;

        if (isNegative(value)) {
            value = Math.abs(value);
            reversedNumber.append("-");
        }
        return getReversedNumber(value);
    }

    private static boolean isNull(int value){
        return value == 0;
    }

    private static boolean isNegative(int value){
        return value > 0;
    }

    private static int getReversedNumber(int value){
        while (value > 0){
            if(value % 10 == 0)
                reversedNumber.append("0");
            else {
                reversedNumber.append(value % 10);
            }
            value = value / 10;
        }
        return getIntegerFromString(reversedNumber.toString());
    }

    private static int getIntegerFromString(String string) {
        Integer result;
        try {
            result = new Integer(string);
        } catch (NumberFormatException exc) {
            return 0;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(reverse(12020));
    }
}