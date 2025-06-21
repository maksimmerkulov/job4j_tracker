package ru.job4j.inheritance;

/**
 * Класс {@code ToyCat} представляет собой игрушечную кошку.
 *
 * <p>Наследует поведение обычной кошки из класса {@link Cat}, включая умение мурлыкать.</p>
 * <p>Дополнительно игрушечную кошку можно стирать в стиральной машине.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * ToyCat toy = new ToyCat();
 * System.out.println(toy.canPurr());
 * System.out.println(toy.canBeWashByWashMachine());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * true
 * true
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ToyCat extends Cat {

    /**
     * Проверяет, можно ли стирать игрушечную кошку в стиральной машине.
     *
     * <p>У настоящих кошек такого метода нет, так как их нельзя стирать в машинке.</p>
     *
     * @return Значение {@code true}, если игрушечную кошку можно стирать.
     */
    public boolean canBeWashByWashMachine() {
        return true;
    }
}