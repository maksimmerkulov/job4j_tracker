package ru.job4j.pojo;

/**
 * Класс {@code Library} демонстрирует работу с массивом объектов {@link Book}.
 *
 * <p>В методе {@link #main(String[])} выполняются следующие действия:</p>
 * <ul>
 *     <li>Создание массива книг.</li>
 *     <li>Вывод всех книг на консоль.</li>
 *     <li>Замена книг с индексами 0 и 3.</li>
 *     <li>Повторный вывод всех книг.</li>
 *     <li>Поиск и вывод книг с названием "Clean code".</li>
 * </ul>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Book cleanCode = new Book("Clean code", 464);
 * Book headFirst = new Book("Head First Java", 720);
 * Book javaCore = new Book("Java Core", 870);
 * Book effectiveJava = new Book("Effective Java", 416);
 * Book[] books = new Book[4];
 * books[0] = cleanCode;
 * books[1] = headFirst;
 * books[2] = javaCore;
 * books[3] = effectiveJava;
 * for (int index = 0; index < books.length; index++) {
 * System.out.println(books[index].getName() + " - " + books[index].getPages() + " pages");
 * }
 *
 * System.out.println(System.lineSeparator() + "Replace book at index 0 and 3:");
 * Book temp = books[0];
 * books[0] = books[3];
 * books[3] = temp;
 * for (int index = 0; index < books.length; index++) {
 * System.out.println(books[index].getName() + " - " + books[index].getPages() + " pages");
 * }
 *
 * System.out.println(System.lineSeparator() + "Search for books titled 'Clean code':");
 * for (int i = 0; i < books.length; i++) {
 * if ("Clean code".equals(books[i].getName())) {
 * System.out.println(books[i].getName() + " - " + books[i].getPages() + " pages");
 * }
 * }
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Clean code - 464 pages
 * Head First Java - 720 pages
 * Java Core - 870 pages
 * Effective Java - 416 pages
 *
 * Replace book at index 0 and 3:
 * Effective Java - 416 pages
 * Head First Java - 720 pages
 * Java Core - 870 pages
 * Clean code - 464 pages
 *
 * Search for books titled 'Clean code':
 * Clean code - 464 pages
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Library {

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрирует базовые операции с массивом книг:</p>
     *
     * <p>1. Создание 4 книг, включая одну с названием "Clean code".</p>
     * <p>2. Заполнение массива и вывод всех книг на консоль.</p>
     * <p>3. Замена книг с индексами 0 и 3, повторный вывод массива.</p>
     * <p>4. Поиск и вывод книг с названием "Clean code".</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 464);
        Book headFirst = new Book("Head First Java", 720);
        Book javaCore = new Book("Java Core", 870);
        Book effectiveJava = new Book("Effective Java", 416);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = headFirst;
        books[2] = javaCore;
        books[3] = effectiveJava;
        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index].getName() + " - " + books[index].getPages() + " pages");
        }
        System.out.println(System.lineSeparator() + "Replace book at index 0 and 3:");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index].getName() + " - " + books[index].getPages() + " pages");
        }
        System.out.println(System.lineSeparator() + "Search for books titled 'Clean code':");
        for (int i = 0; i < books.length; i++) {
            if ("Clean code".equals(books[i].getName())) {
                System.out.println(books[i].getName() + " - " + books[i].getPages() + " pages");
            }
        }
    }
}