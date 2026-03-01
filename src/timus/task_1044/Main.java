package timus.task_1044;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int halfLen = N / 2;

        int maxSum = 9 * halfLen;

        long[] count = new long[maxSum + 1];

        countSums(halfLen, 0, 0, count);

        long total = 0;
        for (int s = 0; s <= maxSum; s++) {
            total += count[s] * count[s];
        }

        System.out.println(total);

        in.close();
    }

    static void countSums(int digits, int pos, int currentSum, long[] count) {
        if (pos == digits) {
            count[currentSum]++;
            return;
        }

        for (int digit = 0; digit <= 9; digit++) {
            countSums(digits, pos + 1, currentSum + digit, count);
        }
    }
}
