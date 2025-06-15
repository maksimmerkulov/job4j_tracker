package ru.job4j.checkstyle;

/**
 * Класс {@code Broken} демонстрирует оформление кода в соответствии с правилами Checkstyle.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Broken {
    public static final int DEFAULT_EMPTY_SIZE = 10;
    public static final String NEW_VALUE = "";

    private int sizeOfEmpty = DEFAULT_EMPTY_SIZE;
    private String surname;
    private String name;

    public Broken() {
    }

    public void echo() {
    }

    public void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    public void method(int a, int b, int c, int d, int e, int f, int g) {
    }
}