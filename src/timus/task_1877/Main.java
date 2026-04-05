package timus.task_1877;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String code1 = scanner.nextLine().trim();
        String code2 = scanner.nextLine().trim();

        int num1 = Integer.parseInt(code1);
        int num2 = Integer.parseInt(code2);

        boolean firstLockCracked = (num1 % 2 == 0);
        boolean secondLockCracked = (num2 % 2 == 1);

        if (firstLockCracked || secondLockCracked) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        scanner.close();
    }
}
