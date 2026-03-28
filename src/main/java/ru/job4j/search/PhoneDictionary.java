package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * Provides a phone dictionary for storing and searching {@link Person} objects.
 *
 * @author Maksim Merkulov
 * @version 1.3
 */
public class PhoneDictionary {

    /** The list of persons in the dictionary. */
    private ArrayList<Person> persons = new ArrayList<>();

    /**
     * Adds a person to the dictionary.
     *
     * @param person the person to add
     */
    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Returns a list of all persons matching the specified search key.
     *
     * @param key the search key
     * @return a list of persons matching the search criteria
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> combineName = p -> p.getName().contains(key);
        Predicate<Person> combineSurname = p -> p.getSurname().contains(key);
        Predicate<Person> combinePhone = p -> p.getPhone().contains(key);
        Predicate<Person> combineAddress = p -> p.getAddress().contains(key);
        var combine = combineName
                .or(combineSurname)
                .or(combinePhone)
                .or(combineAddress);
        var result = new ArrayList<Person>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
