package lr3;

import java.util.*;

public class BenchmarkCollections {
    private static final int N = 1_000_000;

    public static void main(String[] args) {
        System.out.println("Начало тестирования для N = " + N);
        System.out.println("-------------------------------------------");

        testAddLast();
        testAddFirst();
        testAddMiddle();
        testRemoveLast();
        testRemoveFirst();
        testRemoveMiddle();
        testGetByIndex();
    }

    private static void testAddLast() {
        System.out.println("\n1. Добавление в КОНЕЦ (addLast / add):");

        long start = System.nanoTime();
        List<Integer> arrayList = new ArrayList<>(N);
        for (int i = 0; i < N; i++) arrayList.add(i);
        System.out.printf("ArrayList:      %d ms %n", (System.nanoTime() - start) / 1_000_000);

        start = System.nanoTime();
        Deque<Integer> arrayDeque = new ArrayDeque<>(N);
        for (int i = 0; i < N; i++) arrayDeque.addLast(i);
        System.out.printf("ArrayDeque:     %d ms %n", (System.nanoTime() - start) / 1_000_000);

        start = System.nanoTime();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < N; i++) linkedList.add(i);
        System.out.printf("LinkedList:     %d ms %n", (System.nanoTime() - start) / 1_000_000);
    }

    private static void testAddFirst() {
        System.out.println("\n2. Добавление в НАЧАЛО (addFirst):");

        long start = System.nanoTime();
        Deque<Integer> arrayDeque = new ArrayDeque<>(N);
        for (int i = 0; i < N; i++) arrayDeque.addFirst(i);
        System.out.printf("ArrayDeque:     %d ms %n", (System.nanoTime() - start) / 1_000_000);

        start = System.nanoTime();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < N; i++) linkedList.addFirst(i); // ИСПРАВЛЕНО: было add(0, i)
        System.out.printf("LinkedList:     %d ms %n", (System.nanoTime() - start) / 1_000_000);

        start = System.nanoTime();
        List<Integer> arrayList = new ArrayList<>(N);
        for (int i = 0; i < N; i++) arrayList.add(0, i);
        System.out.printf("ArrayList:      %d ms %n", (System.nanoTime() - start) / 1_000_000);
    }

    private static void testAddMiddle() {
        System.out.println("\n3. Добавление в СЕРЕДИНУ (add(index, element)):");
        int mid = N / 2;

        List<Integer> arrayList = new ArrayList<>(N);
        for (int i = 0; i < N; i++) arrayList.add(i);

        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < N; i++) linkedList.add(i);

        long start = System.nanoTime();
        arrayList.add(mid, 999);
        System.out.printf("ArrayList:      %d ns %n", (System.nanoTime() - start));

        start = System.nanoTime();
        linkedList.add(mid, 999);
        System.out.printf("LinkedList:     %d ns %n", (System.nanoTime() - start));

        System.out.println("ArrayDeque:     Н/Д (не поддерживает вставку по индексу)");
    }

    private static void testRemoveLast() {
        System.out.println("\n4. Удаление с КОНЦА (removeLast / remove(size-1)):");

        List<Integer> arrayList = new ArrayList<>(N);
        for (int i = 0; i < N; i++) arrayList.add(i);

        Deque<Integer> arrayDeque = new ArrayDeque<>(N);
        for (int i = 0; i < N; i++) arrayDeque.addLast(i);

        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < N; i++) linkedList.add(i);

        long start = System.nanoTime();
        if (!arrayList.isEmpty()) arrayList.remove(arrayList.size() - 1);
        System.out.printf("ArrayList:      %d ns%n", (System.nanoTime() - start));

        start = System.nanoTime();
        if (!arrayDeque.isEmpty()) arrayDeque.removeLast();
        System.out.printf("ArrayDeque:     %d ns%n", (System.nanoTime() - start));

        start = System.nanoTime();
        if (!linkedList.isEmpty()) linkedList.remove(linkedList.size() - 1);
        System.out.printf("LinkedList:     %d ns%n", (System.nanoTime() - start));
    }

    private static void testRemoveFirst() {
        System.out.println("\n5. Удаление с НАЧАЛА (removeFirst / remove(0)):");

        List<Integer> arrayList = new ArrayList<>(N);
        for (int i = 0; i < N; i++) arrayList.add(i);

        Deque<Integer> arrayDeque = new ArrayDeque<>(N);
        for (int i = 0; i < N; i++) arrayDeque.addLast(i);

        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < N; i++) linkedList.add(i);

        long start = System.nanoTime();
        if (!arrayList.isEmpty()) arrayList.remove(0);
        System.out.printf("ArrayList:      %d ns%n", (System.nanoTime() - start));

        start = System.nanoTime();
        if (!arrayDeque.isEmpty()) arrayDeque.removeFirst();
        System.out.printf("ArrayDeque:     %d ns%n", (System.nanoTime() - start));

        start = System.nanoTime();
        if (!linkedList.isEmpty()) linkedList.removeFirst(); // ИСПРАВЛЕНО: было remove(0)
        System.out.printf("LinkedList:     %d ns%n", (System.nanoTime() - start));
    }

    private static void testRemoveMiddle() {
        System.out.println("\n6. Удаление из СЕРЕДИНЫ (remove(index)):");
        int mid = N / 2;

        List<Integer> arrayList = new ArrayList<>(N);
        for (int i = 0; i < N; i++) arrayList.add(i);

        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < N; i++) linkedList.add(i);

        long start = System.nanoTime();
        if (mid < arrayList.size()) arrayList.remove(mid);
        System.out.printf("ArrayList:      %d ns%n", (System.nanoTime() - start));

        start = System.nanoTime();
        if (mid < linkedList.size()) linkedList.remove(mid);
        System.out.printf("LinkedList:     %d ns%n", (System.nanoTime() - start));

        System.out.println("ArrayDeque:     Н/Д (не поддерживает удаление по индексу)");
    }

    private static void testGetByIndex() {
        System.out.println("\n7. Получение по ИНДЕКСУ (get(index)):");
        int mid = N / 2;

        List<Integer> arrayList = new ArrayList<>(N);
        for (int i = 0; i < N; i++) arrayList.add(i);

        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < N; i++) linkedList.add(i);

        long start = System.nanoTime();
        if (mid < arrayList.size()) arrayList.get(mid);
        System.out.printf("ArrayList:      %d ns%n", (System.nanoTime() - start));

        start = System.nanoTime();
        if (mid < linkedList.size()) linkedList.get(mid);
        System.out.printf("LinkedList:     %d ns%n", (System.nanoTime() - start));

        System.out.println("ArrayDeque:     Н/Д (нет метода get(int index) в интерфейсе Deque)");
    }
}