package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Класс {@code FullSearch} извлекает уникальные номера задач из списка.
 *
 * <p>Используется для фильтрации списка {@link Task}, чтобы оставить только
 * уникальные значения поля {@code number}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * List<Task> tasks = List.of(
 *     new Task("1", "Fix bug"),
 *     new Task("2", "Implement feature"),
 *     new Task("1", "Refactor code")
 * );
 * Set<String> numbers = new FullSearch().extractNumber(tasks);
 * System.out.println(numbers);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * [1, 2]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class FullSearch {

    /**
     * Извлекает уникальные номера задач из списка.
     *
     * <p>Метод проходит по каждому элементу списка {@link Task},
     * получает значение {@link Task#getNumber()} и добавляет его в {@link HashSet}.
     * Поскольку {@link HashSet} хранит только уникальные элементы, дубликаты будут отброшены.</p>
     *
     * @param tasks Список задач.
     * @return Множество уникальных номеров задач.
     */
    public Set<String> extractNumber(List<Task> tasks) {
        Set<String> numbers = new HashSet<>();
        for (Task task : tasks) {
            numbers.add(task.getNumber());
        }
        return numbers;
    }
}
