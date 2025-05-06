package ru.job4j.tracker.action;

import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.output.Output;

/**
 * Класс {@code ExitAction} завершает выполнение программы.
 *
 * <p>Используется в меню трекера для выхода из приложения. Метод {@link #execute(Input, Tracker)}
 * возвращает {@code false}, что приводит к завершению основного цикла программы.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Input input = new ConsoleInput();
 * Tracker tracker = new Tracker();
 * UserAction exit = new ExitAction(new ConsoleOutput());
 * exit.execute(input, tracker);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * === Завершение программы ===
 * }</pre>
 *
 * @author Maksим Merkulov
 * @version 1.1
 */
public class ExitAction implements UserAction {

    /**
     * Интерфейс вывода информации пользователю.
     */
    private final Output output;

    /**
     * Конструктор, инициализирующий действие с заданным интерфейсом вывода.
     *
     * @param output реализация интерфейса {@link Output} для отображения сообщений.
     */
    public ExitAction(Output output) {
        this.output = output;
    }

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
        output.println("=== Завершение программы ===");
        return false;
    }
}