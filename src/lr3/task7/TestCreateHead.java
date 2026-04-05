package lr3.task7;

public class TestCreateHead {
    public static void main(String[] args) {
        Node head = null; // Изначально список пуст

        // 1. Добавляем элемент со значением 10
        // Новый узел указывает на текущую голову (null), затем становится новой головой
        head = new Node(10, head);

        // 2. Добавляем элемент со значением 20
        // Новый узел (20) указывает на голову (10), затем становится новой головой
        head = new Node(20, head);

        // 3. Добавляем элемент со значением 30
        head = new Node(30, head);

        // Результат в памяти: 30 -> 20 -> 10 -> null
        System.out.println("Голова списка: " + head.value);
    }
}
