package ru.job4j.search;

import java.util.ArrayList;

/**
 * Класс {@code PhoneDictionary} представляет телефонный справочник,
 * позволяющий добавлять пользователей и выполнять поиск по ключевому слову.
 *
 * <p>Поиск осуществляется по всем полям класса {@link Person}:
 * {@code name}, {@code surname}, {@code phone} и {@code address}
 * с помощью {@code String.contains()}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * PhoneDictionary dictionary = new PhoneDictionary();
 * dictionary.add(new Person("Петр", "Арсентьев", "53742", "Брянск"));
 * List<Person> result = dictionary.find("нск");
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Петр Арсентьев
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class PhoneDictionary {

    /**
     * Список пользователей.
     */
    private ArrayList<Person> persons = new ArrayList<>();

    /**
     * Добавляет пользователя в справочник.
     *
     * @param person пользователь
     */
    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Возвращает список всех пользователей, который содержат key в любых полях.
     *
     * @param key ключ поиска
     * @return список пользователей, которые прошли проверку
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person persona : persons) {
            if (persona.getName().contains(key)
                    || persona.getSurname().contains(key)
                    || persona.getPhone().contains(key)
                    || persona.getAddress().contains(key)) {
                result.add(persona);
            }
        }
        return result;
    }
}
