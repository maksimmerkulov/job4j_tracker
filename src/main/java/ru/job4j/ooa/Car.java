package ru.job4j.ooa;

/**
 * Финальный класс {@code Car} представляет собой модель автомобиля.
 *
 * <p>Наследование от данного класса запрещено с помощью ключевого слова {@code final}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Car car = new Car();
 * car.printMark();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Метод выводит марку автомобиля
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public final class Car {

    /**
     * Выводит информацию о марке автомобиля в консоль.
     *
     * <p>Метод демонстрационный и не содержит логики определения конкретной марки.</p>
     */
    public void printMark() {
        System.out.println("Метод выводит марку автомобиля");
    }
}