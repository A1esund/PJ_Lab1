package lr3;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число для перевода в двоичную систему: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            System.out.print("Двоичное представление: ");

            // Обработка отрицательных чисел
            if (number < 0) {
                System.out.print("-");
                // Для отрицательных чисел работаем с абсолютным значением
                // Используем long, чтобы избежать переполнения для Integer.MIN_VALUE
                toBinary(Math.abs((long)number));
            } else {
                toBinary(number);
            }

            System.out.println();
        } else {
            System.out.println("Ошибка ввода. Пожалуйста, введите целое число.");
        }

        scanner.close();
    }

     // Рекурсивный метод перевода в двоичную систему
    public static void toBinary(int n) {
        if (n > 1) {
            toBinary(n / 2);
        }
        System.out.print(n % 2);
    }

    //Перегруженный метод для работы с long (нужен для Integer.MIN_VALUE)
    public static void toBinary(long n) {
        if (n > 1) {
            toBinary(n / 2);
        }
        System.out.print(n % 2);
    }
}