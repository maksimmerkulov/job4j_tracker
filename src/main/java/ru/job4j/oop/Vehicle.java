package ru.job4j.oop;

/**
 * Абстрактный класс {@code Vehicle} представляет собой базовую модель транспортного средства.
 *
 * <p>Содержит общие свойства и поведение, характерные для любых видов транспорта.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public abstract class Vehicle {

    /**
     * Марка транспортного средства (например, "Toyota").
     */
    private String brand;

    /**
     * Модель транспортного средства (например, "Camry").
     */
    private String model;

    /**
     * Тип транспортного средства (например, "Sedan", "SUV", "Truck").
     */
    private String type;

    /**
     * Максимальное количество пассажиров.
     */
    private int passengers;

    /**
     * Максимальная скорость транспортного средства в км/ч.
     */
    private int maxSpeed;

    /**
     * Абстрактный метод для реализации разгона транспортного средства.
     *
     * <p>Должен быть переопределен в каждом конкретном подклассе.</p>
     */
    public abstract void accelerate();

    /**
     * Абстрактный метод для реализации поворота транспортного средства.
     *
     * <p>Должен быть переопределен в каждом конкретном подклассе.</p>
     */
    public abstract void steer();

    /**
     * Метод торможения по умолчанию.
     *
     * <p>Может быть переопределен в подклассах для реализации особого типа торможения.</p>
     */
    public void brake() {
        System.out.println("Стандартная тормозная система");
    }
}