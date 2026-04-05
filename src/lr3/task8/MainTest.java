package lr3.task8;

public class MainTest {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Тест циклических методов
        list.createTail(); // Введите: 1 2 3 -1
        System.out.println("Создан: " + list);

        list.addFirst(0);
        list.addLast(4);
        System.out.println("AddFirst/Last: " + list);

        list.insert(2, 99);
        System.out.println("Insert(2, 99): " + list);

        list.removeFirst();
        list.removeLast();
        list.remove(1);
        System.out.println("After removes: " + list);

        // Тест рекурсии
        SinglyLinkedList listRec = new SinglyLinkedList();
        listRec.createHeadRec(); // Введите: 10 20 30 -1
        System.out.println("Recursive: " + listRec.toStringRec());
    }
}
