package com.company;

import java.util.ArrayList;
import java.util.List;

public class Euler12 {

    public List<Integer> primeFactors(int numbers) {
        int n = numbers;
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }

    public void generateTriangles(int lim) {
        long i = 0;
        long acc = 0;
        while (true) {
            acc += ++i;

            long divs = 0;
            for (long j = 1; j <= Math.sqrt(acc);j++) {
                if (acc % j == 0) {
                    divs += 2;
                }
            }

            if (divs >= lim) {
                System.out.println(acc);
                break;
            }
        }
    }

    public boolean printFactors(long num) {

        long divs = 0;
        for (long j = 1; j <= Math.sqrt(num);j++) {
            if (num % j == 0) {
                divs += 2;
            }
        }

        if (divs >= 500) {
            System.out.println(divs);

            return true;
        }
        return false;
    }

//    public long findDivisors(long num) {
//        long acc = 1;
//        System.out.println(1);
//        for (int i = 2; i <= num; i++) {
//            while (num % i == 0) {
//                num = num/i;
//                System.out.println(i);
//                acc++;
//
//            }
//        }
//    }

//    public long findDivisors(long num) {
//        long acc = 1;
//        for (int i = 2; i <= num; i++) {
//
//            long div = i;
//            if (div >= num) {
//                return acc;
//            }
//            int tmp = 0;
//            while(num % div == 0) {
//                num = num / div;
//                tmp++;
//            }
//            if (tmp > 0) tmp++;
//
//            acc *= tmp;
//        }
//        System.out.println(num + ": " + acc);
//
//        return acc;
//    }






}
