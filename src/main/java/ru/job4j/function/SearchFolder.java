package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Класс {@code SearchFolder} предоставляет универсальный метод
 * фильтрации коллекции объектов {@link Folder} с использованием
 * функционального интерфейса {@link Predicate}.
 *
 * <p>Класс позволяет гибко настраивать критерии отбора папок:
 * например, фильтрацию по размеру или по содержимому имени.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * List<Folder> folders = List.of(
 *         new Folder("bug_report", 120),
 *         new Folder("docs", 80),
 *         new Folder("images", 200)
 * );
 *
 * List<Folder> largeFolders = SearchFolder.filter(
 *         folders,
 *         folder -> folder.getSize() > 100
 * );
 *
 * List<Folder> bugFolders = SearchFolder.filter(
 *         folders,
 *         folder -> folder.getName().contains("bug")
 * );
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Папки размером больше 100: [Folder{name='bug_report', size=120}, Folder{name='images', size=200}]
 * 
 * Папки с именем 'bug': [Folder{name='bug_report', size=120}]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class SearchFolder {

    /**
     * Универсальный метод фильтрации списка папок.
     *
     * @param list список папок для проверки
     * @param predicate условие фильтрации
     * @return список папок, удовлетворяющих условию
     */
    public static List<Folder> filter(List<Folder> list, Predicate<Folder> predicate) {
        List<Folder> result = new ArrayList<>();
        for (Folder folder : list) {
            if (predicate.test(folder)) {
                result.add(folder);
            }
        }
        return result;
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрирует фильтрацию папок:
     * <ul>
     *     <li>По размеру больше 100;</li>
     *     <li>По имени, содержащему "bug".</li>
     * </ul>
     * </p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        List<Folder> folders = List.of(
                new Folder("bug_report", 120),
                new Folder("docs", 80),
                new Folder("images", 200)
        );

        List<Folder> largeFolders = SearchFolder.filter(
                folders,
                folder -> folder.getSize() > 100
        );
        System.out.println("Папки размером больше 100: " + largeFolders);

        List<Folder> bugFolders = SearchFolder.filter(
                folders,
                folder -> folder.getName().contains("bug")
        );
        System.out.println("Папки с именем 'bug': " + bugFolders);
    }
}
