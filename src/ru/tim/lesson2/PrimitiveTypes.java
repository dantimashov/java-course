package ru.tim.lesson2;

public class PrimitiveTypes {

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return (a & b & (!c) & (!d)) | (a & (!b) & c & (!d)) | (a & (!b) & (!c) & d) | ((!a) & b & c & (!d)) | ((!a) & b & (!c) & d) | ((!a) & (!b) & c & d);
    }

    public static int leapYearCount(int year) {
        int a = (year - (year % 4)) / 4;
        int b = (year - (year % 100)) / 100;
        int c = (year - (year % 400)) / 400;
        return a - b + c;
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs((a + b) - c) < 1e-4;
    }

    public static int flipBit(int value, int bitIndex) {
        if((value >> (bitIndex - 1)) % 2 == 0){
            return value + (int)Math.pow(2, bitIndex - 1);
        }
        else{
            return value - (int)Math.pow(2, bitIndex - 1);
        }
    }
}
