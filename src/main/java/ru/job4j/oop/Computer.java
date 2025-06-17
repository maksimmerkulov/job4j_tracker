package ru.job4j.oop;

/**
 * Класс {@code Computer} представляет собой модель персонального компьютера с характеристиками:
 * наличие нескольких мониторов, объем SSD и модель процессора.
 *
 * <p>Данный класс позволяет создавать объекты с помощью конструкторов и выводить информацию
 * о характеристиках такого оборудования.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Computer computer = new Computer(true, 500, "Intel Core I7-10700K");
 * computer.printInfo();
 *
 * Computer comp = new Computer(true, 256, "AMD Ryzen 5 3600");
 * comp.printInfo();
 *
 * Computer third = new Computer();
 * third.printInfo();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Много мониторов: true
 * SSD: 500 GB
 * Модель CPU: Intel Core I7-10700K
 *
 * Много мониторов: true
 * SSD: 256 GB
 * Модель CPU: AMD Ryzen 5 3600
 *
 * Много мониторов: false
 * SSD: 0 GB
 * Модель CPU: null
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Computer {

    /**
     * Флаг, указывающий наличие нескольких мониторов.
     */
    private boolean multiMonitor;

    /**
     * Объем SSD диска, в гигабайтах.
     */
    private int ssd;

    /**
     * Модель процессора.
     */
    private String cpu;

    /**
     * Конструктор по умолчанию.
     * Инициализирует поля стандартными (по умолчанию) значениями.
     */
    public Computer() {
    }

    /**
     * Конструктор с параметрами.
     *
     * @param multiMonitor Наличие нескольких мониторов.
     * @param ssd Объем SSD диска, в гигабайтах.
     * @param cpu Модель процессора.
     */
    public Computer(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    /**
     * Выводит на экран информацию о характеристиках данного компьютера.
     */
    public void printInfo() {
        System.out.println("Много мониторов: " + multiMonitor);
        System.out.println("SSD: " + ssd + " GB");
        System.out.println("Модель CPU: " + cpu);
    }

    /**
     * Создает три объекта {@link Computer} и выводит их характеристики.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Computer computer = new Computer(true, 500, "Intel Core I7-10700K");
        Computer comp = new Computer(true, 256, "AMD Ryzen 5 3600");
        Computer third = new Computer();
        computer.printInfo();
        comp.printInfo();
        third.printInfo();
    }
}