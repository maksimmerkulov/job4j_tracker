package ru.job4j.oop;

/**
 * Класс {@code HierarchyUsage} представляет собой демонстрацию работы с иерархией наследования и приведением типов.
 *
 * <p>Используется для наглядного примера восходящего и нисходящего приведения объектов классов
 * {@link Car} и {@link Bicycle} к типам {@link Transport} и {@link Object}.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-30
 */
public class HierarchyUsage {

    /**
     * Метод демонстрирует приведение объектов в иерархии классов.
     *
     * <p>Выполняется создание объектов подклассов, приведение их к родительским типам
     * и обратное приведение с помощью явного преобразования.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Car car = new Car();
        Transport transport = car;
        Object object = car;
        Object objectCar = new Car();
        Car carFromObject = (Car) objectCar;
        Object objectBicycle = new Bicycle();
        Bicycle bicycleFromObject = (Bicycle) objectBicycle;
        System.out.println(new Car());
        System.out.println(new Bicycle());
        System.out.println(new Object());
    }
}