package lr4.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 2: Вывод столбца матрицы");
        try {
            System.out.print("Количество строк: ");
            int rows = scanner.nextInt();
            System.out.print("Количество столбцов: ");
            int cols = scanner.nextInt();

            int[][] matrix = new int[rows][cols];
            System.out.println("Введите матрицу построчно:");
            for (int i = 0; i < rows; i++)
                for (int j = 0; j < cols; j++)
                    matrix[i][j] = scanner.nextInt();

            System.out.print("Введите номер столбца (1.." + cols + "): ");
            int colNum = scanner.nextInt();

            if (colNum < 1 || colNum > cols) {
                throw new IndexOutOfBoundsException("Столбца с таким номером не существует");
            }

            System.out.println("Столбец " + colNum + ":");
            int idx = colNum - 1;
            for (int i = 0; i < rows; i++) System.out.print(matrix[i][idx] + " ");
            System.out.println();

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Ввод должен быть целым числом.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Неожиданная ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
