package lr2;

public class Task4 {
    public static void main(String[] args) {

    }
}

// Класс Person
class Person {
    // Поля класса
    private String name;   // Имя человека
    private int age;       // Возраст человека
    private String gender; // Пол человека

    // Конструктор для инициализации полей при создании объекта
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Геттер для получения имени
    public String getName() {
        return name;
    }

    // Сеттер для установки имени
    public void setName(String name) {
        this.name = name;
    }

    // Геттер для получения возраста
    public int getAge() {
        return age;
    }

    // Сеттер для установки возраста
    public void setAge(int age) {
        this.age = age;
    }

    // Геттер для получения пола
    public String getGender() {
        return gender;
    }

    // Сеттер для установки пола
    public void setGender(String gender) {
        this.gender = gender;
    }
}
