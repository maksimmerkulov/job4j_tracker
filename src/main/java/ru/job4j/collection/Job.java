package ru.job4j.collection;

/**
 * Класс {@code Job} представляет работу с названием и приоритетом.
 *
 * <p>Используется для управления списком работ, где {@code priority} определяет
 * порядок выполнения. Чем меньше значение приоритета, тем выше работа в сортировке.</p>
 *
 * <p>Класс реализует интерфейс {@link Comparable}, что позволяет сортировать
 * объекты {@code Job} по возрастанию приоритета.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * List<Job> jobs = Arrays.asList(
 *         new Job("Fix bugs", 4),
 *         new Job("Impl task", 2),
 *         new Job("Reboot server", 1)
 * );
 * System.out.println(jobs);
 * Collections.sort(jobs);
 * System.out.println(jobs);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * [Job{name='Fix bugs', priority=4},
 *  Job{name='Impl task', priority=2},
 *  Job{name='Reboot server', priority=1}]
 *
 * [Job{name='Reboot server', priority=1},
 *  Job{name='Impl task', priority=2},
 *  Job{name='Fix bugs', priority=4}]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Job implements Comparable<Job> {

    /**
     * Название работы.
     */
    private String name;

    /**
     * Приоритет работы.
     *
     * <p>Меньшее значение означает более высокий приоритет.</p>
     */
    private int priority;

    /**
     * Конструктор для инициализации работы.
     *
     * @param name название работы
     * @param priority приоритет работы
     */
    public Job(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    /**
     * Возвращает название работы.
     *
     * @return название работы
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает приоритет работы.
     *
     * @return приоритет работы
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Представление объекта в строковом виде.
     *
     * @return строка с названием и приоритетом работы
     */
    @Override
    public String toString() {
        return "Job{"
                + "name='" + name + '\''
                + ", priority=" + priority
                + '}';
    }

    /**
     * Сравнивает текущую работу с другой по приоритету.
     *
     * <p>Меньшее значение {@code priority} считается "меньше".
     * При использовании сортировки работы будут располагаться
     * по возрастанию приоритета.</p>
     *
     * @param another другая работа для сравнения
     * @return отрицательное число, если текущая работа имеет меньший приоритет;
     *         0, если приоритеты равны;
     *         положительное число, если текущая работа имеет больший приоритет
     */
    @Override
    public int compareTo(Job another) {
        return Integer.compare(priority, another.priority);
    }
}
