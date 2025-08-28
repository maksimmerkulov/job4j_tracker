package ru.job4j.inheritance;

/**
 * Класс {@code IceCream} моделирует шарик мороженого, продающийся в киоске.
 *
 * <p>Базовая стоимость одного шарика — 100 рублей за единицу {@code weight}.</p>
 *
 * <p>Дополнительно к мороженому можно добавлять топпинги, за которые взимается доплата.
 * В текущей модели {@code IceCream} не учитывает топпинги напрямую — для этого создаются наследники.</p>
 *
 * <p>Для добавления топпингов используются классы {@link IceCreamPlusJam} и {@link IceCreamPlusJamPlusNuts},
 * расширяющие {@code IceCream}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * IceCream iceCream = new IceCream(2);
 * System.out.println(iceCream.price());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * 200
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class IceCream {

    /**
     * Количество шариков мороженого.
     */
    private int weight;

    /**
     * Создает новый экземпляр класса {@code IceCream} с заданным количеством шариков.
     *
     * @param weight количество шариков мороженого
     */
    public IceCream(int weight) {
        this.weight = weight;
    }

    /**
     * Возвращает стоимость мороженого без учета топпингов.
     *
     * @return стоимость мороженого в рублях
     */
    public int price() {
        return weight * 100;
    }
}
