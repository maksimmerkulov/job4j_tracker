package ru.job4j.polymorphism;

/**
 * Интерфейс {@code Fuel} описывает поведение, связанное с заправкой транспортного средства.
 *
 * <p>Предназначен для реализации в классах, которые требуют пополнения запасов топлива —
 * таких, как автомобили, мотоциклы, катера и другие средства передвижения.</p>
 *
 * <p><b>Сценарии использования:</b></p>
 * <ul>
 *   <li>Расширение поведения транспортных средств возможностью заправки.</li>
 *   <li>Интеграция с топливными сервисами или моделями расхода топлива.</li>
 * </ul>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public interface Fuel {

    /**
     * Выполняет заправку транспортного средства.
     *
     * <p>Конкретная реализация зависит от типа топлива:
     * бензин, дизель, газ, электричество и т.д.</p>
     */
    void refill();
}