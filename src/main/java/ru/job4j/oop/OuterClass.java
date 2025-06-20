package ru.job4j.oop;

/**
 * Класс {@code OuterClass} демонстрирует использование вложенных классов:
 * нестатического {@link OuterClass.NestedClass} и статического {@link OuterClass.StaticNestedClass}.
 *
 * <p>Нестатический вложенный класс требует экземпляра внешнего класса для создания,
 * а статический может существовать независимо.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * OuterClass outer = new OuterClass();
 * OuterClass.NestedClass nested = outer.new NestedClass();
 *
 * OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class OuterClass {

    /**
     * Нестатический вложенный класс.
     *
     * <p>Может быть создан только через экземпляр внешнего класса {@code OuterClass}.</p>
     */
    class NestedClass { }

    /**
     * Статический вложенный класс.
     *
     * <p>Может быть создан без экземпляра внешнего класса {@code OuterClass}.</p>
     */
    static class StaticNestedClass { }
}