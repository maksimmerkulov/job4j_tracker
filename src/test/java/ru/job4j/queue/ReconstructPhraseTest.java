package ru.job4j.queue;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code ReconstructPhraseTest} содержит тесты для проверки
 * корректности работы класса {@link ReconstructPhrase}.
 *
 * <p>Данный тест проверяет, что при подаче заранее сформированных
 * очередей символов метод {@link ReconstructPhrase#getReconstructPhrase()}
 * восстанавливает известную фразу.</p>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * Deque<Character> evenElements = new LinkedList<>(
 *         Arrays.asList(
 *                 'S', '1', 'l', '3', 'o', 'h', 'g', 'h', 'a', 'm', 'n', 't',
 *                 ' ', 't', 'o', ' ', 'f', 'q', ' ', '6', 'l', '.', 'a', ',',
 *                 'n', 'w', 'g', 'd', 'u', 'a', 'a', 'u', 'g', 'd', 'e', 'q',
 *                 ' ', 'y', 'J', 'd', 'a', 'k', 'v', 'p', 'a', 'e', ':', 'b'
 *         )
 * );
 * Deque<Character> descendingElements = new LinkedList<>(
 *         Arrays.asList(
 *                 'e', 'r', 'e', 'h', 'w', 'y', 'r', 'e', 'v', 'e', ' ', 'n', 'u',
 *                 'r', ' ', ',', 'e', 'c', 'n', 'o', ' ', 'e', 't', 'i', 'r', 'W', ' '
 *         )
 * );
 * String expected = "Slogan of language Java: Write once, run everywhere";
 * String result = new ReconstructPhrase(descendingElements, evenElements).getReconstructPhrase();
 * assertThat(result).isEqualTo(expected);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
class ReconstructPhraseTest {

    /**
     * Проверяет, что при подаче заранее сформированных очередей символов
     * метод {@link ReconstructPhrase#getReconstructPhrase()} корректно восстанавливает
     * известную фразу: "Slogan of language Java: Write once, run everywhere".
     */
    @Test
    void whenSloganOfLanguageJava() {
        Deque<Character> evenElements = new LinkedList<>(
                Arrays.asList(
                        'S', '1', 'l', '3', 'o', 'h', 'g', 'h', 'a', 'm', 'n', 't',
                        ' ', 't', 'o', ' ', 'f', 'q', ' ', '6', 'l', '.', 'a', ',',
                        'n', 'w', 'g', 'd', 'u', 'a', 'a', 'u', 'g', 'd', 'e', 'q',
                        ' ', 'y', 'J', 'd', 'a', 'k', 'v', 'p', 'a', 'e', ':', 'b'
                )
        );
        Deque<Character> descendingElements = new LinkedList<>(
                Arrays.asList(
                        'e', 'r', 'e', 'h', 'w', 'y', 'r', 'e', 'v', 'e', ' ', 'n', 'u',
                        'r', ' ', ',', 'e', 'c', 'n', 'o', ' ', 'e', 't', 'i', 'r', 'W', ' '
                )
        );
        String expected = "Slogan of language Java: Write once, run everywhere";
        String result = new ReconstructPhrase(descendingElements, evenElements).getReconstructPhrase();
        assertThat(result).isEqualTo(expected);
    }
}
