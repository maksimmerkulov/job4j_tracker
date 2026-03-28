package ru.job4j.search;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link PhoneDictionary} class.
 *
 * @author Maksim Merkulov
 * @version 1.3
 */
class PhoneDictionaryTest {

    /** Verifies searching for a person by name. */
    @Test
    void whenFindByName() {
        var phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        var persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname()).isEqualTo("Arsentev");
    }
}
