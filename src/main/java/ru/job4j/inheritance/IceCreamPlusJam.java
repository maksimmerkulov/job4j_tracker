package ru.job4j.inheritance;

/**
 * Класс {@code IceCreamPlusJam} расширяет {@link IceCream} и добавляет топпинг — джем.
 *
 * <p>Стоимость джема фиксированная и составляет {@value JAM_PRICE} рублей, независимо от количества шариков.</p>
 *
 * <p>Итоговая стоимость рассчитывается как:</p>
 * <pre>
 * IceCream + Jam
 * </pre>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * IceCreamPlusJam jamIceCream = new IceCreamPlusJam(2);
 * System.out.println(jamIceCream.price());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * 250
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class IceCreamPlusJam extends IceCream {

    /**
     * Фиксированная стоимость топпинга "Jam" в рублях.
     */
    private static final int JAM_PRICE = 50;

    /**
     * Создает новый экземпляр класса {@link IceCream} с заданным количеством шариков.
     *
     * @param weight количество шариков мороженого
     */
    public IceCreamPlusJam(int weight) {
        super(weight);
    }

    /**
     * Возвращает стоимость мороженого с добавленным топпингом "Jam".
     *
     * @return стоимость мороженого с джемом в рублях
     */
    @Override
    public int price() {
        return JAM_PRICE + super.price();
    }
}
