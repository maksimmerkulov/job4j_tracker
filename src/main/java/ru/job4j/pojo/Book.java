package ru.job4j.pojo;

/**
 * Класс {@code Book} представляет модель книги с названием и количеством страниц.
 *
 * <p>Может использоваться в приложениях управления библиотекой, чтения, учета или каталога литературы.</p>
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
 *
 * for (int index = 0; index < books.length; index++) {
 * System.out.println(books[index].getName() + " - " + books[index].getPages() + " pages");
 * }
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Clean code - 464 pages
 * Head First Java - 720 pages
 * Java Core - 870 pages
 * Effective Java - 416 pages
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Book {

    /**
     * Название книги.
     */
    private String name;

    /**
     * Количество страниц в книге.
     */
    private int pages;

    /**
     * Создает новый экземпляр класса {@code Book}
     * с указанным названием и количеством страниц.
     *
     * @param name  название книги
     * @param pages количество страниц
     */
    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    /**
     * Возвращает название книги.
     *
     * @return название книги
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает новое название книги.
     *
     * @param name новое название книги
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Возвращает количество страниц в книге.
     *
     * @return количество страниц в книге
     */
    public int getPages() {
        return pages;
    }

    /**
     * Устанавливает новое количество страниц в книге.
     *
     * @param pages новое количество страниц в книге
     */
    public void setPages(int pages) {
        this.pages = pages;
    }
}
