package ru.job4j.tracker;

/**
 * Класс {@code ExitAction} завершает выполнение программы.
 *
 * <p>Используется в меню трекера для выхода из программы. Возвращает {@code false}
 * в методе {@link #execute(Input, Tracker)}, что сигнализирует о завершении цикла работы.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Input input = new ConsoleInput();
 * Tracker tracker = new Tracker();
 * UserAction exit = new ExitAction();
 * exit.execute(input, tracker);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * === Завершение программы ===
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ExitAction implements UserAction {

    /**
     * Возвращает название действия, отображаемое в пользовательском меню.
     *
     * @return строковое представление действия.
     */
    @Override
    public String name() {
        return "Завершить программу";
    }

    /**
     * Выполняет завершение программы.
     *
     * <p>Выводит сообщение о завершении работы и возвращает {@code false},
     * чтобы остановить основной цикл программы.</p>
     *
     * @param input   интерфейс получения пользовательского ввода.
     * @param tracker хранилище заявок (не используется).
     * @return {@code false}, чтобы остановить выполнение программы.
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Завершение программы ===");
        return false;
    }
}