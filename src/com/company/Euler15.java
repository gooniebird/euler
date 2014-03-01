package com.company;

import java.util.List;

public class Euler15 {

    private final int limit;
    private long result = 0;

    public Euler15(int cells) {
        limit = cells + 1;
    }

    public void start() {
//        doCalc(0,0);
        doDynamic();
        System.out.printf("Result: %s", result);
    }

    private void doDynamic() {
        long[][] grid = new long[limit][limit];
        for (int i = 0; i < limit;i++) {
            grid[0][i] = 1;
            grid[i][0] = 1;
        }

        for (int i = 1; i < limit;i++){
            for (int j = 1; j< limit;j++) {
                grid[i][j] = grid[i-1][j] + grid[i][j-1];
            }
        }
        result = grid[limit - 1][limit - 1];
    }
}
