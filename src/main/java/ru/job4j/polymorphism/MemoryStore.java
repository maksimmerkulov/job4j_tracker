package ru.job4j.polymorphism;

/**
 * Класс {@code MemoryStore} представляет реализацию интерфейса {@link Store},
 * которая сохраняет данные в оперативной памяти (в массив строк).
 *
 * <p>Данные сохраняются поочередно в массив фиксированной длины. Метод {@link #read()}
 * возвращает объединенную строку всех ранее сохраненных значений.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Store store = new MemoryStore();
 * store.save("Hello, ");
 * store.save("world!");
 * String result = store.read();
 * System.out.println(result);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Hello, world!
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class MemoryStore implements Store {

    /**
     * Массив для хранения строковых данных.
     */
    private String[] memoryStore = new String[100];

    /**
     * Текущий размер заполненной части хранилища.
     */
    private int size = 0;

    /**
     * Сохраняет строку данных в память.
     *
     * <p>Добавляет строку в массив {@code memoryStore}.
     * Если массив заполнен, новые данные не сохраняются.</p>
     *
     * @param data Строка, которую необходимо сохранить.
     */
    @Override
    public void save(String data) {
        memoryStore[size++] = data;
    }

    /**
     * Возвращает объединенные данные из памяти.
     *
     * <p>Проходит по всем сохраненным строкам и объединяет их в одну.</p>
     *
     * @return Строка, содержащая все сохраненные значения.
     */
    @Override
    public String read() {
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < size; i++) {
            buffer.append(memoryStore[i]);
        }
        return buffer.toString();
    }
}