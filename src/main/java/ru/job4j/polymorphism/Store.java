package ru.job4j.polymorphism;

/**
 * Интерфейс {@code Store} определяет контракт для классов-хранилищ данных.
 *
 * <p>Содержит два метода: {@link #save(String data)} для сохранения данных
 * и {@link #read()} для получения ранее сохраненной информации.</p>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public interface Store {

    /**
     * Сохраняет переданную строку данных.
     *
     * @param data строка, которую необходимо сохранить
     */
    void save(String data);

    /**
     * Возвращает сохраненные данные в виде строки.
     *
     * @return строка с сохраненной информацией
     */
    String read();
}
