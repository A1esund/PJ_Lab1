package lr2;

import java.util.Scanner;

public class Task3 {
    // Метод шифрования
    public static String getEncryptString(String encryptString, int shift) {
        // Преобразуем переданную в метод строку в символьный массив
        char[] arrayChar = encryptString.toCharArray();

        // Создаем массив с типом данных long, размер равен размеру символьного массива
        long[] arrayInt = new long[arrayChar.length];

        // Создаем символьный массив для записи преобразованных символов
        char[] arrayCharNew = new char[arrayChar.length];

        // Перебираем все символы строки, прибавляем к ним ключ (сдвиг)
        for (int i = 0; i < arrayChar.length; i++) {
            // Прибавляем к символу с индексом i сдвиг
            arrayInt[i] = arrayChar[i] + shift;

            // Преобразуем число в символ char и записываем в новый массив
            arrayCharNew[i] = (char) arrayInt[i];
        }

        // Преобразуем новый массив символов в строку
        encryptString = new String(arrayCharNew);

        // Возвращаем строку
        return encryptString;
    }

    // Метод расшифровки (обратное преобразование)
    public static String getDecryptString(String decryptString, int shift) {
        char[] arrayChar = decryptString.toCharArray();
        long[] arrayInt = new long[arrayChar.length];
        char[] arrayCharNew = new char[arrayChar.length];

        for (int i = 0; i < arrayChar.length; i++) {
            // Вычитаем сдвиг для обратного преобразования
            arrayInt[i] = arrayChar[i] - shift;
            arrayCharNew[i] = (char) arrayInt[i];
        }

        decryptString = new String(arrayCharNew);
        return decryptString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод текста для шифрования
        System.out.println("Введите текст для шифрования");
        String text = scanner.nextLine();

        // Ввод ключа
        System.out.println("Введите ключ");
        int key = scanner.nextInt();

        // Шифрование
        String encryptedText = getEncryptString(text, key);
        System.out.println("Текст после преобразования: " + encryptedText);

        // Вопрос о расшифровке
        System.out.println("Выполнить обратное преобразование?(y/n)");
        scanner.nextLine(); // Очистка буфера
        String answer = scanner.nextLine();

        // Обработка ответа
        if (answer.equals("y")) {
            String decryptedText = getDecryptString(encryptedText, key);
            System.out.println("Текст после обратного преобразования: " + decryptedText);
        } else if (answer.equals("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ");
        }

        scanner.close();
    }
}
