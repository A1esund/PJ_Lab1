package lr1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите месяц: ");
        String month = in.nextLine();

        System.out.println("Количество дней: ");
        int days = in.nextInt();

        System.out.println("Месяц " + month + " содержит " + days + " дней.");

        in.close();
    }
}
