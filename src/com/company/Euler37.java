package com.company;

import java.util.HashSet;
import java.util.Set;

public class Euler37 {

    public void go() {

        Set<Integer> results = new HashSet<>();
        int i = 10;
        int counter = 0;
        while(counter != 11) {
            if (isPrime(i)) {
                if (checkSubstrings(i)) {
                    counter++;
                    results.add(i);
                    System.out.println("Found:" + i);
                }
            }
            i++;
        }

        long acc = 0;
        for (Integer j : results) {
            acc += j;
        }
        System.out.println("Result: " + acc);
    }

    private boolean checkSubstrings(int i) {
        String str = String.valueOf(i);
        //System.out.println(str);
        for (int j = 1; j < str.length(); j++) {
            String left = str.substring(0, j);
            if (!isPrime(Integer.parseInt(left))) return false;
            String right = str.substring(j);
            if (!isPrime(Integer.parseInt(right))) return false;
        }
        return true;
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i+=2 ) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
