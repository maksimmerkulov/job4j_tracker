package ru.job4j.tracker;

/**
 * Интерфейс {@code UserAction} описывает действие, доступное пользователю
 * в системе трекинга заявок {@link Tracker}.
 *
 * <p>Каждое действие должно предоставлять название для отображения в меню
 * и реализацию метода выполнения.</p>
 *
 * <p><b>Пример реализации:</b></p>
 * <pre>{@code
 * public class ExitAction implements UserAction {
 *     @Override
 *     public String name() {
 *         return "Завершить программу";
 *     }
 *
 *     @Override
 *     public boolean execute(Input input, Tracker tracker) {
 *         System.out.println("=== Завершение программы ===");
 *         return false;
 *     }
 * }
 * }</pre>
 *
 * @author Maksим Merkulov
 * @version 1.0
 */
public interface UserAction {

    /**
     * Возвращает название действия, отображаемое в пользовательском меню.
     *
     * @return строковое представление действия.
     */
    String name();

    /**
     * Выполняет логику, связанную с этим действием.
     *
     * @param input   источник пользовательского ввода.
     * @param tracker хранилище заявок, к которому применяется действие.
     * @return {@code true}, если выполнение программы должно продолжаться;
     *         {@code false}, если необходимо завершить выполнение.
     */    boolean execute(Input input, Tracker tracker);
}