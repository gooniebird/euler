package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final int PRIMES_NUM = 10001;

    public static void main(String[] args) {

//        Long[] primes = new Sieve(1000000).getPrimes();
//        for(Long i : primes) {
//            System.out.println(i);
//
//        }

//        Euler12 euler12 = new Euler12();
//        euler12.generateTriangles(500);

        new Euler45().go();




    }

    private static void simpleCheck() {
        int counter = 0;
        int i = 0;
        while(true) {
            boolean isPrime = PrimeChecker.isPrime(i);

//            boolean isSimplePrime = PrimeChecker.isPrimeSimple(i);
//
//            boolean isSlowPrime = PrimeChecker.isPrimeSuperSlow(i);
//            assert isPrime == isSimplePrime && isPrime == isSlowPrime;
            if (isPrime) {

                //System.out.print(i + " ");
                counter++;
                if (counter == PRIMES_NUM) {
                    System.out.println();
                    System.out.println(PRIMES_NUM + "th prime:" + i);
                    break;
                }
            }
            i++;
        }
    }

    private static void checkPrimes() {
        //false means prime

        int bound = 100;
        double v;
        while (true) {
            v = bound / Math.log(bound);

            if (v > PRIMES_NUM) {
                break;
            }
               System.out.println(v);
            bound *=10;
        }
        //System.out.println("Expected:" + v + ", bound:" + bound);
        int result = calculatePrimes(bound);
        while (true) {
            if (result > 0){
                System.out.println(result);
                break;
            } else {
                bound *= 10;
                result = calculatePrimes(bound);
            }
        }
    }

    private static int calculatePrimes(int bound) {
        boolean[] list = new boolean[bound];


        for (int i = 2; i < list.length; i++) {
            if (list[i]) {
                continue;
            }

            int p = i;
            int j = 2;
            while (j*p < list.length){
                list[j*p] = true;
                j++;
            }


        }

        List<Integer> primes = new ArrayList<Integer>();
        for (int i = 2; i < list.length; i++){
            if (!list[i]){
                primes.add(i);
                if (primes.size() > PRIMES_NUM) {
                    return i;
                }
            }
        }


        return -1;


    }
}
