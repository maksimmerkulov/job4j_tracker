package ru.job4j.checkstyle;

/**
 * Класс {@code Broken} демонстрирует оформление кода в соответствии с правилами Checkstyle.
 *
 * <p>Содержит статические константы, поля экземпляра, конструктор и методы для демонстрации
 * правил оформления.</p>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Broken {

    /**
     * Размер пустого элемента по умолчанию.
     */
    public static final int DEFAULT_EMPTY_SIZE = 10;

    /**
     * Пустое строковое значение.
     */
    public static final String NEW_VALUE = "";

    /**
     * Размер пустого поля экземпляра.
     */
    private int sizeOfEmpty = DEFAULT_EMPTY_SIZE;

    /**
     * Фамилия.
     */
    private String surname;

    /**
     * Имя.
     */
    private String name;

    /**
     * Конструктор по умолчанию.
     */
    public Broken() {
    }

    /**
     * Пустой метод для демонстрации оформления.
     */
    public void echo() {
    }

    /**
     * Выводит объект в консоль, если он не {@code null}.
     *
     * @param obj объект для вывода
     */
    public void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    /**
     * Пример метода с множественными параметрами.
     *
     * @param a параметр a
     * @param b параметр b
     * @param c параметр c
     * @param d параметр d
     * @param e параметр e
     * @param f параметр f
     * @param g параметр g
     */
    public void method(int a, int b, int c, int d, int e, int f, int g) {
    }
}
