package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code BatteryTest} содержит юнит-тесты для класса {@code Battery}.
 * Тестирует функциональность метода {@code exchange()}, который передаёт заряд
 * от одной батареи другой.
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-01
 */
public class BatteryTest {

    /**
     * Тестирует метод {@code exchange()} для случая, когда заряд первой батареи
     * составляет 30%, а второй — 50%. Ожидается, что заряд второй батареи
     * после обмена будет равен 80%.
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
     * Тестирует метод {@code exchange()} для случая, когда заряд первой батареи
     * составляет 80%, а второй — 20%. Ожидается, что заряд первой батареи
     * после обмена станет равным 0%.
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
     * Тестирует метод {@code exchange()} для случая, когда заряд первой батареи
     * составляет 95%, а второй — 0%. Ожидается, что заряд второй батареи
     * после обмена будет равен 95%.
     */
    @Test
    public void whenThis95Another0ThenAnotherLoadEqual80() {
        Battery charger = new Battery(95);
        Battery another = new Battery(0);
        charger.exchange(another);
        int expected = 95;
        assertThat(another.about()).isEqualTo("My charge: " + expected + "%");
    }
}
