package lr3.task8;

import java.util.Scanner;

public class SinglyLinkedList {
    private Node head;
    private static Scanner sc = new Scanner(System.in);

    // --- Циклические методы ---

    public void createHead() {
        System.out.println("Ввод с головы (стоп: -1):");
        while (true) {
            int val = sc.nextInt();
            if (val == -1) break;
            head = new Node(val, head);
        }
    }

    public void createTail() {
        System.out.println("Ввод с хвоста (стоп: -1):");
        int val = sc.nextInt();
        if (val == -1) return;

        head = new Node(val, null);
        Node cur = head;
        while (true) {
            val = sc.nextInt();
            if (val == -1) break;
            cur.next = new Node(val, null);
            cur = cur.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node cur = head;
        while (cur != null) {
            sb.append(cur.value);
            if (cur.next != null) sb.append(", ");
            cur = cur.next;
        }
        return sb.append("]").toString();
    }

    public void addFirst(int val) {
        head = new Node(val, head);
    }

    public void addLast(int val) {
        if (head == null) {
            head = new Node(val, null);
            return;
        }
        Node cur = head;
        while (cur.next != null) cur = cur.next;
        cur.next = new Node(val, null);
    }

    public void insert(int index, int val) {
        if (index < 0) return;
        if (index == 0) {
            addFirst(val);
            return;
        }
        Node cur = head;
        for (int i = 0; i < index - 1 && cur != null; i++) {
            cur = cur.next;
        }
        if (cur != null) {
            cur.next = new Node(val, cur.next);
        }
    }

    public void removeFirst() {
        if (head != null) head = head.next;
    }

    public void removeLast() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node cur = head;
        while (cur.next.next != null) cur = cur.next;
        cur.next = null;
    }

    public void remove(int index) {
        if (head == null || index < 0) return;
        if (index == 0) {
            removeFirst();
            return;
        }
        Node cur = head;
        for (int i = 0; i < index - 1 && cur != null; i++) {
            cur = cur.next;
        }
        if (cur != null && cur.next != null) {
            cur.next = cur.next.next;
        }
    }

    // --- Рекурсивные методы ---

    public void createHeadRec() {
        System.out.println("Рекурсивный ввод (стоп: -1):");
        head = readRec();
    }

    private Node readRec() {
        int val = sc.nextInt();
        if (val == -1) return null;
        return new Node(val, readRec());
    }

    // Для createTailRec логика та же, так как рекурсия естественно сохраняет порядок ввода
    public void createTailRec() {
        createHeadRec();
    }

    public String toStringRec() {
        return "[" + printRec(head) + "]";
    }

    private String printRec(Node node) {
        if (node == null) return "";
        if (node.next == null) return String.valueOf(node.value);
        return node.value + ", " + printRec(node.next);
    }
}