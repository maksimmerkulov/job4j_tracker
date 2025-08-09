package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code UniqueTextTest} содержит модульные тесты для проверки
 * корректности работы метода {@link UniqueText#isEquals(String, String)}.
 *
 * <p>Тесты проверяют как позитивные случаи (когда все слова из
 * второго текста содержатся в первом), так и негативные случаи.</p>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * UniqueText uniqueText = new UniqueText();
 * String origin = "My cat eats a mouse";
 * String text = "My cat eats a mouse";
 * assertThat(uniqueText.isEquals(origin, text)).isTrue();
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class UniqueTextTest {

    /**
     * Проверяет, что метод возвращает {@code true},
     * если обе строки идентичны и содержат одни и те же слова.
     */
    @Test
    public void isEquals() {
        UniqueText uniqueText = new UniqueText();
        String origin = "My cat eats a mouse";
        String text = "My cat eats a mouse";
        assertThat(uniqueText.isEquals(origin, text)).isTrue();
    }

    /**
     * Проверяет, что метод возвращает {@code false},
     * если во втором тексте встречаются слова, отсутствующие в первом.
     */
    @Test
    public void isNotEquals() {
        UniqueText uniqueText = new UniqueText();
        String origin = "My cat eats a mouse";
        String text = "A mouse is eaten by a cat";
        assertThat(uniqueText.isEquals(origin, text)).isFalse();
    }
}
