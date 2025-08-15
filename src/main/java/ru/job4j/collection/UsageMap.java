package ru.job4j.collection;

import java.util.HashMap;

/**
 * Класс {@code UsageMap} демонстрирует базовую работу с коллекцией {@link HashMap}.
 *
 * <p>В примере хранится одна пара "ключ-значение",
 * где ключ — это адрес электронной почты, а значение — полное имя пользователя.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * HashMap<String, String> map = new HashMap<>();
 * map.put("merkulov.mv@outlook.com", "Maksim Merkulov Vitalievich");
 * for (String key : map.keySet()) {
 *     String value = map.get(key);
 *     System.out.println(key + " = " + value);
 * }
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * merkulov.mv@outlook.com = Maksim Merkulov Vitalievich
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class UsageMap {

    /**
     * Точка входа в программу.
     *
     * <p>Создает объект {@link HashMap}, добавляет в него одну запись
     * и выводит содержимое на экран, проходя по ключам с помощью {@code keySet()}.</p>
     *
     * @param args Аргументы командной строки (не используется).
     */
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("merkulov.mv@outlook.com", "Maksim Merkulov Vitalievich");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
