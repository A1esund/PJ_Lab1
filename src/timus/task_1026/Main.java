package timus.task_1026;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] database = new int[N];

        for (int i = 0; i < N; i++) {
            database[i] = in.nextInt();
        }

        String separator = in.next();

        int K = in.nextInt();
        int[] queries = new int[K];

        for (int i = 0; i < K; i++) {
            queries[i] = in.nextInt();
        }

        Arrays.sort(database);

        for (int i = 0; i < K; i++) {
            System.out.println(database[queries[i] - 1]);
        }

        in.close();
    }
}
