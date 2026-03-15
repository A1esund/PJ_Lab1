package lr2;

import java.util.Random;   // пакет для подключения класса Random
import java.util.Scanner;  // пакет для подключения класса Scanner

public class Task1 {
    public static void main(String[] args) {
        // Создание объекта класса Scanner для считывания числа введённого в консоль
        Scanner id = new Scanner(System.in);

        // Сообщение пользователю
        System.out.println("Введите размер массива");

        // Запись в переменную size размера массива
        int size = id.nextInt();

        // Вывод значения введённого в консоль
        System.out.println("Размер массива равен " + size);

        // Создание массива с размером введённым из консоли
        int[] nums = new int[size];

        // Создание объекта класса Random для генерации "случайного" числа
        Random random = new Random();

        for (int i = 0; i < nums.length; i++) {
            // Присвоение i-тому элементу массива случайного значения
            nums[i] = random.nextInt(200);
            // Сообщение пользователю
            System.out.println("Элемент массива [" + i + "] = " + nums[i]);
        }

        // Поиск минимального значения в массиве
        int minValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minValue) {
                minValue = nums[i];
            }
        }

        // Вывод минимального значения
        System.out.println("\nМинимальное значение в массиве: " + minValue);

        // Поиск и вывод индексов всех элементов с минимальным значением
        System.out.print("Индексы элементов с минимальным значением: ");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == minValue) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        id.close();
    }
}
