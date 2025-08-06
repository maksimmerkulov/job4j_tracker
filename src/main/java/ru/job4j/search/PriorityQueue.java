package ru.job4j.search;

import java.util.LinkedList;

/**
 * Класс {@code PriorityQueue} реализует очередь задач с приоритетом.
 *
 * <p>Задачи сортируются по возрастанию значения приоритета:
 * чем меньше значение, тем выше задача в очереди.</p>
 *
 * <p>Добавление производится через метод {@link #put(Task)}, который вставляет
 * задачу в правильную позицию по приоритету. Получение задачи происходит
 * через метод {@link #take()}, который извлекает и удаляет первую задачу в очереди.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * PriorityQueue queue = new PriorityQueue();
 * queue.put(new Task("low", 5));
 * queue.put(new Task("urgent", 1));
 * Task result = queue.take();
 * System.out.println(result.getDescription());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * urgent
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class PriorityQueue {

    /**
     * Очередь задач.
     */
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Вставляет задачу в очередь в соответствии с ее приоритетом.
     *
     * @param task Задача, которую нужно добавить.
     */
    public void put(Task task) {
        int index = 0;
        for (Task element : tasks) {
            if (task.getPriority() < element.getPriority()) {
                break;
            }
            index++;
        }
        tasks.add(index, task);
    }

    /**
     * Извлекает и удаляет задачу с наивысшим приоритетом.
     *
     * @return Первая задача в очереди или {@code null}, если очередь пуста.
     */
    public Task take() {
        return tasks.poll();
    }
}
