package timus.task_1001;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создание объекта Scanner для чтения входных данных
        Scanner scanner = new Scanner(System.in);

        // Список для хранения всех введённых чисел
        List<Long> numbers = new ArrayList<>();

        // Чтение всех чисел из входного потока
        // hasNextLong() проверяет, есть ли ещё числа для чтения
        while (scanner.hasNextLong()) {
            numbers.add(scanner.nextLong());
        }

        // Вывод квадратных корней в обратном порядке
        for (int i = numbers.size() - 1; i >= 0; i--) {
            // Вычисление квадратного корня с помощью Math.sqrt()
            double result = Math.sqrt(numbers.get(i));

            // Вывод результата с точностью не менее 4 знаков после запятой
            System.out.println(String.format("%.4f", result));
        }

        // Закрытие сканера
        scanner.close();
    }
}
