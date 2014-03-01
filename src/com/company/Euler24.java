package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Euler24 {

    public void doCalc() {

        int[] a = new int[]{0,1,2,3,4,5,6,7,8,9};

        int counter = 1;
        while (true) {
            //1
            int k = -1;
            for (int i = a.length - 2; i >= 0; i--) {
                if (a[i] < a[i + 1]) {
                    k = i;
                    break;
                }

            }
            if (k == -1) {
                break;
            }

            //2
            int l = -1;
            for (int i = a.length - 1; i >= 0; i--) {
                if (a[i] > a[k]) {
                    l = i;
                    break;
                }
            }

            //3
            int tmp = a[k];
            a[k] = a[l];
            a[l] = tmp;

            //4
            List<Integer> list = new ArrayList<Integer>();
            for (int i = k + 1; i < a.length; i++) {
                list.add(a[i]);
            }
            if (list.size() > 1) {
                Collections.reverse(list);
                for (int i = 0; i < list.size(); i++) {
                    a[++k] = list.get(i);
                }

            }

            if (++counter == 1000000) {
            System.out.printf("counter:%s", counter);
            System.out.println();
            for (int i : a) {
                System.out.print(i);
            }
            System.out.println("=====");
            }
        }

    }


}
