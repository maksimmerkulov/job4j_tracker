package ru.job4j.oop;

/**
 * Класс {@code Computer} представляет собой модель компьютера с характеристиками:
 * количество мониторов, объем SSD и модель процессора.
 * Предоставляет методы для вывода информации о компьютере.
 *
 * @author Maksim Merkulov
 * @version 1.2
 * @since 2025-04-03
 */
public class Computer {

    /**
     * Поле {@code multiMonitor} указывает, используется ли несколько мониторов.
     */
    private boolean multiMonitor;

    /**
     * Поле {@code ssd} хранит объем SSD в гигабайтах.
     */
    private int ssd;

    /**
     * Поле {@code cpu} хранит модель процессора.
     */
    private String cpu;

    /**
     * Явный конструктор {@code Computer()} по умолчанию. Поля не инициализированы.
     */
    public Computer() {
    }

    /**
     * Конструктор {@code Computer(boolean multiMonitor, int ssd, String cpu)}
     * для создания компьютера с заданными параметрами.
     *
     * @param multiMonitor Указывает, подключено ли несколько мониторов.
     * @param ssd          Объем SSD в гигабайтах.
     * @param cpu          Модель процессора.
     */
    public Computer(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    /**
     * Конструктор {@code Computer(int ssd, String cpu)} создает компьютер без указания количества мониторов.
     * Поле {@code multiMonitor} по умолчанию принимает значение {@code false}.
     *
     * @param ssd  Объем SSD в гигабайтах.
     * @param cpu  Модель процессора.
     */
    public Computer(int ssd, String cpu) {
        this.ssd = ssd;
        this.cpu = cpu;
    }

    /**
     * Конструктор {@code Computer(int ssd, String cpu, boolean multiMonitor)}
     * позволяет задать количество мониторов после характеристик системы.
     *
     * @param ssd          Объем SSD в гигабайтах.
     * @param cpu          Модель процессора.
     * @param multiMonitor Использование нескольких мониторов.
     */
    public Computer(int ssd, String cpu, boolean multiMonitor) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    /**
     * Конструктор {@code Computer(boolean multiMonitor, double ssd, String cpu)}
     * позволяет передавать объем SSD в виде {@code double},
     * но округляет его до {@code int}.
     *
     * @param multiMonitor Использование нескольких мониторов.
     * @param ssd          Объем SSD в гигабайтах (тип double).
     * @param cpu          Модель процессора.
     */
    public Computer(boolean multiMonitor, double ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = (int) ssd;
        this.cpu = cpu;
    }

    /**
     * Метод {@code printInfo()} выводит информацию о компьютере в консоль.
     */
    public void printInfo() {
        System.out.println("Много мониторов: " + multiMonitor);
        System.out.println("SSD: " + ssd + " GB");
        System.out.println("Модель CPU: " + cpu);
        System.out.println();
    }

    /**
     * Метод {@code main(String[] args)} создает несколько объектов {@link Computer} и выводит их характеристики.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Computer first = new Computer();
        first.printInfo();
        Computer second = new Computer(true, 500, "Intel Core I7-10700K");
        second.printInfo();
        Computer third = new Computer(256, "AMD Ryzen 5 3600");
        third.printInfo();
        Computer forth = new Computer(true, 512.0, "AMD Ryzen 7 3700X");
        forth.printInfo();
    }
}