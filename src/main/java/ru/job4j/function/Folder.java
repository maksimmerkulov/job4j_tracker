package ru.job4j.function;

import java.util.Objects;

/**
 * Класс {@code Folder} представляет собой модель данных для хранения
 * информации о папке, включающей имя и размер.
 *
 * <p>Используется совместно с {@link SearchFolder} для демонстрации
 * фильтрации коллекций объектов.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Folder folder = new Folder("docs", 120);
 * System.out.println(folder.getName());
 * System.out.println(folder.getSize());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Folder{name='docs', size=120}
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Folder {

    /**
     * Имя папки.
     */
    private String name;

    /**
     * Размер папки.
     */
    private int size;

    /**
     * Конструктор для создания объекта {@code Folder}.
     *
     * @param name имя папки
     * @param size размер папки
     */
    public Folder(String name, int size) {
        this.name = name;
        this.size = size;
    }

    /**
     * Возвращает имя папки.
     *
     * @return имя папки
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает размер папки.
     *
     * @return размер папки
     */
    public int getSize() {
        return size;
    }

    /**
     * Сравнивает текущий объект {@code Folder} с другим объектом.
     *
     * <p>Два объекта считаются равными, если совпадают имя и размер.</p>
     *
     * @param o объект для сравнения
     * @return {@code true}, если объекты равны; {@code false} в противном случае
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Folder folder = (Folder) o;
        return size == folder.size && Objects.equals(name, folder.name);
    }

    /**
     * Возвращает хэш-код объекта {@code Folder}.
     *
     * <p>Хэш-код вычисляется на основе имени и размера папки.</p>
     *
     * @return значение хэш-кода
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }

    /**
     * Возвращает строковое представление объекта {@code Folder}.
     *
     * <p>Формат: {@code Folder{name='имя', size=размер}}</p>
     *
     * @return строковое представление объекта
     */
    @Override
    public String toString() {
        return "Folder{"
                + "name='" + name + '\''
                + ", size=" + size
                + '}';
    }
}
