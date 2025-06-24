package ru.job4j.pojo;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code LicenseTest} выполняет модульное тестирование метода {@link License#equals(Object)}.
 *
 * <p>Проверяется корректность сравнения объектов {@link License} по полю {@code code}.</p>
 *
 * <p><b>Цель теста:</b> убедиться, что два объекта {@link License} с одинаковым значением кода
 * считаются равными методом {@link License#equals(Object)}.</p>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * License first = new License();
 * first.setCode("audio");
 * License second = new License();
 * second.setCode("audio");
 * assertThat(first).isEqualTo(second);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class LicenseTest {

    /**
     * Тест проверяет, что два объекта {@link License}
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