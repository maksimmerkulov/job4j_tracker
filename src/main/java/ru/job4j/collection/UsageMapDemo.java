package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс {@code UsageMapDemo} демонстрирует базовые операции с коллекцией {@link HashMap}.
 *
 * <p>Содержит примеры добавления, обновления, удаления и вывода элементов
 * с использованием методов {@code keySet()} и {@code entrySet()}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * UsageMapDemo.addElement();
 * UsageMapDemo.printWithKeySet();
 * UsageMapDemo.printWithEntrySet();
 * UsageMapDemo.updateElement();
 * UsageMapDemo.removeElement();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * parsentev@yandex.ru = Petr Arsentev
 * parsentev@yandex.ru = Petr Arsentev
 * parsentev@yandex.ru = Petr Arsentev Sergeevich
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class UsageMapDemo {

    /**
     * Добавляет одну пару "ключ-значение" в {@link HashMap}.
     *
     * <p>В данном примере ключ — email, значение — имя.</p>
     */
    public static void addElement() {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev");
    }

    /**
     * Выводит все элементы {@link HashMap} с использованием {@code keySet()}.
     *
     * <p>Метод получает набор ключей с помощью {@code map.keySet()},
     * затем по каждому ключу извлекает и печатает значение.</p>
     */
    public static void printWithKeySet() {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev");

        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }

    /**
     * Выводит все элементы {@link HashMap} с использованием {@code entrySet()}.
     *
     * <p>Метод проходит по каждому объекту {@link Map.Entry},
     * получая ключ и значение напрямую.</p>
     */
    public static void printWithEntrySet() {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }

    /**
     * Обновляет значение элемента в {@link HashMap}.
     *
     * <p>Если ключ уже существует, новый вызов {@code put()} заменяет старое значение.</p>
     */
    public static void updateElement() {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        map.put("parsentev@yandex.ru", "Petr Arsentev Sergeevich");

        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }

    /**
     * Удаляет элемент по ключу из {@link HashMap}.
     *
     * <p>После вызова {@code remove()} ключ больше не будет найден в коллекции.</p>
     */
    public static void removeElement() {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        map.remove("parsentev@yandex.ru");
    }

    /**
     * Точка входа в программу.
     *
     * <p>Последовательно вызывает методы для демонстрации работы с {@link HashMap}.</p>
     *
     * @param args аргументы командной строки (не используется)
     */
    public static void main(String[] args) {
        addElement();
        printWithKeySet();
        printWithEntrySet();
        updateElement();
        removeElement();
    }
}
