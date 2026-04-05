package lr3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Task6 {

    public static void main(String[] args) {
        // Количество человек
        int N = 100_000;

        System.out.println("Запуск симуляции для N = " + N);
        System.out.println("--------------------------------------------------");

        // 1. Тест ArrayList
        System.out.println("1. Тест ArrayList...");
        long startAL = System.currentTimeMillis();
        int winnerAL = simulateArrayList(N);
        long endAL = System.currentTimeMillis();
        System.out.println("Победитель (ArrayList): " + winnerAL);
        System.out.println("Время выполнения (ArrayList): " + (endAL - startAL) + " мс");
        System.out.println();

        // 2. Тест LinkedList
        System.out.println("2. Тест LinkedList...");
        long startLL = System.currentTimeMillis();
        int winnerLL = simulateLinkedList(N);
        long endLL = System.currentTimeMillis();
        System.out.println("Победитель (LinkedList): " + winnerLL);
        System.out.println("Время выполнения (LinkedList): " + (endLL - startLL) + " мс");
    }

    // Симуляция с использованием ArrayList
    public static int simulateArrayList(int n) {
        List<Integer> list = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int index = 0;
        while (list.size() > 1) {
            // Вычисляем индекс удаляемого (каждый второй, т.е. index + 1)
            // Так как элементы удаляются, индексы сдвигаются.
            // Формула: (current_index + step - 1) % size
            int removeIndex = (index + 1) % list.size();

            list.remove(removeIndex);

            // Следующий отсчет начинается с того же индекса,
            // так как следующий элемент сдвинулся на место удаленного.
            index = removeIndex;
        }
        return list.get(0);
    }


    // Симуляция с использованием LinkedList
    public static int simulateLinkedList(int n) {
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        ListIterator<Integer> iterator = list.listIterator();

        // Логика обхода: пропускаем одного, удаляем следующего.

        while (list.size() > 1) {
            // Пропускаем первого (next)
            if (iterator.hasNext()) {
                iterator.next();
            } else {
                // Если достигли конца, переходим в начало
                iterator = list.listIterator();
                iterator.next();
            }

            // Пытаемся удалить второго
            if (iterator.hasNext()) {
                iterator.next(); // Переходим ко второму
                iterator.remove(); // Удаляем его
            } else {
                // Если после пропуска первого мы в конце, значит нужно удалить первый элемент списка
                // (так как круг замкнулся)
                iterator = list.listIterator(); // Сброс в начало
                iterator.next(); // Берем первый элемент
                iterator.remove(); // Удаляем
                // После удаления первого элемента, итератор указывает на начало (следующим будет бывший второй)
                // Но нам нужно начать отсчет заново.
                // В упрощенной логике: если удалили первый, следующий отсчет начинается со следующего за ним.
                // Итератор уже стоит перед следующим элементом.
            }
        }

        // В списке остался 1 элемент
        return list.get(0);
    }
}
