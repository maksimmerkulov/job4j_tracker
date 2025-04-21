package ru.job4j.pojo;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тест-класс {@code LicenseTest} содержит модульный тест для проверки корректности работы
 * метода {@link License#equals(Object)} в классе {@link License}.
 *
 * <p>Проверяется, что два объекта {@link License} с одинаковым значением
 * поля {@code code} считаются равными.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-21
 */

public class LicenseTest {

    /**
     * Тест {@code eqName()} проверяет, что два объекта {@link License}
     * с одинаковым значением поля {@code code} считаются равными.
     */
    @Test
    public void eqName() {
        License first = new License();
        first.setCode("audio");
        License second = new License();
        second.setCode("audio");
        assertThat(first).isEqualTo(second);
    }
}