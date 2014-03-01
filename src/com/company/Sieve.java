package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Igors Ustinovs on 14.1.2.
 */
public class Sieve {

    private long limit;

    private boolean[] primes;

    public Sieve(int limit) {
        this.limit = limit;
        primes = new boolean[limit + 1];
        for(int i = 2; i < limit;i++) {
            primes[i] = true;
        }
        go();
    }

    private void go() {
        for (int i = 2; i < limit; i++) {

            for (int j = i * i; j < limit; j += i) {
                primes[j] = false;
            }
        }
    }

    public boolean isPrime(int num) {
        return primes[num];
    }

    public Long[] getPrimes() {
        List<Long> nums = new ArrayList<>();
        for (int i = 0; i < limit; i++) {
            if (primes[i]) {
                nums.add(Long.valueOf(i));
            }
        }
        return nums.toArray(new Long[0]);
    }
//
//    public int findDivisors(int num) {
//
//        Long[] primes = getPrimes();
//        int acc = 1;
//        for (int i = 0; i < primes.length - 1; i++) {
//
//            int div = primes[i];
//            if (div > num) {
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
//
//        return acc;
//    }



}
