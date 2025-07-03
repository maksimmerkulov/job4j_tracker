package ru.job4j.oop;

/**
 * Класс {@code HierarchyUsage} демонстрирует использование иерархии классов и приведение типов
 * в контексте объектно-ориентированного программирования на языке Java.
 *
 * <p>В примере показано создание объектов классов {@link Car} и {@link Bicycle},
 * их преобразование к родительским типам, а также использование класса {@link Object}
 * как базового для всех классов в Java.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * HierarchyUsage.main(new String[]{});
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * ru.job4j.oop.Car@6bc7c054
 * ru.job4j.oop.Bicycle@232204a1
 * java.lang.Object@4aa298b7
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class HierarchyUsage {

    /**
     * Точка входа в программу, демонстрирующая иерархию классов.
     *
     * <p>Метод создает объект {@link Car}, присваивает его переменным родительских типов
     * {@link Transport} и {@link Object}, а также выполняет приведение типа обратно.
     * Затем выводятся строки, полученные вызовом {@link #toString()} у новых объектов.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Car car = new Car();
        Transport transport = car;
        Object object = car;
        Object objectCar = new Car();
        Car carFromObject = (Car) objectCar;
        System.out.println(new Car());
        System.out.println(new Bicycle());
        System.out.println(new Object());
    }
}