package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int currentYear = LocalDate.now().getYear();

        System.out.println("Введите год рождения: ");
        int birthYear = in.nextInt();

        int age = currentYear - birthYear;

        if (age < 0) {
            System.out.println("Ошибка! Год рождения не может быть больше текущего года.");
        } else {
            System.out.println("Ваш возраст: " + age);
        }

        in.close();
    }
}
