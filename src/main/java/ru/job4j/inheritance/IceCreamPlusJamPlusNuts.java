package ru.job4j.inheritance;

/**
 * Класс {@code IceCreamPlusJamPlusNuts} расширяет {@link IceCreamPlusJam} и добавляет топпинг — орехи.
 *
 * <p>Стоимость орехов фиксированная и составляет {@value NUTS_PRICE} рублей, независимо от количества
 * шариков мороженого.</p>
 *
 * <p>Итоговая стоимость рассчитывается как:
 * <pre>IceCream + Jam + Nuts</pre>
 *
 * <p>Пример:
 * <pre>{@code
 * IceCream ice = new IceCreamPlusJamPlusNuts(4);    4 * IceCream + Jam + Nuts
 * int cost = ice.price();                           (4 * 100) + 50 + 25 = 475
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-16
 */
public class IceCreamPlusJamPlusNuts extends IceCreamPlusJam {

    /**
     * Поле {@code NUTS_PRICE} содержит фиксированную стоимость топпинга "Nuts" в рублях.
     */
    private static final int NUTS_PRICE = 25;

    /**
     * Конструктор {@code IceCreamPlusJamPlusNuts(int weight)}.
     *
     * @param weight Количество шариков мороженого.
     */
    public IceCreamPlusJamPlusNuts(int weight) {
        super(weight);
    }

    /**
     * Метод {@code price()} возвращает цену мороженого с джемом и орехами.
     *
     * @return Итоговая стоимость в рублях.
     */
    @Override
    public int price() {
        return NUTS_PRICE + super.price();
    }

    /**
     * Метод {@code main(String[] args)} демонстрирует создание мороженого с 4 шариками, джемом и орехами.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        IceCreamPlusJamPlusNuts iceCream = new IceCreamPlusJamPlusNuts(4);
        System.out.println(iceCream.price());
    }
}