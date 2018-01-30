package ru.tim.lesson2;

public class ArraysAndStrings {

    public static boolean isPalindrome(String text) {
        String finStr = text.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        StringBuilder s = new StringBuilder(finStr);
        return finStr.equals(s.reverse().toString());
    }

}
