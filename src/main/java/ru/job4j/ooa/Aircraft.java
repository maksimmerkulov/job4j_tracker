package ru.job4j.ooa;

/**
 * Базовый класс {@code Aircraft} представляет обобщенную модель самолета.
 *
 * <p>Класс предоставляет метод {@link #printModel()}, который выводит в консоль
 * текстовое описание модели.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Aircraft aircraft = new Aircraft();
 * aircraft.printModel();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Метод выводит в консоль модель самолета.
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Aircraft {

    /**
     * Выводит описание модели самолета в консоль.
     */
    public void printModel() {
        System.out.println("Метод выводит в консоль модель самолета.");
    }
}