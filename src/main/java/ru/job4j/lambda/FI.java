package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Класс {@code FI} демонстрирует использование функциональных интерфейсов и
 * лямбда-выражений в Java для создания компараторов.
 *
 * <p>Примеры компараторов:
 * <ul>
 *   <li>Сравнение объектов {@link Attachment} по размеру.</li>
 *   <li>Сравнение строк по длине.</li>
 *   <li>Сравнение строк в алфавитном порядке.</li>
 *   <li>Сравнение строк по убыванию длины.</li>
 * </ul>
 * </p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Attachment[] attachments = {
 *     new Attachment("image 1", 20),
 *     new Attachment("image 3", 120),
 *     new Attachment("image 2", 23)
 * };
 *
 * Comparator<Attachment> comparator = (left, right) ->
 *         Integer.compare(left.getSize(), right.getSize());
 * Arrays.sort(attachments, comparator);
 *
 * for (Attachment att : attachments) {
 *     System.out.println(att);
 * }
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Attachment{name='image 1', size=20}
 * Attachment{name='image 2', size=23}
 * Attachment{name='image 3', size=120}
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class FI {

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрирует создание и использование различных
     * компараторов с помощью лямбда-выражений.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Attachment[] attachments = {
                new Attachment("image 1", 20),
                new Attachment("image 3", 120),
                new Attachment("image 2", 23)
        };
        Comparator<Attachment> comparator = (left, right) ->
                Integer.compare(left.getSize(), right.getSize());
        Arrays.sort(attachments, comparator);
        Comparator<String> comparatorSize = (left, right) ->
                Integer.compare(left.length(), right.length());
        Comparator<String> comparatorText = (left, right) ->
                left.compareTo(right);
        Comparator<String> comparatorDescSize = (left, right) ->
                Integer.compare(right.length(), left.length());
    }
}
