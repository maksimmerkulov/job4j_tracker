package ru.job4j.search;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code PhoneDictionaryTest} содержит модульные тесты для класса {@link PhoneDictionary}.
 *
 * <p>Проверяется работа метода {@link PhoneDictionary#find(String)} по имени пользователя
 * и поведение при отсутствии совпадений.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class PhoneDictionaryTest {

    /**
     * Проверяет, что поиск по имени возвращает правильного пользователя.
     */
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname()).isEqualTo("Arsentev");
    }

    /**
     * Проверяет, что поиск по несуществующему ключу возвращает пустой список.
     */
    @Test
    void whenNothingFound() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Moscow");
        assertThat(persons).isEmpty();
    }
}
