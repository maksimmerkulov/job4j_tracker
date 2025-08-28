package ru.job4j.collection;

import java.util.Objects;

/**
 * Класс {@code Citizen} представляет собой модель гражданина с паспортом и именем.
 *
 * <p>Используется для хранения данных гражданина и проверки его уникальности
 * по номеру паспорта. Сравнение объектов и вычисление хэш-кода выполняется
 * только на основе поля {@code passport}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Citizen citizen1 = new Citizen("1234", "Ivan Ivanov");
 * Citizen citizen2 = new Citizen("1234", "Ivan Petrov");
 *
 * boolean isEqual = citizen1.equals(citizen2);
 * int hash = citizen1.hashCode();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * true
 * 46789021
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Citizen {

    /**
     * Паспорт гражданина.
     *
     * <p>Используется как уникальный идентификатор при сравнении объектов.</p>
     */
    private String passport;

    /**
     * Имя гражданина.
     *
     * <p>Может использоваться для отображения информации,
     * но не влияет на уникальность объекта.</p>
     */
    private String username;

    /**
     * Конструктор для инициализации гражданина.
     *
     * @param passport номер паспорта
     * @param username имя гражданина
     */
    public Citizen(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Возвращает номер паспорта.
     *
     * @return строка с номером паспорта
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Возвращает имя гражданина.
     *
     * @return строка с именем гражданина
     */
    public String getUsername() {
        return username;
    }

    /**
     * Сравнивает текущий объект с другим по номеру паспорта.
     *
     * @param o другой объект
     * @return {@code true}, если паспорта совпадают;
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
        Citizen citizen = (Citizen) o;
        return Objects.equals(passport, citizen.passport);
    }

    /**
     * Вычисляет хэш-код гражданина на основе паспорта.
     *
     * @return хэш-код, зависящий только от паспорта
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
