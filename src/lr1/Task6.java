package lr1;

import java.util.Scanner;
import java.time.LocalDate;

public class Task6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int currentYear = LocalDate.now().getYear();

        System.out.println("Введите имя: ");
        String name = in.nextLine();

        System.out.println("Введите год рождения: ");
        int birthYear = in.nextInt();

        int age = currentYear - birthYear;

        System.out.println("Имя: " + name + ", Возраст: " + age);

        in.close();
    }
}
