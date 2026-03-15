package lr2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создание объектов различных фигур
        System.out.println("--- Создание фигур ---");

        // Круг
        System.out.println("Введите радиус круга:");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);

        // Квадрат
        System.out.println("Введите сторону квадрата:");
        double squareSide = scanner.nextDouble();
        Square square = new Square(squareSide);

        // Треугольник (равносторонний)
        System.out.println("Введите сторону равностороннего треугольника:");
        double triangleSide = scanner.nextDouble();
        Triangle triangle = new Triangle(triangleSide);

        // Вывод информации о фигурах
        System.out.println("\n--- Информация о фигурах ---");

        System.out.println("\nКруг:");
        System.out.println("Радиус: " + circle.getRadius());
        System.out.println("Площадь: " + circle.getArea());
        System.out.println("Периметр (длина окружности): " + circle.getPerimeter());

        System.out.println("\nКвадрат:");
        System.out.println("Сторона: " + square.getSide());
        System.out.println("Площадь: " + square.getArea());
        System.out.println("Периметр: " + square.getPerimeter());

        System.out.println("\nТреугольник (равносторонний):");
        System.out.println("Сторона: " + triangle.getSide());
        System.out.println("Площадь: " + triangle.getArea());
        System.out.println("Периметр: " + triangle.getPerimeter());

        scanner.close();
    }
}

// Интерфейс для геометрических фигур
interface Shape {
    // Метод для вычисления площади
    double getArea();

    // Метод для вычисления периметра
    double getPerimeter();
}

// Класс Круг
class Circle implements Shape {
    private double radius; // Радиус круга
    private static final double PI = 3.14159; // Константа PI

    // Конструктор
    public Circle(double radius) {
        this.radius = radius;
    }

    // Геттер для радиуса
    public double getRadius() {
        return radius;
    }

    // Сеттер для радиуса
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Реализация метода интерфейса - площадь круга
    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    // Реализация метода интерфейса - длина окружности
    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }
}

// Класс Квадрат
class Square implements Shape {
    private double side; // Сторона квадрата

    // Конструктор
    public Square(double side) {
        this.side = side;
    }

    // Геттер для стороны
    public double getSide() {
        return side;
    }

    // Сеттер для стороны
    public void setSide(double side) {
        this.side = side;
    }

    // Реализация метода интерфейса - площадь квадрата
    @Override
    public double getArea() {
        return side * side;
    }

    // Реализация метода интерфейса - периметр квадрата
    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}

// Класс Треугольник (равносторонний)
class Triangle implements Shape {
    private double side; // Сторона равностороннего треугольника

    // Конструктор
    public Triangle(double side) {
        this.side = side;
    }

    // Геттер для стороны
    public double getSide() {
        return side;
    }

    // Сеттер для стороны
    public void setSide(double side) {
        this.side = side;
    }

    // Реализация метода интерфейса - площадь равностороннего треугольника
    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    // Реализация метода интерфейса - периметр треугольника
    @Override
    public double getPerimeter() {
        return 3 * side;
    }
}