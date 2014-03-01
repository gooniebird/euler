package com.company;

public class PrimeChecker {

    private static final int LOWER_LIM = 2;
    public static boolean isPrime(int num) {

        if (num < LOWER_LIM) {
            return false;
        }

        int upper_lim = (int)Math.sqrt(num);
        for (int i = LOWER_LIM;i <= upper_lim;i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPrimeSimple(int num) {
        if (num < LOWER_LIM) {
            return false;
        }

        int upper_lim = num / 2;
        for (int i = LOWER_LIM;i < upper_lim;i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;

    }

    public static boolean isPrimeSuperSlow(int num) {
        if (num < LOWER_LIM) {
            return false;
        }

        int upper_lim = num - 1;
        for (int i = LOWER_LIM;i < upper_lim;i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;

    }

}
