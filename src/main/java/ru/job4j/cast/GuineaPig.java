package ru.job4j.cast;

/**
 * Класс {@code GuineaPig} представляет собой животное – морскую свинку.
 *
 * <p>Используется для демонстрации реализации интерфейса {@link Animal}
 * и воспроизведения характерного звука.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Animal pig = new GuineaPig();
 * pig.sound();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * GuineaPig громко пищит для привлечения внимания.
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class GuineaPig implements Animal {

    /**
     * Выводит звук, который издает морская свинка.
     *
     * <p>Формат вывода включает имя класса и строку:
     * " громко пищит для привлечения внимания."</p>
     */
    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName()
                + " громко пищит для привлечения внимания.");
    }
}
