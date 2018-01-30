package ru.tim.lesson2;

public class TypeConversion {

    public static char charExpression(int a) {
        return (char)('\\' + a);
    }

    public static boolean isPowerOfTwo(int value) {
        return (Integer.bitCount(Math.abs(value)) == 1);
    }
}
