package lr3.task7;

public class TestCreateTail {
    public static void main(String[] args) {
        Node head = null; // Начало списка

        // 1. Создаем первый элемент (10)
        Node node10 = new Node(10, null);
        head = node10;

        // 2. Создаем второй элемент (20)
        Node node20 = new Node(20, null);

        // Ищем конец списка
        Node ref = head;

        while (ref.next != null) {
            ref = ref.next;
        }

        // Прикрепляем новый элемент
        ref.next = node20;

        // 3. Создаем третий элемент (30)
        Node node30 = new Node(30, null);

        // Снова ищем конец списка, начиная с головы
        ref = head;

        while (ref.next != null) {
            ref = ref.next;
        }

        // Прикрепляем новый элемент
        ref.next = node30;  // <-- Точка останова №3
        // Сейчас список: 10 -> 20 -> 30 -> null
    }
}