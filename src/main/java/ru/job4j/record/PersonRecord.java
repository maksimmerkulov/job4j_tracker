package ru.job4j.record;

/**
 * Класс {@code PersonRecord} представляет собой запись (record) человека с именем и возрастом.
 *
 * <p>Используется для хранения данных человека в неизменяемом виде.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * PersonRecord record = new PersonRecord("Иван", 30);
 * System.out.println(record.name());
 * System.out.println(record.age());
 * System.out.println(record);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Иван
 * 30
 * Person{name='Иван', age=30}
 * }</pre>
 *
 * @author Maksiм Merkulov
 * @version 1.1
 */
public record PersonRecord(String name, int age) {

    /**
     * Максимально допустимый возраст человека.
     */
    public static int maxAge = 100;

    /**
     * Компактный конструктор с валидацией возраста человека.
     *
     * <p>Выбрасывает исключение, если возраст человека превышает 101 год.</p>
     *
     * @param name имя человека
     * @param age  возраст человека
     * @throws IllegalArgumentException если возраст превышает 101 год
     */
    public PersonRecord {
        if (age > 101) {
            throw new IllegalArgumentException("Возраст должен быть менее 101");
        }
    }

    /**
     * Возвращает максимально допустимый возраст.
     *
     * @return максимально допустимый возраст человека {@code maxAge}
     */
    public static int getMaxAge() {
        return maxAge;
    }

    /**
     * Печатает техническую информацию (для отладки).
     */
    public void info() {
        System.out.println("Напечатать информацию");
    }

    /**
     * Возвращает строковое представление объекта {@link PersonRecord}.
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
