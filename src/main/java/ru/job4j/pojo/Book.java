package ru.job4j.pojo;

/**
 * Класс {@code Book} представляет сущность книги с названием и количеством страниц.
 *
 * <p>Может использоваться в приложениях управления библиотекой,
 * чтения, учета или каталога литературы.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Book book = new Book("Clean Code", 464);
 * String title = book.getName();
 * int pages = book.getPages();
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-19
 */
public class Book {

    /**
     * Поле {@code name} содержит название книги.
     */
    private String name;

    /**
     * Поле {@code pages} содержит количество страниц в книге.
     */
    private int pages;

    /**
     * Конструктор {@code Book(String name, int pages)} создает новый экземпляр книги.
     *
     * @param name  Название книги.
     * @param pages Количество страниц.
     */
    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    /**
     * Метод {@code getName()} возвращает название книги.
     *
     * @return Значение поля {@code name}.
     */
    public String getName() {
        return name;
    }

    /**
     * Метод {@code setName(String name)} устанавливает новое название книги.
     *
     * @param name Новое значение поля {@code name}.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Метод {@code getPages()} возвращает количество страниц в книге.
     *
     * @return Значение поля {@code pages}.
     */
    public int getPages() {
        return pages;
    }

    /**
     * Метод {@code setPages(int pages)} устанавливает новое количество страниц в книге.
     *
     * @param pages Новое значение поля {@code pages}.
     */
    public void setPages(int pages) {
        this.pages = pages;
    }
}
