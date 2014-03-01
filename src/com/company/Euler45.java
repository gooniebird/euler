package com.company;

public class Euler45 {

    public void go() {
        boolean found = false;
        int n = 286;
        int x = 0;
//        while (!found) {
//
//            x = (n * (n + 1)) / 2;
//            found = isPentagonal(x) && isHexagonal(x);
//            n++;
//        }
        boolean tri = isTriangular(536911667);
        boolean pen = isPentagonal(536911667);
        boolean hex = isHexagonal(536911667);
        System.out.println(x);
    }

    private boolean isTriangular(int x) {
//        BigInteger d = BigInteger.valueOf(1 + (8 * x));
        double d  = StrictMath.sqrt(1 + (8 * x));
        if (d % 1 != 0) return false;
        double n = (-1 + d) / 2;
        return n % 1 == 0;
    }

    private boolean isPentagonal(int x) {
        double d  = Math.sqrt(1 + (24 * x));
        if (d % 1 != 0) return false;
        double n = (1 + d) / 6;
        return n % 1 == 0;
    }

    private boolean isHexagonal(int x) {
        double d  = Math.sqrt(1 + (8 * x));
        if (d % 1 != 0) return false;
        double n = (1 + d) / 4;
        return n % 1 == 0;
    }
}
