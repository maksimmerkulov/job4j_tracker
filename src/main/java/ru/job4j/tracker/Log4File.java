package ru.job4j.tracker;

/**
 * Класс {@code Log4File} реализует шаблон Singleton.
 *
 * <p>Используется для хранения и сохранения логов в файл или другой источник.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Log4File log = Log4File.getInstance();
 * log.add("Программа запущена");
 * log.save();
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public final class Log4File {

    /**
     * Единственный экземпляр {@code Log4File}.
     */
    private static Log4File instance = null;

    /**
     * Хранилище сообщений.
     */
    private String[] messages = new String[1000];

    /**
     * Индекс следующей позиции для записи.
     */
    private int index = 0;

    /**
     * Приватный конструктор — запрещает создание объекта извне.
     */
    private Log4File() {
    }

    /**
     * Возвращает единственный экземпляр {@code Log4File}.
     *
     * @return объект {@code Log4File}
     */
    public static Log4File getInstance() {
        if (instance == null) {
            instance = new Log4File();
        }
        return instance;
    }

    /**
     * Добавляет сообщение в лог.
     *
     * @param message строка сообщения.
     */
    public void add(String message) {
        messages[index++] = message;
    }

    /**
     * Сохраняет лог (реализация пока пустая).
     */
    public void save() {
    }
}