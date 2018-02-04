package ru.tim.lesson2;

import java.math.BigInteger;

public class ControlStructures {

    public static BigInteger factorial(int value) {
        BigInteger res = BigInteger.ONE;
        for (int i = 1; i <= value; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res; // your implementation here
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] res = new int [a1.length + a2.length];
        int a1Ptr = 0;
        int a2Ptr = 0;
        for (int i = 0; (a1Ptr != a1.length) && (a2Ptr != a2.length); i++){
            if(a1[a1Ptr] > a2[a2Ptr]){
                res[a1Ptr + a2Ptr] = a2[a2Ptr];
                a2Ptr++;
            }
            else{
                res[a1Ptr + a2Ptr] = a1[a1Ptr];
                a1Ptr++;
            }
        }
        while(a1Ptr < a1.length){
            res[a1Ptr + a2Ptr] = a1[a1Ptr];
            a1Ptr++;
        }
        while(a2Ptr < a2.length){
            res[a1Ptr + a2Ptr] = a2[a2Ptr];
            a2Ptr++;
        }
        return res; // your implementation here
    }

    private String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder res = new StringBuilder();
        for (String name : roles) {
            res.append(name).append(":\n");
            for (int i = 0; i < textLines.length; ++i){
                if(textLines[i].startsWith(name + ": ")){
                    res.append((i + 1)).append(") ").append(textLines[i].replaceFirst(name + ": ", "" ));
                    res.append("\n");
                }
            }
            res.append("\n");
        }
        return res.toString();
    }


}
