package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code BatteryTest} содержит модульные тесты для проверки работы метода {@link Battery#exchange(Battery)}.
 *
 * <p>Проверяются сценарии передачи заряда между аккумуляторами с разными начальными значениями.</p>
 *
 * <p><b>Покрытие:</b></p>
 * <ul>
 *   <li>Передача заряда и проверка заряда получателя</li>
 *   <li>Проверка, что источник обнуляется</li>
 *   <li>Пограничные значения (например, передача при нуле у одного аккумулятора)</li>
 * </ul>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * Battery charger = new Battery(30);
 * Battery another = new Battery(50);
 * charger.exchange(another);
 * int expected = 80;
 * assertThat(another.about()).isEqualTo("My charge: " + expected + "%");
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class BatteryTest {

    /**
     * Проверка: если передано 30% от одного аккумулятора к другому с 50%,
     * то у получателя будет 80%.
     */
    @Test
    public void whenThis30Another50ThenAnotherLoadEqual80() {
        Battery charger = new Battery(30);
        Battery another = new Battery(50);
        charger.exchange(another);
        int expected = 80;
        assertThat(another.about()).isEqualTo("My charge: " + expected + "%");
    }

    /**
     * Проверка: после передачи 80% заряда другому аккумулятору
     * текущий аккумулятор должен быть разряжен.
     */
    @Test
    public void whenThis80Another20ThenThisLoadEqual0() {
        Battery charger = new Battery(80);
        Battery another = new Battery(20);
        charger.exchange(another);
        int expected = 0;
        assertThat(charger.about()).isEqualTo("My charge: " + expected + "%");
    }

    /**
     * Проверка: если у одного аккумулятора 95%, а у второго 0%,
     * то после передачи у второго будет 95%.
     */
    @Test
    public void whenThis95Another0ThenAnotherLoadEqual95() {
        Battery charger = new Battery(95);
        Battery another = new Battery(0);
        charger.exchange(another);
        int expected = 95;
        assertThat(another.about()).isEqualTo("My charge: " + expected + "%");
    }
}
