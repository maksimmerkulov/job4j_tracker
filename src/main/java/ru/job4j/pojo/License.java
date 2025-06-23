package ru.job4j.pojo;

import java.util.Date;

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
 * @version 1.0
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
     * @return Строка с именем владельца.
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Устанавливает имя владельца.
     *
     * @param owner Имя владельца.
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * Возвращает марку автомобиля.
     *
     * @return Строка с маркой автомобиля.
     */
    public String getModel() {
        return model;
    }

    /**
     * Устанавливает марку автомобиля.
     *
     * @param model Марка автомобиля.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Возвращает государственный номер автомобиля.
     *
     * @return Строка с государственным номером автомобиля.
     */
    public String getCode() {
        return code;
    }

    /**
     * Устанавливает государственный номер автомобиля.
     *
     * @param code Государственный номер автомобиля.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Возвращает дату сборки автомобиля.
     *
     * @return Объект {@link Date}, указывающий дату сборки автомобиля.
     */
    public Date getCreated() {
        return created;
    }

    /**
     * Устанавливает дату сборки автомобиля.
     *
     * @param created Дата сборки автомобиля.
     */
    public void setCreated(Date created) {
        this.created = created;
    }
}