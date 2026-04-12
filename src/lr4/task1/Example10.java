package lr4.task1;

public class Example10 {
    @SuppressWarnings("finally")
    public static int m() {
        try {
            System.out.println("0");
            return 15;
        } finally {
            System.out.println("1");
            return 20; // Переопределяет возвращаемое значение из try
        }
    }
    public static void main(String[] args) {
        System.out.println(m());
    }
}
