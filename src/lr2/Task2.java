package lr2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Создание объекта класса Scanner для считывания числа введённого в консоль
        Scanner id = new Scanner(System.in);

        // Сообщение пользователю
        System.out.println("Введите количество строк массива:");

        // Запись в переменную rows количества строк
        int rows = id.nextInt();

        // Сообщение пользователю
        System.out.println("Введите количество столбцов массива:");

        // Запись в переменную cols количества столбцов
        int cols = id.nextInt();

        // Создание двумерного массива с размерами введёнными из консоли
        int[][] nums = new int[rows][cols];

        // Счётчик для заполнения массива последовательными числами
        int counter = 1;

        // Заполнение массива "змейкой"
        for (int i = 0; i < rows; i++) {
            // Проверка: если номер строки чётный - заполняем слева направо
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    // Присвоение элементу массива текущего значения счётчика
                    nums[i][j] = counter;
                    counter++; // Увеличение счётчика
                }
            }
            // Если номер строки нечётный - заполняем справа налево
            else {
                for (int j = cols - 1; j >= 0; j--) {
                    // Присвоение элементу массива текущего значения счётчика
                    nums[i][j] = counter;
                    counter++; // Увеличение счётчика
                }
            }
        }

        // Вывод заполненного массива в консоль
        System.out.println("\nЗаполненный массив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(nums[i][j] + "\t");
            }
            System.out.println();
        }

        id.close();
    }
}
