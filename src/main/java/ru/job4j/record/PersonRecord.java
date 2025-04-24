package ru.job4j.record;

/**
 * Класс {@code PersonRecord} представляет собой запись (record) человека с именем и возрастом.
 * <p>
 * Используется для хранения данных человека в неизменяемом виде.
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * PersonRecord record = new PersonRecord("Иван", 30);
 * System.out.println(record.name());
 * System.out.println(record.age());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Иван
 * 30
 * }</pre>
 *
 * @author Maksим Merkulov
 * @version 1.0
 * @since 2025-04-24
 */
public record PersonRecord(String name, int age) {

    /**
     * Метод {@code toString()} возвращает строковое представление объекта {@link PersonRecord}.
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