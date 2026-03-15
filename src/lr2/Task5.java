package lr2;

public class Task5 {
}

// Класс Rectangle
class Rectangle {
    // Поля класса
    private double length; // Длина прямоугольника
    private double width;  // Ширина прямоугольника

    // Конструктор для инициализации полей при создании объекта
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Геттер для получения длины
    public double getLength() {
        return length;
    }

    // Сеттер для установки длины
    public void setLength(double length) {
        this.length = length;
    }

    // Геттер для получения ширины
    public double getWidth() {
        return width;
    }

    // Сеттер для установки ширины
    public void setWidth(double width) {
        this.width = width;
    }

    // Метод для вычисления площади прямоугольника
    public double getArea() {
        return length * width;
    }

    // Метод для вычисления периметра прямоугольника
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
