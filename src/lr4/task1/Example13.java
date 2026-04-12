package lr4.task1;

public class Example13 {
    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("размер массива= " + l);
            int h = 10 / l; // Деление на ноль, если args пуст
            args[l + 1] = "10"; // Выход за границы, если l >= 0
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс не существует");
        }
    }
}
