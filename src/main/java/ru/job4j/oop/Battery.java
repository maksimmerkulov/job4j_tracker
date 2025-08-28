package ru.job4j.oop;

/**
 * Класс {@code Battery} моделирует аккумулятор с определенным уровнем заряда.
 *
 * <p>Один аккумулятор может передать весь свой заряд другому аккумулятору
 * методом {@link #exchange(Battery)}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Battery first = new Battery(70);
 * Battery second = new Battery(30);
 * System.out.println("First." + first.about());
 * System.out.println("Second." + second.about());
 * first.exchange(second);
 * System.out.println("First." + first.about());
 * System.out.println("Second." + second.about());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * First.My charge: 70%
 * Second.My charge: 30%
 * First.My charge: 0%
 * Second.My charge: 100%
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Battery {

    /**
     * Текущий уровень заряда аккумулятора в процентах.
     */
    private int load;

    /**
     * Создает аккумулятор с заданным уровнем заряда.
     *
     * @param load уровень заряда в процентах
     */
    public Battery(int load) {
        this.load = load;
    }

    /**
     * Возвращает строку с текущим уровнем заряда аккумулятора.
     *
     * @return строка, содержащая информацию о заряде
     */
    public String about() {
        return "My charge: " + load + "%";
    }

    /**
     * Передает весь заряд от текущего аккумулятора к другому.
     *
     * <p>Текущий аккумулятор обнуляется.</p>
     *
     * @param another аккумулятор, которому передается заряд
     */
    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    /**
     * Демонстрирует работу метода {@link #exchange(Battery)}
     * и выводит уровень заряда до и после передачи.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Battery first = new Battery(70);
        Battery second = new Battery(30);
        System.out.println("First." + first.about());
        System.out.println("Second." + second.about());
        first.exchange(second);
        System.out.println("First." + first.about());
        System.out.println("Second." + second.about());
    }
}
