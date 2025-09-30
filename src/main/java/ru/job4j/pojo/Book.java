package ru.job4j.pojo;

/**
 * Represents a book model with name and page count properties.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Book {

    /**
     * Name of the book.
     */
    private String name;

    /**
     * Number of pages in the book.
     */
    private int pages;

    /**
     * Creates a new {@code Book} with the specified name and pages.
     *
     * @param name  the book name
     * @param pages the number of pages
     */
    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    /**
     * Returns the book name.
     *
     * @return the book name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the book name.
     *
     * @param name the book name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the page count.
     *
     * @return the page count
     */
    public int getPages() {
        return pages;
    }

    /**
     * Sets the page count.
     *
     * @param pages the page count
     */
    public void setPages(int pages) {
        this.pages = pages;
    }
}
