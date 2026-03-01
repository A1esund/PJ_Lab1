package timus.task_1293;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();

        int result = N * 2 * A * B;

        System.out.println(result);

        in.close();
    }
}
