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
 * Computer first = new Computer();
 * first.printInfo();
 *
 * Computer second = new Computer(true, 500, "Intel Core I7-10700K");
 * second.printInfo();
 *
 * Computer third = new Computer(256, "AMD Ryzen 5 3600");
 * third.printInfo();
 *
 * Computer forth = new Computer(true, 512.0, "AMD Ryzen 7 3700X");
 * forth.printInfo();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Много мониторов: false
 * SSD: 0 GB
 * Модель CPU: null
 *
 * Много мониторов: true
 * SSD: 500 GB
 * Модель CPU: Intel Core I7-10700K
 *
 * Много мониторов: false
 * SSD: 256 GB
 * Модель CPU: AMD Ryzen 5 3600
 *
 * Много мониторов: true
 * SSD: 512 GB
 * Модель CPU: AMD Ryzen 7 3700X
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
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
     *
     * <p>Инициализирует поля стандартными (по умолчанию) значениями.</p>
     */
    public Computer() {
    }

    /**
     * Конструктор с двумя параметрами.
     *
     * <p>Поле {@code multiMonitor} по умолчанию принимает значение {@code false}.</p>
     *
     * @param ssd объем SSD диска, в гигабайтах
     * @param cpu модель процессора
     */
    public Computer(int ssd, String cpu) {
        this.ssd = ssd;
        this.cpu = cpu;
    }

    /**
     * Конструктор с тремя параметрами.
     *
     * @param multiMonitor наличие нескольких мониторов
     * @param ssd объем SSD диска, в гигабайтах
     * @param cpu модель процессора
     */
    public Computer(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    /**
     * Конструктор с тремя параметрами.
     *
     * <p>Позволяет передавать объем SSD в виде {@code double},
     * но округляет его до {@code int}.</p>
     *
     * @param multiMonitor наличие нескольких мониторов
     * @param ssd объем SSD диска, в гигабайтах (тип {@code double})
     * @param cpu модель процессора
     */
    public Computer(boolean multiMonitor, double ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = (int) ssd;
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
     * Создает несколько объектов {@link Computer} и выводит их характеристики.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Computer first = new Computer();
        Computer second = new Computer(true, 500, "Intel Core I7-10700K");
        Computer third = new Computer(256, "AMD Ryzen 5 3600");
        Computer forth = new Computer(true, 512.0, "AMD Ryzen 7 3700X");
        first.printInfo();
        second.printInfo();
        third.printInfo();
        forth.printInfo();
    }
}
