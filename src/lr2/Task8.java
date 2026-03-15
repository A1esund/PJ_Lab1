package lr2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Создание животных ---\n");

        // Создание объекта класса Dog
        System.out.println("Введите имя собаки:");
        String dogName = scanner.nextLine();
        System.out.println("Введите возраст собаки:");
        int dogAge = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера
        System.out.println("Введите породу собаки:");
        String dogBreed = scanner.nextLine();

        Dog dog = new Dog(dogName, dogAge, dogBreed);

        // Создание объекта класса Cat
        System.out.println("\nВведите имя кошки:");
        String catName = scanner.nextLine();
        System.out.println("Введите возраст кошки:");
        int catAge = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера
        System.out.println("Введите тип корма для кошки:");
        String catFood = scanner.nextLine();

        Cat cat = new Cat(catName, catAge, catFood);

        // Создание объекта класса Bird
        System.out.println("\nВведите имя птицы:");
        String birdName = scanner.nextLine();
        System.out.println("Введите возраст птицы:");
        int birdAge = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера
        System.out.println("Может ли птица летать? (true/false):");
        boolean canFly = scanner.nextBoolean();

        Bird bird = new Bird(birdName, birdAge, canFly);

        // Демонстрация работы наследования
        System.out.println("\n--- Информация о животных ---\n");

        // Собака
        System.out.println("=== Собака ===");
        System.out.println("Имя: " + dog.getName());
        System.out.println("Возраст: " + dog.getAge() + " лет");
        System.out.println("Порода: " + dog.getBreed());
        System.out.print("Звук: ");
        dog.makeSound();
        dog.fetch(); // Уникальный метод собаки

        // Кошка
        System.out.println("\n=== Кошка ===");
        System.out.println("Имя: " + cat.getName());
        System.out.println("Возраст: " + cat.getAge() + " лет");
        System.out.println("Тип корма: " + cat.getFoodType());
        System.out.print("Звук: ");
        cat.makeSound();
        cat.scratch(); // Уникальный метод кошки

        // Птица
        System.out.println("\n=== Птица ===");
        System.out.println("Имя: " + bird.getName());
        System.out.println("Возраст: " + bird.getAge() + " лет");
        System.out.println("Может летать: " + (bird.canFly() ? "Да" : "Нет"));
        System.out.print("Звук: ");
        bird.makeSound();
        bird.fly(); // Уникальный метод птицы

        scanner.close();
    }
}

// Родительский класс Animal
class Animal {
    protected String name;   // Имя животного
    protected int age;       // Возраст животного

    // Конструктор для инициализации общих полей
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Геттер для имени
    public String getName() {
        return name;
    }

    // Сеттер для имени
    public void setName(String name) {
        this.name = name;
    }

    // Геттер для возраста
    public int getAge() {
        return age;
    }

    // Сеттер для возраста
    public void setAge(int age) {
        this.age = age;
    }

    // Метод для издания звука (переопределяется в подклассах)
    public void makeSound() {
        System.out.println("Животное издает звук");
    }
}

// Подкласс Dog, наследующий Animal
class Dog extends Animal {
    private String breed; // Порода собаки

    // Конструктор с вызовом конструктора родительского класса
    public Dog(String name, int age, String breed) {
        super(name, age); // Вызов конструктора класса Animal
        this.breed = breed;
    }

    // Геттер для породы
    public String getBreed() {
        return breed;
    }

    // Сеттер для породы
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Переопределение метода makeSound
    @Override
    public void makeSound() {
        System.out.println("Гав-гав");
    }

    // Уникальный метод собаки
    public void fetch() {
        System.out.println(name + " приносит мяч");
    }
}

// Подкласс Cat, наследующий Animal
class Cat extends Animal {
    private String foodType; // Тип корма

    // Конструктор с вызовом конструктора родительского класса
    public Cat(String name, int age, String foodType) {
        super(name, age); // Вызов конструктора класса Animal
        this.foodType = foodType;
    }

    // Геттер для типа корма
    public String getFoodType() {
        return foodType;
    }

    // Сеттер для типа корма
    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    // Переопределение метода makeSound
    @Override
    public void makeSound() {
        System.out.println("Мяу-мяу");
    }

    // Уникальный метод кошки
    public void scratch() {
        System.out.println(name + " точит когти");
    }
}

// Подкласс Bird, наследующий Animal
class Bird extends Animal {
    private boolean canFly; // Способность летать

    // Конструктор с вызовом конструктора родительского класса
    public Bird(String name, int age, boolean canFly) {
        super(name, age); // Вызов конструктора класса Animal
        this.canFly = canFly;
    }

    // Геттер для способности летать
    public boolean canFly() {
        return canFly;
    }

    // Сеттер для способности летать
    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    // Переопределение метода makeSound
    @Override
    public void makeSound() {
        System.out.println("Чик-чирик");
    }

    // Уникальный метод птицы
    public void fly() {
        if (canFly) {
            System.out.println(name + " летит в небе");
        } else {
            System.out.println(name + " не может летать.");
        }
    }
}
