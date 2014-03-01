package com.company;

public class Euler35 {

    public void go() {

        int counter = 0;
        for (int i = 2; i <=1000000;i++) {

            if (isPrime(i)) {
                String str = String.valueOf(i);
                if (checkRotations(str)) {
                    System.out.println(str);
                    counter++;
                }
            }

        }
//        checkRotations(String.valueOf(29));
        System.out.println("Result: " + counter);
    }

    private boolean checkRotations(String str) {
        for (int j = 0; j < str.length() - 1; j++) {
            str = str.substring(1, str.length()) + str.substring(0, 1);
            if (!isPrime(Integer.parseInt(str))) {
                return false;
            }
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
