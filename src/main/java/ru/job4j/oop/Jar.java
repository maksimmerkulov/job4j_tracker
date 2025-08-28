package ru.job4j.oop;

/**
 * Класс {@code Jar} моделирует сосуд с определенным объемом содержимого.
 *
 * <p>Объекты могут "переливать" свое содержимое в другой объект, обнуляя собственный объем.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Jar first = new Jar(10);
 * Jar second = new Jar(5);
 * System.out.println("first : " + first.value + ". second : " + second.value);
 * first.pour(second);
 * System.out.println("first : " + first.value + ". second : " + second.value);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * first : 10. second : 5
 * first : 15. second : 0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Jar {

    /**
     * Объем содержимого в сосуде.
     */
    private int value;

    /**
     * Создает объект {@code Jar} с указанным объемом.
     *
     * @param size исходное значение объема
     */
    public Jar(int size) {
        this.value = size;
    }

    /**
     * Переливает содержимое из другого сосуда в текущий, обнуляя объем в исходном.
     *
     * @param another сосуд, из которого переливают
     */
    public void pour(Jar another) {
        this.value = this.value + another.value;
        another.value = 0;
    }

    /**
     * Демонстрирует поведение метода {@link #pour(Jar)} на двух сосудах.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Jar first = new Jar(10);
        Jar second = new Jar(5);
        System.out.println("first : " + first.value + ". second : " + second.value);
        first.pour(second);
        System.out.println("first : " + first.value + ". second : " + second.value);
    }
}
