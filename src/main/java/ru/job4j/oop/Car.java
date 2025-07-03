package ru.job4j.oop;

/**
 * Класс {@code Car} представляет автомобиль с маркой и моделью.
 *
 * <p>Содержит вложенные классы {@link Transmission}, {@link Brakes} и {@link TripComputer}
 * для управления различными компонентами автомобиля: ускорением, торможением и выводом информации.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Car car = new Car("Марка", "Модель");
 * car.startEngine();
 *
 * Car.Transmission transmission = car.new Transmission();
 * transmission.accelerate();
 *
 * Car.Brakes brakes = car.new Brakes();
 * brakes.brake();
 *
 * Car.TripComputer tripComputer = car.new TripComputer();
 * tripComputer.getInfo();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Двигатель запущен
 * Ускорение
 * Торможение
 * Марка: Марка
 * Модель: Модель TripComputer
 * Модель TripComputer: Модель TripComputer
 * Модель Car: Модель
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Car extends Transport {

    /**
     * Марка автомобиля.
     */
    private String brand;

    /**
     * Модель автомобиля.
     */
    private String model;

    /**
     * Конструктор без параметров.
     */
    public Car() {
    }

    /**
     * Конструктор для инициализации марки и модели автомобиля.
     *
     * @param brand Марка автомобиля.
     * @param model Модель автомобиля.
     */
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    /**
     * Статический метод для получения экземпляра {@link TripComputer} с предустановленными значениями.
     *
     * <p>Создает внутренний объект {@code Car} с маркой "Марка" и моделью "Модель",
     * и возвращает его {@link TripComputer}.</p>
     *
     * @return Новый экземпляр {@link TripComputer}.
     */
    public static TripComputer getTripComputer() {
        Car car = new Car("Марка", "Модель");
        Car.TripComputer tripComputer = car.new TripComputer();
        return tripComputer;
    }

    /**
     * Запускает двигатель автомобиля.
     */
    public void startEngine() {
        System.out.println("Двигатель запущен");
    }

    /**
     * Вложенный нестатический класс, отвечающий за трансмиссию автомобиля.
     *
     * <p>Предоставляет метод для ускорения.</p>
     */
    public class Transmission {

        /**
         * Метод ускорения автомобиля.
         */
        public void accelerate() {
            System.out.println("Ускорение");
        }
    }

    /**
     * Вложенный нестатический класс, отвечающий за тормоза автомобиля.
     *
     * <p>Предоставляет метод для торможения.</p>
     */
    public class Brakes {

        /**
         * Метод торможения автомобиля.
         */
        public void brake() {
            System.out.println("Торможение");
        }
    }

    /**
     * Вложенный нестатический класс, представляющий бортовой компьютер автомобиля.
     *
     * <p>Позволяет получать информацию о марке и модели автомобиля, а также демонстрирует
     * затенение поля {@code model} внутреннего класса по отношению к внешнему.</p>
     */
    public class TripComputer {

        /**
         * Название блока бортового компьютера.
         */
        public String tripData = "Бортовой компьютер";

        /**
         * Локальное поле {@code model}, затеняющее {@code Car.model}.
         */
        private String model = "Модель TripComputer";

        /**
         * Выводит информацию о марке и модели автомобиля.
         *
         * <p>Демонстрирует различие между внутренним {@code model} и {@code Car.this.model}.</p>
         */
        public void getInfo() {
            System.out.println("Марка: " + brand);
            System.out.println("Модель: " + model);
            System.out.println("Модель TripComputer: " + this.model);
            System.out.println("Модель Car: " + Car.this.model);
        }
    }
}