package ru.job4j.pojo;

import java.util.Date;
import java.util.Objects;

/**
 * Класс {@code License} представляет собой модель данных техпаспорта (ПТС) автомобиля.
 *
 * <p>Содержит сведения о владельце, марке автомобиля, государственном номере и дате сборки машины.</p>
 *
 * <p><b>Поля:</b></p>
 * <ul>
 *   <li>{@code owner} – имя владельца автомобиля</li>
 *   <li>{@code model} – марка автомобиля</li>
 *   <li>{@code code} – государственный регистрационный номер</li>
 *   <li>{@code created} – дата сборки автомобиля</li>
 * </ul>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * License license = new License();
 * license.setOwner("Petr Arsentev");
 * license.setModel("Toyota");
 * license.setCode("xx111x");
 * license.setCreated(new Date());
 * 
 * System.out.println(
 * license.getOwner() + " has a car - "
 * + license.getModel() + " : "
 * + license.getCode());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Petr Arsentev has a car - Toyota : xx111x
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class License {

    /**
     * Имя владельца автомобиля.
     */
    private String owner;

    /**
     * Марка автомобиля.
     */
    private String model;

    /**
     * Государственный номер автомобиля.
     */
    private String code;

    /**
     * Дата сборки автомобиля.
     */
    private Date created;

    /**
     * Возвращает имя владельца.
     *
     * @return строка с именем владельца
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Устанавливает имя владельца.
     *
     * @param owner имя владельца
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * Возвращает марку автомобиля.
     *
     * @return строка с маркой автомобиля
     */
    public String getModel() {
        return model;
    }

    /**
     * Устанавливает марку автомобиля.
     *
     * @param model марка автомобиля
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Возвращает государственный номер автомобиля.
     *
     * @return строка с государственным номером автомобиля
     */
    public String getCode() {
        return code;
    }

    /**
     * Устанавливает государственный номер автомобиля.
     *
     * @param code государственный номер автомобиля
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Возвращает дату сборки автомобиля.
     *
     * @return объект {@link Date}, указывающий дату сборки автомобиля
     */
    public Date getCreated() {
        return created;
    }

    /**
     * Устанавливает дату сборки автомобиля.
     *
     * @param created дата сборки автомобиля
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * Сравнивает два объекта {@link License} по значениям полей:
     * {@code owner}, {@code model}, {@code code} и {@code created}.
     *
     * @param o объект для сравнения
     * @return {@code true}, если объекты равны;
     *         {@code false} — в противном случае
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
     * Возвращает хэш-код объекта, вычисленный на основе полей:
     * {@code owner}, {@code model}, {@code code}, {@code created}.
     *
     * @return хэш-код объекта
     */
    @Override
    public int hashCode() {
        return Objects.hash(owner, model, code, created);
    }
}
