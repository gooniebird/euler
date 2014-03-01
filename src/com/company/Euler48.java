package com.company;

import java.math.BigInteger;

public class Euler48 {

    public void go() {

        BigInteger sum = BigInteger.ZERO;
        for (int i = 1; i < 1001; i++) {
            sum = sum.add(BigInteger.valueOf(i).pow(i));
        }
        String resultStr = sum.toString();
        System.out.println("Result: " + resultStr.substring(resultStr.length() - 10, resultStr.length()));
    }
}
