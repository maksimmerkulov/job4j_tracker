package ru.job4j.tracker;

/**
 * Класс {@code StartUI} представляет собой консольный пользовательский интерфейс
 * для управления заявками в системе {@link Tracker}.
 *
 * <p>Класс отображает меню и позволяет пользователю выбирать действия, такие как добавление,
 * отображение, редактирование и удаление заявок, а также завершение работы программы.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Input input = new ConsoleInput();
 * Tracker tracker = new Tracker();
 * new StartUI().init(input, tracker);
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
 * @version 1.10
 * @since 2025-05-01
 */
public class StartUI {

    /**
     * Инициализирует программу, отображая меню и обрабатывая выбор пользователя.
     *
     * <p>Циклично отображает меню и обрабатывает выбор пользователя,
     * пока тот не выберет завершение программы (выбор 6).</p>
     *
     * @param input Объект для чтения пользовательского ввода.
     * @param tracker Хранилище заявок.
     */
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            int select = input.askInt("Выбрать: ");
            if (select == 0) {
                createItem(input, tracker);
            } else if (select == 1) {
                findAllItems(tracker);
            } else if (select == 2) {
                replaceItem(input, tracker);
            } else if (select == 3) {
                deleteItem(input, tracker);
            } else if (select == 4) {
                findItemById(input, tracker);
            } else if (select == 5) {
                findItemByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    /**
     * Создает новую заявку на основе имени, введенного пользователем.
     *
     * @param input Объект для чтения пользовательского ввода.
     * @param tracker Хранилище заявок.
     */
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Создание новой заявки ===");
        String name = input.askStr("Введите имя: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Добавленная заявка: " + item);
    }

    /**
     * Отображает все заявки, хранящиеся в системе.
     *
     * @param tracker Хранилище заявок.
     */
    public static void findAllItems(Tracker tracker) {
        System.out.println("=== Вывод всех заявок ===");
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Хранилище еще не содержит заявок");
        }
    }

    /**
     * Обновляет существующую заявку по идентификатору.
     *
     * @param input Объект для чтения пользовательского ввода.
     * @param tracker Хранилище заявок.
     */
    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Редактирование заявки ===");
        int id = input.askInt("Введите id: ");
        String name = input.askStr("Введите имя: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Заявка изменена успешно.");
        } else {
            System.out.println("Ошибка замены заявки.");
        }
    }

    /**
     * Удаляет заявку по идентификатору.
     *
     * @param input Объект для чтения пользовательского ввода.
     * @param tracker Хранилище заявок.
     */
    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Удаление заявки ===");
        int id = input.askInt("Введите id: ");
        Item item = tracker.findById(id);
        tracker.delete(id);
        System.out.println(item != null ? "Заявка удалена успешно." : "Ошибка удаления заявки.");
    }

    /**
     * Отображает заявку по ее идентификатору.
     *
     * @param input Объект для чтения пользовательского ввода.
     * @param tracker Хранилище заявок.
     */
    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("=== Вывод заявки по id ===");
        int id = input.askInt("Введите id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Заявка с введенным id: " + id + " не найдена.");
        }
    }

    /**
     * Отображает все заявки с заданным именем.
     *
     * @param input Объект для чтения пользовательского ввода.
     * @param tracker Хранилище заявок.
     */
    public static void findItemByName(Input input, Tracker tracker) {
        System.out.println("=== Вывод заявок по имени ===");
        String name = input.askStr("Введите имя: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Заявки с именем: " + name + " не найдены.");
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
     * <p>Создает объекты {@link ConsoleInput} и {@link Tracker}, затем
     * передает их в {@link StartUI#init(Input, Tracker)}.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}