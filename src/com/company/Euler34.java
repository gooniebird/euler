package com.company;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Euler34 {

    public void go() {
        long[] facts = new long[10];
        for (int i = 0; i < facts.length; i++) {
            facts[i] = fact(i);
        }

        BigInteger factSum = BigInteger.valueOf(facts[6]);
        long counter = 1;
        while (true) {
            int length = String.valueOf(factSum).length();
            if ( counter > length) {
                break;
            }

            factSum = factSum.multiply(BigInteger.valueOf(counter++));
        }

        List<Integer> results = new ArrayList<>();
        for (int i = 3; i < 1000000; i++) {
            String numStr = String.valueOf(i);
            if (numStr.matches("[789]")) {
                continue;
            }
            long acc = 0;
            for (char ch : numStr.toCharArray()) {
                acc += fact(Long.parseLong(String.valueOf(ch)));
            }
            if (acc == i) {
                System.out.println(i);
                results.add(i);
            }
        }

        int result = 0;
        for (Integer i : results) {
            result += i;
        }

        System.out.println("Result: " + result);
    }

    private long fact(long n) {
        if (n <= 1) return 1;
        return n * fact(n-1);
//        long acc = 1;
//        for (long i = n; i > 0; i--) {
//            acc*=i;
//        }
//        return acc;
    }
}
