package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Класс {@code AttachmentSort} демонстрирует сортировку списка объектов {@link Attachment}
 * с использованием анонимных классов, реализующих интерфейс {@link Comparator}.
 *
 * <p>В примере выполняются два вида сортировки:</p>
 * <ul>
 *     <li>Сортировка по размеру вложений.</li>
 *     <li>Сортировка по имени вложений.</li>
 * </ul>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * List<Attachment> attachments = Arrays.asList(
 *         new Attachment("image 1", 100),
 *         new Attachment("image 2", 34),
 *         new Attachment("image 3", 13)
 * );
 *
 * attachments.sort(new Comparator<Attachment>() {
 *     @Override
 *     public int compare(Attachment o1, Attachment o2) {
 *         return Integer.compare(o1.getSize(), o2.getSize());
 *     }
 * });
 *
 * System.out.println(attachments);
 *
 * attachments.sort(new Comparator<Attachment>() {
 *     @Override
 *     public int compare(Attachment o1, Attachment o2) {
 *         return o1.getName().compareTo(o2.getName());
 *     }
 * });
 *
 * System.out.println(attachments);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * [{name='image 3', size=13}, {name='image 2', size=34}, {name='image 1', size=100}]
 * [{name='image 1', size=100}, {name='image 2', size=34}, {name='image 3', size=13}]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class AttachmentSort {

    /**
     * Точка входа в программу.
     *
     * <p>Создает список вложений, сортирует его по размеру и по имени с помощью
     * анонимных классов-компараторов, и выводит результат на экран.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13)
        );
        Comparator<Attachment> sizeComparator = new Comparator<>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return Integer.compare(o1.getSize(), o2.getSize());
            }
        };
        attachments.sort(sizeComparator);
        System.out.println(attachments);
        Comparator<Attachment> nameComparator = new Comparator<>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        attachments.sort(nameComparator);
        System.out.println(attachments);
    }
}
