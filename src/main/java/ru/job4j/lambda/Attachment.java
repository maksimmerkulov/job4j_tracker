package ru.job4j.lambda;

/**
 * Класс {@code Attachment} представляет собой модель вложения с именем и размером.
 *
 * <p>Используется для хранения информации о вложенных файлах
 * (например, при работе со списками, сортировкой или фильтрацией по размеру/имени).</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Attachment file = new Attachment("image.png", 120);
 * System.out.println(file.getName());
 * System.out.println(file.getSize());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * {name='image.png', size=120}
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Attachment {

    /**
     * Имя вложения.
     */
    private String name;

    /**
     * Размер вложения.
     */
    private int size;

    /**
     * Конструктор для создания вложения.
     *
     * @param name имя вложения
     * @param size размер вложения
     */
    public Attachment(String name, int size) {
        this.name = name;
        this.size = size;
    }

    /**
     * Возвращает имя вложения.
     *
     * @return имя файла
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает размер вложения.
     *
     * @return размер файла
     */
    public int getSize() {
        return size;
    }

    /**
     * Возвращает строковое представление вложения в формате:
     * <pre>{@code
     * {name='...', size=...}
     * }</pre>
     *
     * @return строка с данными вложения
     */
    @Override
    public String toString() {
        return "{"
                + "name='" + name + '\''
                + ", size=" + size
                + '}';
    }
}
