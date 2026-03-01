package lr1;

import java.util.Scanner;
import java.time.LocalDate;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int currentYear = LocalDate.now().getYear();

        System.out.println("Введите ваш возраст: ");
        int age = in.nextInt();

        int birthYear = currentYear - age;

        System.out.println("Ваш год рождения: " + birthYear);

        in.close();
    }
}
