package com.company;

public class Coins {

    private final int[] coins = new int[]{200, 100, 50, 20, 10, 5, 2, 1};
    private final int sum = 200;
    private int acc = 0;

    public void go() {

        doCalc(sum, 200);
        System.out.println("result: " + acc);
    }

    private void doCalc(int rem, int lim) {

        for (int coin : coins) {
            if (coin > lim) continue;

            if (rem > coin) {
                doCalc(rem - coin, coin);
            }
            if (rem == coin) {
                acc++;
            }
        }
    }

//    private void doCalc(int rem, int lim) {
//
//        for (int coin : coins) {
//            if (coin > lim) continue;
//
//            if (rem > coin) {
//                System.out.print(coin + " ");
//                doCalc(rem - coin, coin);
//            }
//            if (rem == coin) {
//                System.out.print(coin + " ");
//                acc++;
//                System.out.println("stop:" + acc);
//            }
//
//        }
//    }
}
