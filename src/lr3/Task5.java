package lr3;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {
        // 1. Заполняем HashMap 10 объектами <Integer, String>
        HashMap<Integer, String> map = new HashMap<>();

        // Добавляем данные
        map.put(0, "Zero");           // Ключ = 0
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");            // Ключ > 5
        map.put(7, "HelloWorld");     // Ключ > 5 И Длина строки > 5
        map.put(8, "EightString");    // Ключ > 5 И Длина строки > 5
        map.put(9, "NineShort");      // Ключ > 5 И Длина строки > 5

        System.out.println("--- Исходный HashMap ---");
        System.out.println(map);
        System.out.println();

        // 2. Найти строки, у которых ключ > 5
        System.out.println("1. Строки, у которых ключ > 5:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > 5) {
                System.out.println(" " + entry.getValue() + " (ключ: " + entry.getKey() + ")");
            }
        }
        System.out.println();

        // 3. Если ключ = 0, вывести строку
        System.out.println("2. Строка, где ключ = 0:");
        if (map.containsKey(0)) {
            System.out.println(" " + map.get(0));
        } else {
            System.out.println(" Элементов с ключом 0 нет.");
        }
        System.out.println();

        // 4. Перемножить все ключи, где длина строки > 5
        long product = 1;
        boolean foundLongString = false;

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 5) {
                product *= entry.getKey();
                foundLongString = true;
                System.out.println("Длинная строка: \"" + entry.getValue() + "\" (ключ: " + entry.getKey() + ")");
            }
        }

        System.out.println();
        System.out.println("3. Произведение ключей, где длина строки > 5:");
        if (foundLongString) {
            System.out.println("Результат умножения: " + product);
        } else {
            System.out.println("Строк длиной более 5 символов не найдено.");
        }
    }
}
