package lr4.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 1: Среднее положительных элементов");
        try {
            System.out.print("Введите количество элементов: ");
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int sum = 0, count = 0;

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < n; i++) {
                System.out.print("Элемент " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
                if (arr[i] > 0) { sum += arr[i]; count++; }
            }

            if (count == 0) {
                throw new IllegalArgumentException("Положительные элементы отсутствуют");
            }

            System.out.println("Среднее значение: " + (double) sum / count);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введено не число или некорректный тип данных.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Неожиданная ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
