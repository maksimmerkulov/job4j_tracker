package ru.job4j.tracker;

/**
 * Класс {@code ExitAction} представляет действие завершения работы программы.
 *
 * <p>Реализует интерфейс {@link UserAction} и используется для выхода из основного цикла приложения трекера заявок.</p>
 *
 * <p><b>Пример поведения:</b> при выборе пользователем данного действия программа завершает выполнение.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * UserAction exit = new ExitAction();
 * boolean continueRunning = exit.execute(input, tracker);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @see UserAction
 */
public class ExitAction implements UserAction {

    /**
     * Возвращает название действия, отображаемое в пользовательском меню.
     *
     * @return Строка "Завершить программу".
     */
    @Override
    public String name() {
        return "Завершить программу";
    }

    /**
     * Выполняет завершение программы.
     *
     * <p>Выводит на экран сообщение о завершении и возвращает {@code false},
     * сигнализируя основному циклу о необходимости остановки.</p>
     *
     * @param input   Интерфейс получения пользовательского ввода (не используется).
     * @param tracker Хранилище заявок (не используется).
     * @return {@code false}, чтобы завершить выполнение программы.
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Завершение программы ===");
        return false;
    }
}