package lr4.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 3: Сумма элементов типа byte");
        try {
            System.out.print("Количество элементов: ");
            int n = scanner.nextInt();
            byte[] arr = new byte[n];
            int sum = 0; // int предотвращает переполнение при суммировании

            System.out.println("Введите числа (диапазон byte: -128..127):");
            for (int i = 0; i < n; i++) {
                System.out.print("Элемент " + (i + 1) + ": ");
                arr[i] = scanner.nextByte(); // Автоматически проверяет диапазон byte
                sum += arr[i];
            }

            System.out.println("Сумма: " + sum);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введено не число или значение выходит за пределы byte (-128..127).");
        } catch (Exception e) {
            System.out.println("Неожиданная ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
