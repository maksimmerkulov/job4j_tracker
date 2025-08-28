package ru.job4j.inheritance;

/**
 * Класс {@code IceCreamPlusJamPlusNuts} расширяет {@link IceCreamPlusJam} и добавляет топпинг — орехи.
 *
 * <p>Стоимость орехов фиксированная и составляет {@value NUTS_PRICE} рублей, независимо от количества
 * шариков мороженого.</p>
 *
 * <p>Итоговая стоимость рассчитывается как:</p>
 * <pre>
 * IceCream + Jam + Nuts
 * </pre>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * IceCreamPlusJamPlusNuts iceCream = new IceCreamPlusJamPlusNuts(4);
 * System.out.println(iceCream.price());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * 475
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class IceCreamPlusJamPlusNuts extends IceCreamPlusJam {

    /**
     * Фиксированная стоимость топпинга "Nuts" в рублях.
     */
    private static final int NUTS_PRICE = 25;

    /**
     * Создает новый экземпляр класса {@link IceCream} с заданным количеством шариков.
     *
     * @param weight количество шариков мороженого
     */
    public IceCreamPlusJamPlusNuts(int weight) {
        super(weight);
    }

    /**
     * Возвращает стоимость мороженого с джемом и орехами.
     *
     * @return стоимость мороженого с джемом и орехами в рублях
     */
    @Override
    public int price() {
        return NUTS_PRICE + super.price();
    }

    /**
     * Демонстрирует создание мороженого с 4 шариками, джемом и орехами.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        IceCreamPlusJamPlusNuts iceCream = new IceCreamPlusJamPlusNuts(4);
        System.out.println(iceCream.price());
    }
}
