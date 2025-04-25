package ru.job4j.polymorphism;

/**
 * Класс {@code MemoryStore} представляет реализацию интерфейса {@link Store},
 * использующую оперативную память в качестве хранилища.
 *
 * <p>Данные сохраняются в массиве строк фиксированного размера (100 элементов)
 * и могут быть прочитаны как одна объединенная строка.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * MemoryStore store = new MemoryStore();
 * store.save("Hello");
 * store.save("World");
 * String result = store.read();
 * System.out.println(result);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * HelloWorld
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-25
 */
public class MemoryStore implements Store {

    /**
     * Поле {@code memoryStore} используется как внутреннее хранилище для строковых данных.
     * Максимальная вместимость — 100 элементов.
     */
    private String[] memoryStore = new String[100];

    /**
     * Поле {@code size} отслеживает количество сохраненных строк в {@code memoryStore}.
     */
    private int size = 0;

    /**
     * Метод {@code save(String data)} сохраняет переданную строку в массив {@code memoryStore}.
     *
     * <p>Сохраняет данные по текущему индексу {@code size} и увеличивает счетчик.</p>
     *
     * @param data Строка, которую необходимо сохранить в памяти.
     */
    public void save(String data) {
        memoryStore[size++] = data;
    }

    /**
     * Метод {@code read()} возвращает объединенное содержимое всех сохраненных строк.
     *
     * <p>Создает объект {@link StringBuilder} и последовательно добавляет к нему строки из массива.</p>
     *
     * @return Строка, представляющая объединенное содержимое хранилища.
     */
    public String read() {
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < size; i++) {
            buffer.append(memoryStore[i]);
        }
        return buffer.toString();
    }
}