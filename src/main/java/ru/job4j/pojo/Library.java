package ru.job4j.pojo;

/**
 * A main runner class managing a library of {@link Book}s and demonstrating
 * element swapping and searching by name.
 *
 * <p>Example output:
 * <pre>{@code
 * Full list:
 * Clean code - 464
 * Head First Java - 720
 * Java Core - 870
 * Effective Java - 416
 *
 * After swap:
 * Effective Java - 416
 * Head First Java - 720
 * Java Core - 870
 * Clean code - 464
 *
 * Only "Clean code" books:
 * Clean code - 464
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Library {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 464);
        Book headFirstJava = new Book("Head First Java", 720);
        Book javaCore = new Book("Java Core", 870);
        Book effectiveJava = new Book("Effective Java", 416);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = headFirstJava;
        books[2] = javaCore;
        books[3] = effectiveJava;
        System.out.println("Full list:");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getPages());
        }
        System.out.println(System.lineSeparator() + "After swap:");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getPages());
        }
        System.out.println(System.lineSeparator()
                + "Only \"Clean code\" books:");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + " - " + book.getPages());
            }
        }
    }
}
