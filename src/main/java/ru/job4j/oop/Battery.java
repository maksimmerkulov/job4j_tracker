package ru.job4j.oop;

/**
 * Класс {@code Battery} моделирует батарею с зарядом.
 * Предоставляет возможность узнать текущий заряд и передать заряд другой батарее.
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-04-03
 */
public class Battery {

    /**
     * Поле {@code load} представляет собой уровень заряда батареи в процентах.
     * Значение этого поля варьируется от 0 до 100, где 0 означает разряженную батарею,
     * а 100 — полностью заряженную.
     */
    private int load;

    /**
     * Конструктор {@code Battery(int load)} инициализирует батарею с заданным зарядом.
     *
     * @param load Начальный заряд батареи в процентах.
     */
    public Battery(int load) {
        this.load = load;
    }

    /**
     * Метод {@code about()} возвращает строковое описание текущего заряда батареи.
     *
     * @return Строка, содержащая информацию о заряде.
     */
    public String about() {
        return "My charge: " + load + "%";
    }

    /**
     * Метод {@code exchange(Battery another)} передает заряд текущей батареи другой батарее.
     * После обмена заряд текущей батареи становится равным 0.
     *
     * @param another Батарея, которой передается заряд.
     */
    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    /**
     * Метод {@code main(String[] args)} демонстрирует работу класса {@link Battery}.
     * Создает два объекта {@link Battery}, выводит информацию о заряде до их обмена.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Battery first = new Battery(70);
        Battery second = new Battery(30);
        System.out.println("First." + first.about());
        System.out.println("Second." + second.about());
        first.exchange(second);
    }
}

