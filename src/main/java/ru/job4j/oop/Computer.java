package ru.job4j.oop;

/**
 * Класс {@code Computer} представляет собой модель компьютера с характеристиками:
 * количество мониторов, объем SSD и модель процессора.
 * Предоставляет методы для вывода информации о компьютере.
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-03-31
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
        this.ssd          = ssd;
        this.cpu          = cpu;
    }

    /**
     * Метод {@code printInfo()} выводит информацию о компьютере в консоль.
     */
    public void printInfo() {
        System.out.println("Много мониторов: " + multiMonitor);
        System.out.println("SSD: " + ssd + " GB");
        System.out.println("Модель CPU: " + cpu);
    }

    /**
     * Метод {@code main(String[] arg)} создает несколько объектов {@code Computer} и выводит их характеристики.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Computer computer = new Computer(true, 500, "Intel Core I7-10700K");
        computer.printInfo();
        Computer comp = new Computer(true, 256, "AMD Ryzen 5 3600");
        comp.printInfo();
        Computer compDefault  = new Computer();
        compDefault.printInfo();
    }
}