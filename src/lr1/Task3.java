package lr1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название дня недели: ");
        String dayOfWeek = in.nextLine();

        System.out.println("Введите месяц: ");
        String month = in.nextLine();

        System.out.println("Введите число месяца: ");
        int date = in.nextInt();

        System.out.println("Сегодня: " + dayOfWeek + ", " + date + " " + month);

        in.close();
    }
}
