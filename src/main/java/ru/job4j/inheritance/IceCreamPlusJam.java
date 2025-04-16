package ru.job4j.inheritance;

/**
 * Класс {@code IceCreamPlusJam} расширяет {@link IceCream} и добавляет топпинг — джем.
 *
 * <p>Стоимость джема фиксированная и составляет {@value JAM_PRICE} рублей, независимо от количества шариков.</p>
 *
 * <p>Полная стоимость рассчитывается как сумма стоимости мороженого и стоимости джема.</p>
 *
 * <p>Пример:
 * <pre>{@code
 * IceCream ice = new IceCreamPlusJam(2);    2 шарика + джем
 * int cost = ice.price();                   200 + 50 = 250 рублей
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-16
 */
public class IceCreamPlusJam extends IceCream {

    /**
     * Поле {@code JAM_PRICE} содержит фиксированную стоимость топпинга "Jam" в рублях.
     */
    private static final int JAM_PRICE = 50;

    public IceCreamPlusJam(int weight) {
        super(weight);
    }

    /**
     * Метод {@code price()} возвращает цену мороженого с джемом.
     *
     * @return Итоговая стоимость в рублях.
     */
    @Override
    public int price() {
        return JAM_PRICE + super.price();
    }
}