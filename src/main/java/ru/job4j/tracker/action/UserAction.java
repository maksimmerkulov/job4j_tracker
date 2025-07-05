package ru.job4j.tracker.action;

import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.input.Input;

/**
 * Интерфейс {@code UserAction} описывает обобщенное действие в пользовательском интерфейсе приложения "Трекер заявок".
 *
 * <p>Каждая реализация этого интерфейса отвечает за выполнение конкретной операции — например, создание,
 * редактирование, удаление или поиск заявок. Эти действия выполняются с участием {@link Input} и {@link Tracker}.</p>
 *
 * <p>Интерфейс используется для построения меню и исполнения выбранных пользователем команд.</p>
 *
 * <p><b>Типичные реализации:</b></p>
 * <ul>
 *     <li>{@link CreateAction} — добавление новой заявки</li>
 *     <li>{@link ReplaceAction} — изменение существующей заявки</li>
 *     <li>{@link DeleteAction} — удаление заявки</li>
 *     <li>{@link FindAllAction} — вывод всех заявок</li>
 *     <li>{@link FindByIdAction} — поиск заявки по ID</li>
 *     <li>{@link FindByNameAction} — поиск заявок по имени</li>
 *     <li>{@link ExitAction} — завершение программы</li>
 * </ul>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Input input = new ConsoleInput();
 * Tracker tracker = new Tracker();
 * UserAction action = new CreateAction();
 * boolean result = action.execute(input, tracker);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * === Создание новой заявки ===
 * Введите имя: Test
 * Добавленная заявка: Item{id=1, name='Test', created=...}
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 * @see Input
 * @see Tracker
 */
public interface UserAction {

    /**
     * Возвращает текстовое представление действия, отображаемое в пользовательском меню.
     *
     * @return Название действия (например, "Добавить новую заявку").
     */
    String name();

    /**
     * Выполняет заданное действие.
     *
     * <p>Реализация может выполнять различные операции над {@link Tracker},
     * взаимодействуя с пользователем через {@link Input}.</p>
     *
     * @param input   Интерфейс для ввода данных от пользователя.
     * @param tracker Хранилище заявок.
     * @return {@code true}, если программа должна продолжить выполнение;
     *         {@code false}, если следует завершить работу.
     */
    boolean execute(Input input, Tracker tracker);
}