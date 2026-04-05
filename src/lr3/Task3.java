package lr3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Ввод массива рекурсивно
        System.out.println("Введите элементы массива:");
        fillArrayRecursively(array, 0, scanner);

        // Вывод массива рекурсивно
        System.out.println("Элементы массива:");
        printArrayRecursively(array, 0);

        scanner.close();
    }


    // Рекурсивный метод заполнения массива
    public static void fillArrayRecursively(int[] array, int index, Scanner scanner) {
        // Базовый случай: если индекс вышел за пределы массива, прекращаем
        if (index >= array.length) {
            return;
        }

        System.out.print("Введите элемент с индексом [" + index + "]: ");
        array[index] = scanner.nextInt(); // Записываем в текущую ячейку

        // Вызываем тот же метод для следующего индекса
        fillArrayRecursively(array, index + 1, scanner);
    }

    // Рекурсивный метод вывода массива
    public static void printArrayRecursively(int[] array, int index) {
        // Если индекс вышел за пределы массива, прекращаем
        if (index >= array.length) {
            return;
        }

        System.out.print(array[index] + " "); // Выводим текущий элемент

        // Вызываем тот же метод для следующего индекса
        printArrayRecursively(array, index + 1);
    }
}
