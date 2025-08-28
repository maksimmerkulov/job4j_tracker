package ru.job4j.queue;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.job4j.queue.Position.*;

/**
 * Класс {@code ScheduleTaskTest} содержит модульные тесты для проверки корректной работы
 * класса {@link ScheduleTask}.
 *
 * <p>Проверяется поведение методов {@link ScheduleTask#readTask()} и {@link ScheduleTask#getTask()}
 * при работе с задачами {@link Task} с разными должностями и уровнем срочности.</p>
 *
 * <p><b>Примеры тестов:</b></p>
 * <ul>
 *     <li>Проверка чтения задачи с наибольшей срочностью среди задач одного ранга (readTask).</li>
 *     <li>Проверка извлечения задач с удалением и сохранением порядка по компаратору (getTask).</li>
 * </ul>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * Comparator<Task> comparator = new TaskByPositionAsc().thenComparing(new TaskByUrgencyDesc());
 * ScheduleTask scheduleTask = new ScheduleTask(comparator);
 * scheduleTask.addTask(new Task(DEPARTMENT_HEAD, "description_1", 10));
 * scheduleTask.addTask(new Task(DIRECTOR, "description_2", 4));
 * scheduleTask.addTask(new Task(DIRECTOR, "description_3", 8));
 * String expected = "description_3";
 * String result = scheduleTask.readTask().description();
 * assertThat(result).isEqualTo(expected);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
class ScheduleTaskTest {

    /**
     * Проверяет, что метод {@link ScheduleTask#readTask()} возвращает
     * задачу с наибольшей срочностью среди задач одного ранга (DIRECTOR),
     * не удаляя ее из очереди.
     */
    @Test
    void whenTwoDirectorTaskThenReadMethodTest() {
        Comparator<Task> comparator = new TaskByPositionAsc().thenComparing(new TaskByUrgencyDesc());
        ScheduleTask scheduleTask = new ScheduleTask(comparator);
        scheduleTask.addTask(new Task(DEPARTMENT_HEAD, "description_1", 10));
        scheduleTask.addTask(new Task(DIRECTOR, "description_2", 4));
        scheduleTask.addTask(new Task(DIRECTOR, "description_3", 8));
        String expected = "description_3";
        String result = scheduleTask.readTask().description();
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверяет, что метод {@link ScheduleTask#getTask()} корректно извлекает
     * задачи из очереди с удалением, соблюдая порядок по компаратору,
     * даже если несколько задач имеют одинаковый уровень срочности.
     */
    @Test
    void whenTwoDepartmentHeadTaskAndEqualUrgencyThenGetMethodTest() {
        Comparator<Task> comparator = new TaskByPositionAsc().thenComparing(new TaskByUrgencyDesc());
        ScheduleTask scheduleTask = new ScheduleTask(comparator);
        scheduleTask.addTask(new Task(DEPARTMENT_HEAD, "description_1", 7));
        scheduleTask.addTask(new Task(MANAGER, "description_2", 10));
        scheduleTask.addTask(new Task(DEPARTMENT_HEAD, "description_3", 7));
        String expected = "description_1";
        String result = scheduleTask.getTask().description();
        assertThat(result).isEqualTo(expected);
        scheduleTask.getTask();
        expected = "description_2";
        result = scheduleTask.getTask().description();
        assertThat(result).isEqualTo(expected);
    }
}
