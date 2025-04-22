package ru.job4j.pojo;

import java.util.Date;
import java.util.Objects;

/**
 * Класс {@code License} представляет данные лицензии транспортного средства.
 *
 * <p>Содержит информацию о владельце, марке машины, номере машины и дате сборки.</p>
 *
 * <p><b>Поля:</b></p>
 * <ul>
 *     <li>{@code String owner} — владелец</li>
 *     <li>{@code String model} — марка машины</li>
 *     <li>{@code String code} — номер машины</li>
 *     <li>{@code Date created} — дата сборки</li>
 * </ul>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 *     License license = new License();
 *     license.setOwner("Petr Arsentev");
 *     license.setModel("Toyota");
 *     license.setCode("xx111x");
 *     license.setCreated(new Date());
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 * @since 2025-04-22
 */
public class License {

    /**
     * Поле {@code owner} содержит имя владельца транспортного средства.
     */
    private String owner;

    /**
     * Поле {@code model} содержит марку машины.
     */
    private String model;

    /**
     * Поле {@code code} содержит номер машины.
     */
    private String code;

    /**
     * Поле {@code created} содержит дату сборки машины.
     */
    private Date created;

    /**
     * Метод {@code equals(Object o)} сравнивает два объекта {@link License}
     * по значениям полей {@code owner}, {@code model}, {@code code} и {@code created}.
     *
     * @param o Объект для сравнения.
     * @return {@code true}, если объекты равны; {@code false} — в противном случае
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        License license = (License) o;
        return Objects.equals(owner, license.owner)
                && Objects.equals(model, license.model)
                && Objects.equals(code, license.code)
                && Objects.equals(created, license.created);
    }

    /**
     * Метод {@code hashCode()} возвращает хэш-код объекта,
     * вычисленный на основе полей {@code owner}, {@code model}, {@code code}, {@code created}.
     *
     * @return Хэш-код объекта.
     */
    @Override
    public int hashCode() {
        return Objects.hash(owner, model, code, created);
    }

    /**
     * Метод {@code getOwner()} возвращает имя владельца транспортного средства.
     *
     * @return Имя владельца.
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Метод {@code setOwner(String owner)} устанавливает имя владельца транспортного средства.
     *
     * @param owner Имя владельца.
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * Метод {@code getModel()} возвращает марку машины.
     *
     * @return Марка машины.
     */
    public String getModel() {
        return model;
    }

    /**
     * Метод {@code setModel(String model)} устанавливает марку машины.
     *
     * @param model Марка машины.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Метод {@code getCode()} возвращает номер машины.
     *
     * @return Номер машины.
     */
    public String getCode() {
        return code;
    }

    /**
     * Метод {@code setCode(String code)} устанавливает номер машины.
     *
     * @param code Номер машины.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Метод {@code getCreated()} возвращает дату сборки машины.
     *
     * @return Дата сборки.
     */
    public Date getCreated() {
        return created;
    }

    /**
     * Метод {@code setCreated(Date created)} устанавливает дату сборки машины.
     *
     * @param created Дата сборки.
     */
    public void setCreated(Date created) {
        this.created = created;
    }
}