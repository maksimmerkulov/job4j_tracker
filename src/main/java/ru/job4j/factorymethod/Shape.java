package ru.job4j.factorymethod;

/**
 * Интерфейс {@code Shape} представляет абстрактную геометрическую фигуру.
 *
 * <p>Используется в шаблоне проектирования {@code Factory Method} в качестве общего типа
 * для всех создаваемых фигур (например, {@link Rectangle}, {@link Triangle} и др.).</p>
 *
 * <p>Каждая фигура должна уметь:</p>
 * <ul>
 *   <li>Отрисовываться в виде псевдографики через метод {@link #draw()}.</li>
 *   <li>Вычислять свою площадь через метод {@link #square()}.</li>
 * </ul>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Shape shape = new Rectangle(6, 4);
 * System.out.println(shape.draw());
 * System.out.println("Площадь фигуры равна: " + shape.square());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * ******
 * *    *
 * *    *
 * ******
 * Площадь фигуры равна: 24.0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public interface Shape {

    /**
     * Генерирует строковое представление фигуры в виде псевдографики.
     *
     * @return строка с ASCII-рисунком фигуры
     */
    String draw();

    /**
     * Вычисляет площадь фигуры.
     *
     * @return значение площади фигуры
     */
    double square();
}
