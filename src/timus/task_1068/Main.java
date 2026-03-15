package timus.task_1068;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Извлекаем число
        int n = scanner.nextInt();

        // Определение границ диапазона
        int start;
        int end;

        if (n<1) {
            start = n;
            end = 1;
        } else {
            start = 1;
            end = n;
        }

        // Вычисление суммы
        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
        }

        // Вывод результата
        System.out.println(sum);

        scanner.close();
    }
}
