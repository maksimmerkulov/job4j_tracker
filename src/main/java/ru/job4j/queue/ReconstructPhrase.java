package ru.job4j.queue;

import java.util.Deque;

/**
 * Класс {@code ReconstructPhrase} используется для реконструкции фразы
 * из двух коллекций символов: {@code descendingElements} и {@code evenElements}.
 *
 * <p>Метод {@link #getReconstructPhrase()} возвращает строку, составленную из
 * четных элементов {@code evenElements} и символов из {@code descendingElements}
 * в обратном порядке.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Deque<Character> descending = new LinkedList<>();
 * descending.add('e');
 * descending.add('l');
 * descending.add('p');
 *
 * Deque<Character> even = new LinkedList<>();
 * even.add('H');
 * even.add('a');
 * even.add('l');
 * even.add('o');
 *
 * ReconstructPhrase phrase = new ReconstructPhrase(descending, even);
 * String result = phrase.getReconstructPhrase();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Hlpol
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class ReconstructPhrase {

    /**
     * Очередь символов, из которой берутся элементы
     * в обратном порядке для реконструкции фразы.
     */
    private final Deque<Character> descendingElements;

    /**
     * Очередь символов, из которой выбираются элементы
     * с четными индексами для реконструкции фразы.
     */
    private final Deque<Character> evenElements;

    /**
     * Конструктор инициализирует объект с двумя очередями символов.
     *
     * @param descendingElements очередь символов для обработки в обратном порядке
     * @param evenElements       очередь символов, из которой выбираются элементы с четными индексами
     */
    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    /**
     * Извлекает символы из очереди {@code evenElements}, беря только элементы с четными индексами,
     * при этом элементы удаляются из очереди.
     *
     * @return строка, состоящая из символов с четными индексами из {@code evenElements}
     */
    private String getEvenElements() {
        StringBuilder builder = new StringBuilder();
        int size = evenElements.size();
        for (int i = 0; i < size; i++) {
            Character character = evenElements.pollFirst();
            if (character != null && i % 2 == 0) {
                builder.append(character);
            }
        }
        return builder.toString();
    }

    /**
     * Извлекает символы из очереди {@code descendingElements} в обратном порядке,
     * при этом элементы удаляются из очереди.
     *
     * @return строка, состоящая из символов из {@code descendingElements} в обратном порядке
     */
    private String getDescendingElements() {
        StringBuilder builder = new StringBuilder();
        while (!descendingElements.isEmpty()) {
            builder.append(descendingElements.pollLast());
        }
        return builder.toString();
    }

    /**
     * Возвращает реконструированную фразу, которая получается конкатенацией
     * результатов методов {@link #getEvenElements()} и {@link #getDescendingElements()}.
     *
     * @return реконструированная строка из двух очередей символов
     */
    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
