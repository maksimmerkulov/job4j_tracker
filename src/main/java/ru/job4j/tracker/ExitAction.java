package ru.job4j.tracker;

/**
 * Класс {@code ExitAction} представляет действие завершения работы программы
 * трекера заявок.
 *
 * <p>Реализует интерфейс {@link UserAction} и используется для выхода из основного
 * управляющего цикла в {@link StartUI}.</p>
 *
 * <p>При выборе пользователем этого действия выполняется завершение работы
 * программы с выводом соответствующего сообщения.</p>
 *
 * <p><b>Сценарии использования:</b></p>
 * <ul>
 *     <li>Пользователь завершает работу с приложением.</li>
 *     <li>Вывод информационного сообщения перед завершением.</li>
 * </ul>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Output output = new ConsoleOutput();
 * UserAction exit = new ExitAction(output);
 * boolean continueRunning = exit.execute(input, tracker);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * === Завершение программы ===
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @see UserAction
 * @see Tracker
 */
public class ExitAction implements UserAction {

    /**
     * Объект вывода, используемый для отображения сообщений пользователю.
     */
    private final Output output;

    /**
     * Создает объект действия завершения программы.
     *
     * @param output Объект вывода сообщений пользователю.
     */
    public ExitAction(Output output) {
        this.output = output;
    }

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
        output.println("=== Завершение программы ===");
        return false;
    }
}