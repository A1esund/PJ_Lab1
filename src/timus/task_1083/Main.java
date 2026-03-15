package timus.task_1083;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение всей строки
        String input = scanner.nextLine();

        // Разделяем по пробелу
        String[] parts = input.split(" ");

        // Получаем n из первой части
        int n = Integer.parseInt(parts[0]);

        // Получаем k = количество восклицательных знаков во второй части
        int k = parts[1].length();

        // Вычисление многократного факториала
        long result = n;

        for (int i = 1; (n - i * k) > 0; i++) {
            result = result * (n - i * k);
        }

        // Вывод результата
        System.out.println(result);

        scanner.close();
    }
}
