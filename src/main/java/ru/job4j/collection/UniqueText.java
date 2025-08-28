package ru.job4j.collection;

import java.util.HashSet;

/**
 * Класс {@code UniqueText} предоставляет метод для проверки,
 * содержатся ли все слова из одной строки в другой.
 *
 * <p>Метод {@link #isEquals(String, String)} сравнивает два текста,
 * разбивая их на слова и проверяя, что каждое слово из второго текста
 * содержится в первом.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * UniqueText uniqueText = new UniqueText();
 * boolean result = uniqueText.isEquals(
 *     "one two three",
 *     "two three"
 * );
 * System.out.println(result);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * true
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class UniqueText {

    /**
     * Проверяет, содержатся ли все слова из строки {@code duplicateText}
     * в строке {@code originText}.
     *
     * <p>Строки разбиваются на слова по пробелам.
     * Все слова из {@code originText} добавляются во множество.
     * Затем каждое слово из {@code duplicateText} проверяется
     * на наличие в этом множестве. Если хотя бы одно слово отсутствует,
     * возвращается {@code false}, иначе {@code true}.</p>
     *
     * @param originText исходный текст, содержащий набор слов
     * @param duplicateText проверяемый текст на наличие слов в {@code originText}
     * @return {@code true}, если все слова из {@code duplicateText} содержатся в {@code originText},
     * иначе {@code false}
     */
    public boolean isEquals(String originText, String duplicateText) {
        boolean result = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String word : origin) {
            check.add(word);
        }
        for (String word : text) {
            if (!check.contains(word)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
