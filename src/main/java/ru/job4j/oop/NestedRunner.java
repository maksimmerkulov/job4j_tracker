package ru.job4j.oop;

/**
 * Класс {@code NestedRunner} демонстрирует работу со статическим вложенным классом.
 *
 * <p>Внутренний класс {@link StaticNested} имеет доступ только к статическим членам внешнего класса.
 * Через него изменяется значение {@code numberOne} — статической переменной.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * numberOne = 1;
 * StaticNested nested = new StaticNested();
 * nested.setStaticOuterVariable(2);
 * System.out.println("num1 = " + numberOne);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * 2
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class NestedRunner {

    /**
     * Статическая переменная внешнего класса.
     */
    private static int numberOne;

    /**
     * Нестатическая переменная (недоступна из StaticNested).
     */
    private int numberTwo;

    /**
     * Конструктор по умолчанию.
     */
    public NestedRunner() {
    }

    /**
     * Статический вложенный класс.
     *
     * <p>Имеет доступ только к статическим переменным внешнего класса.</p>
     */
    static class StaticNested {
        void setStaticOuterVariable(int value) {
            numberOne = value;
        }
    }

    /**
     * Точка входа в программу.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        numberOne = 1;
        StaticNested nested = new StaticNested();
        nested.setStaticOuterVariable(2);
        System.out.println("num1 = " + numberOne);
    }
}