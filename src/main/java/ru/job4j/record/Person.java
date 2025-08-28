package ru.job4j.record;

import java.util.Objects;

/**
 * Класс {@code Person} представляет сущность человека с именем и возрастом.
 *
 * <p>Используется для демонстрации базовых принципов инкапсуляции, переопределения методов
 * {@code equals()}, {@code hashCode()} и {@code toString()}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Person person = new Person("Ivan", 30);
 * System.out.println(person.getName());
 * System.out.println(person.getAge());
 * System.out.println(person);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Ivan
 * 30
 * Person{name='Иван', age=30}
 * }</pre>
 *
 * @author Maksiм Merkulov
 * @version 1.1
 */
public class Person {

    /**
     * Имя человека.
     */
    private final String name;

    /**
     * Возраст человека.
     */
    private final int age;

    /**
     * Создает объект {@link Person} с заданным именем и возрастом.
     *
     * @param name имя человека
     * @param age возраст человека
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Возвращает имя человека.
     *
     * @return имя человека
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает возраст человека.
     *
     * @return возраст человека
     */
    public int getAge() {
        return age;
    }

    /**
     * Сравнивает данный объект {@link Person} с другим на равенство.
     *
     * <p>Объекты считаются равными, если у них совпадают имя и возраст.</p>
     *
     * @param o объект для сравнения
     * @return {@code true}, если объекты равны;
     *         {@code false} в противном случае
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
     * Возвращает хеш-код объекта {@link Person}, основанный на имени и возрасте.
     *
     * @return хеш-код
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    /**
     * Возвращает строковое представление объекта {@link Person}.
     *
     * @return строка в формате {@code Person{name='Имя', age=Возраст}}
     */
    @Override
    public String toString() {
        return "Person{"
                + "name='" + name + '\''
                + ", age=" + age
                + '}';
    }
}
