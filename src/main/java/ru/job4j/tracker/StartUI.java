package ru.job4j.tracker;

/**
 * Класс {@code StartUI} управляет взаимодействием пользователя с приложением трекера заявок.
 *
 * <p>Используется для запуска консольного интерфейса, отображения меню, обработки
 * пользовательского ввода и выполнения операций над заявками через {@link Tracker}.</p>
 *
 * <p><b>Сценарии использования:</b></p>
 * <ul>
 *     <li>Инициализация с {@link ConsoleInput} и {@link Tracker}.</li>
 *     <li>Вывод пользовательского меню и обработка выбора до завершения программы.</li>
 *     <li>Добавление новой заявки.</li>
 *     <li>Отображение всех заявок.</li>
 *     <li>Редактирование существующей заявки.</li>
 *     <li>Удаление заявки по идентификатору.</li>
 *     <li>Поиск заявки по идентификатору.</li>
 *     <li>Поиск заявок по имени.</li>
 * </ul>
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
 * Выбрать: 0
 * === Создание новой заявки ===
 * Введите имя: test
 * Добавленная заявка: Item{id=1, name='test', created=28-апреля-понедельник-2025 06:22:49}
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.9
 */
public class StartUI {

    /**
     * Запускает главный цикл пользовательского интерфейса.
     *
     * <p>Метод отображает меню, обрабатывает выбор пользователя и выполняет действия:
     * создание, просмотр, редактирование, удаление и поиск заявок.</p>
     *
     * @param input Источник пользовательского ввода.
     * @param tracker Хранилище для работы с заявками.
     */
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            int select = input.askInt("Выбрать: ");
            if (select == 0) {
                System.out.println("=== Создание новой заявки ===");
                String name = input.askStr("Введите имя: ");
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Добавленная заявка: " + item);
            } else if (select == 1) {
                System.out.println("=== Вывод всех заявок ===");
                Item[] items = tracker.findAll();
                if (items.length > 0) {
                    for (Item item : items) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println("Хранилище еще не содержит заявок");
                }
            } else if (select == 2) {
                System.out.println("=== Редактирование заявки ===");
                int id = input.askInt("Введите id: ");
                String name = input.askStr("Введите имя: ");
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Заявка изменена успешно.");
                } else {
                    System.out.println("Ошибка замены заявки.");
                }
            } else if (select == 3) {
                System.out.println("=== Удаление заявки ===");
                int id = input.askInt("Введите id: ");
                Item item = tracker.findById(id);
                tracker.delete(id);
                System.out.println(item != null ? "Заявка удалена успешно." : "Ошибка удаления заявки.");
            } else if (select == 4) {
                System.out.println("=== Вывод заявки по id ===");
                int id = input.askInt("Введите id: ");
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item);
                } else {
                    System.out.println("Заявка с введенным id: " + id + " не найдена.");
                }
            } else if (select == 5) {
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
            } else if (select == 6) {
                run = false;
            }
        }
    }

    /**
     * Отображает текстовое меню команд на экран.
     *
     * <p>Меню содержит пункты для добавления, редактирования, удаления
     * и поиска заявок, а также пункт для выхода из программы.</p>
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
     * Точка входа в программу.
     *
     * <p>Создает объекты {@link ConsoleInput} и {@link Tracker}, после чего запускает
     * пользовательский интерфейс с помощью метода {@link StartUI#init(Input, Tracker)}.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}