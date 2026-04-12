package timus.task_2012;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int f = scanner.nextInt();

        int timeAvailable = 4 * 60;

        int remainingTasks = 12 - f;

        int timeNeeded = remainingTasks * 45;

        if (timeNeeded <= timeAvailable) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scanner.close();
    }
}
