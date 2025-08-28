package ru.job4j.search;

import java.util.LinkedList;

/**
 * Класс {@code PriorityQueue} описывает работу простейшей очереди по приоритету,
 * которая работает по принципу FIFO (first in - first out).
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
 * @version 1.1
 */
public class PriorityQueue {

    /**
     * Хранение задания осуществляется в коллекции типа LinkedList.
     */
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Принимает на вход заявку и добавляет ее в очередь.
     *
     * <p>Если встречаются 2 задания с одинаковым приоритетом,
     * то в очереди они распределяются по принципу FIFO.</p>
     *
     * @param task задача, которая добавляется в очередь
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
     * Возвращает первую задачу из очереди.
     *
     * @return задача из головы очереди;
     *         {@code null}, если очередь пуста
     */
    public Task take() {
        return tasks.poll();
    }
}
