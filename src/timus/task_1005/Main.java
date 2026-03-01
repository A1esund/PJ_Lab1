package timus.task_1005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] weights = new int[n];
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            weights[i] = in.nextInt();
            totalSum += weights[i];
        }

        int minDiff = Integer.MAX_VALUE;

        for (int mask = 0; mask < (1 << n); mask++) {
            int sum1 = 0;

            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    sum1 += weights[i];
                }
            }

            int sum2 = totalSum - sum1;

            int diff = Math.abs(sum1 - sum2);

            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        System.out.println(minDiff);

        in.close();
    }
}
