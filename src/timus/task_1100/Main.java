package timus.task_1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // Быстрый ввод
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Быстрый вывод
        PrintWriter out = new PrintWriter(System.out);

        // Чтение количества команд
        String line = br.readLine();
        if (line == null) return;
        int n = Integer.parseInt(line.trim());

        // 101 список для каждого значения M (0-100)
        ArrayList<Integer>[] buckets = new ArrayList[101];
        for (int i = 0; i <= 100; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Чтение данных о командах и распределение по корзинам
        for (int i = 0; i < n; i++) {
            line = br.readLine();
            // Используем StringTokenizer для быстрого разбиения строки
            StringTokenizer st = new StringTokenizer(line);
            int id = Integer.parseInt(st.nextToken());
            int solved = Integer.parseInt(st.nextToken());

            // Добавляем ID команды в соответствующую корзину
            buckets[solved].add(id);
        }

        // Вывод от большего M к меньшему
        for (int m = 100; m >= 0; m--) {
            for (int id : buckets[m]) {
                out.print(id);
                out.print(' ');
                out.println(m);
            }
        }

        // Очищаем буфер вывода
        out.flush();
        out.close();
        br.close();
    }
}