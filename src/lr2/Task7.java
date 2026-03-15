package lr2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Создание банковского счета ---");

        // Ввод данных владельца
        System.out.println("Введите имя владельца счета:");
        String ownerName = scanner.nextLine();

        System.out.println("Введите начальный баланс:");
        double initialBalance = scanner.nextDouble();

        // Создание объекта банковского счета
        BankAccount account = new BankAccount(ownerName, initialBalance);

        // Меню операций
        boolean continueWork = true;
        while (continueWork) {
            System.out.println("\n--- Меню операций ---");
            System.out.println("1. Внести деньги (Депозит)");
            System.out.println("2. Снять деньги");
            System.out.println("3. Проверить баланс");
            System.out.println("4. Выход");
            System.out.println("Выберите действие (1-4):");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Введите сумму для депозита:");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Введите сумму для снятия:");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Текущий баланс: " + account.getBalance());
                    break;
                case 4:
                    continueWork = false;
                    System.out.println("До свидания!");
                    break;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }

        scanner.close();
    }
}

// Интерфейс для операций с банковским счетом
interface BankAccountInterface {
    // Метод для внесения денег на счет
    void deposit(double amount);

    // Метод для снятия денег со счета
    void withdraw(double amount);

    // Метод для получения текущего баланса
    double getBalance();
}

// Класс Банковский счет, реализующий интерфейс
class BankAccount implements BankAccountInterface {
    private String ownerName;   // Имя владельца
    private double balance;     // Текущий баланс

    // Конструктор для создания счета
    public BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    // Реализация метода внесения денег
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Успешно внесено: " + amount);
            System.out.println("Новый баланс: " + balance);
        } else {
            System.out.println("Сумма депозита должна быть положительной.");
        }
    }

    // Реализация метода снятия денег
    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Успешно снято: " + amount);
                System.out.println("Новый баланс: " + balance);
            } else {
                System.out.println("Недостаточно средств на счете.");
            }
        } else {
            System.out.println("Сумма снятия должна быть положительной.");
        }
    }

    // Реализация метода получения баланса
    @Override
    public double getBalance() {
        return balance;
    }

    // Геттер для имени владельца
    public String getOwnerName() {
        return ownerName;
    }
}
