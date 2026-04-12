package lr4.task1;

public class Example7 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
            // Чтобы обработать новое исключение, нужен вложенный try-catch
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException ae) {
                System.out.println("2");
            }
        }
        System.out.println("3");
    }
}
