package ru.job4j.inheritance;

/**
 * Класс {@code IceCream} моделирует шарик мороженого, продающийся в киоске.
 *
 * <p>Базовая стоимость одного шарика — 100 рублей за единицу {@code weight}.</p>
 *
 * <p>Дополнительно к мороженому можно добавлять топпинги, за которые взимается доплата.
 * В текущей модели {@code IceCream} не учитывает топпинги напрямую — для этого создаются наследники.</p>
 *
 * <p>Пример:
 * <pre>{@code
 * IceCream simple = new IceCream(2);    2 шарика
 * int cost = simple.price();            200 рублей
 * }</pre>
 *
 * <p>Для добавления топпингов используются классы {@link IceCreamPlusJam} и {@link IceCreamPlusJamPlusNuts},
 * расширяющие {@code IceCream}.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-16
 */
public class IceCream {

    /**
     * Поле {@code weight} содержит количество шариков мороженого.
     */
    private int weight;

    /**
     * Конструктор {@code IceCream(int weight)} создает мороженое с указанным количеством шариков.
     *
     * @param weight Количество шариков мороженого.
     */
    public IceCream(int weight) {
        this.weight = weight;
    }

    /**
     * Метод {@code price()} возвращает стоимость мороженого без учета топпингов.
     *
     * @return Цена в рублях.
     */
    public int price() {
        return weight * 100;
    }
}