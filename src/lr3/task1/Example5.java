package lr3.task1;

public class Example5 {
    // Вспомогательный метод для вывода отступов (уровень вложенности)
    private static void printIndent(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("  ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Последовательность обхода дерева вызовов для fact(5):");
        // Вызываем с начальным уровнем 0
        int result = fact(5, 0);
        System.out.println("Итоговое значение fact(5) = " + result);
    }

    // Перегруженный метод fact, принимающий уровень вложенности для отрисовки дерева
    public static int fact(int n, int level) {
        printIndent(level);
        System.out.println("Вход: fact(" + n + ")");

        if (n == 0) {
            printIndent(level);
            System.out.println("Выход: fact(0) = 0");
            return 0;
        } else if (n == 1) {
            printIndent(level);
            System.out.println("Выход: fact(1) = 1");
            return 1;
        } else {
            // Рекурсивный вызов: fact(n-2) + fact(n-1)
            int val1 = fact(n - 2, level + 1);
            int val2 = fact(n - 1, level + 1);

            printIndent(level);
            System.out.println("Выход: fact(" + n + ") = " + val1 + " + " + val2 + " = " + (val1 + val2));
            return val1 + val2;
        }
    }
}
