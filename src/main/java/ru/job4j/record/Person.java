package ru.job4j.record;

import java.util.Objects;

/**
 * Класс {@code Person} представляет сущность человека с именем и возрастом.
 * <p>
 * Используется для демонстрации базовых принципов инкапсуляции, переопределения методов
 * {@code equals()}, {@code hashCode()} и {@code toString()}.
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Person person = new Person("Ivan", 30);
 * System.out.println(person.getName());
 * System.out.println(person.getAge());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Ivan
 * 30
 * }</pre>
 *
 * @author Maksим Merkulov
 * @version 1.0
 * @since 2025-04-24
 */
public class Person {

    /**
     * Поле {@code name} содержит имя человека.
     * <p>
     * Это неизменяемое строковое значение, задается при создании объекта.
     */
    private final String name;

    /**
     * Поле {@code age} содержит возраст человека.
     * <p>
     * Это неизменяемое целочисленное значение, задается при создании объекта.
     */
    private final int age;

    /**
     * Конструктор {@code Person(String name, int age)} используется для создания
     * объекта {@link Person} с заданным именем и возрастом.
     *
     * @param name Имя человека.
     * @param age Возраст человека.
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Метод {@code getName()} возвращает имя человека.
     *
     * @return Имя человека.
     */
    public String getName() {
        return name;
    }

    /**
     * Метод {@code getAge()} возвращает возраст человека.
     *
     * @return Возраст человека.
     */
    public int getAge() {
        return age;
    }

    /**
     * Метод {@code equals(Object o)} сравнивает данный объект {@link Person} с другим на равенство.
     * <p>Объекты считаются равными, если у них совпадают имя и возраст.
     *
     * @param o Объект для сравнения.
     * @return {@code true}, если объекты равны; {@code false} в противном случае.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    /**
     * Метод {@code hashCode()} возвращает хеш-код объекта {@link Person}, основанный на имени и возрасте.
     *
     * @return Хеш-код.
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    /**
     * Метод {@code toString()} возвращает строковое представление объекта {@link Person}.
     *
     * @return Строка в формате {@code Person{name='Имя', age=Возраст}}.
     */
    @Override
    public String toString() {
        return "Person{"
                + "name='" + name + '\''
                + ", age=" + age
                + '}';
    }
}