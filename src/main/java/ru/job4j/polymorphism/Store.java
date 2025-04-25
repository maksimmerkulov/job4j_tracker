package ru.job4j.polymorphism;

/**
 * Интерфейс {@code Store} определяет контракт для классов-хранилищ данных.
 *
 * <p>Содержит два метода: {@link #save(String data)} для сохранения данных
 * и {@link #read()} для получения ранее сохраненной информации.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Store store = new MemoryStore();
 * store.save("example");
 * String result = store.read();
 * System.out.println(result);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * example
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-25
 */
public interface Store {

    /**
     * Метод {@code save(String data)} сохраняет переданную строку данных.
     *
     * @param data Строка, которую необходимо сохранить.
     */
    void save(String data);

    /**
     * Метод {@code read()} возвращает сохраненные данные в виде строки.
     *
     * @return Строка с сохраненной информацией.
     */
    String read();
}