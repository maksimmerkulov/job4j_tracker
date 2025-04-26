package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Класс {@code StartUI} представляет собой консольный пользовательский интерфейс
 * для управления заявками в системе {@link Tracker}.
 *
 * <p>Класс отображает меню и позволяет пользователю выбирать действия, такие как добавление,
 * отображение, редактирование и удаление заявок, а также завершение работы программы.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Scanner scanner = new Scanner(System.in);
 * Tracker tracker = new Tracker();
 * new StartUI().init(scanner, tracker);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Меню:
 * 0. Добавить новую заявку
 * 1. Показать все заявки
 * 2. Изменить заявку
 * 3. Удалить заявку
 * 4. Показать заявку по id
 * 5. Показать заявки по имени
 * 6. Завершить программу
 * Выбрать:
 * Пользователь выбрал: 0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 * @since 2025-04-26
 */
public class StartUI {

    /**
     * Инициализирует программу, отображая меню и обрабатывая выбор пользователя.
     *
     * <p>Циклично отображает меню и обрабатывает выбор пользователя,
     * пока тот не выберет завершение программы (выбор 6).</p>
     *
     * @param scanner Объект для чтения пользовательского ввода.
     * @param tracker Хранилище заявок.
     * @throws NumberFormatException если ввод пользователя не является числом.
     */
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            System.out.print("Выбрать: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select != 6) {
                System.out.println("Пользователь выбрал: " + select);
            } else {
                run = false;
            }
        }
    }

    /**
     * Отображает меню доступных операций в системе.
     *
     * <p>Меню включает в себя действия по добавлению, изменению, удалению
     * и отображению заявок, а также завершение работы программы.</p>
     */
    private void showMenu() {
        String[] menu = {
                "Добавить новую заявку", "Показать все заявки", "Изменить заявку",
                "Удалить заявку", "Показать заявку по id", "Показать заявки по имени",
                "Завершить программу"
        };
        System.out.println("Меню:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }

    /**
     * Точка входа для приложения.
     *
     * <p>Создает объекты {@link Scanner} и {@link Tracker}, затем
     * передает их в {@link StartUI#init(Scanner, Tracker)}.</p>
     *
     * @param args Аргументы командной строки (не используются).
     * @implSpec Этот метод служит точкой входа для программы.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}