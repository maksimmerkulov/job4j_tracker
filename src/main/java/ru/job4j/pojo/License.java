package ru.job4j.pojo;

import java.util.Date;

/**
 * Класс {@code License} представляет данные лицензии транспортного средства.
 *
 * <p>Содержит информацию о владельце, модели, коде лицензии и дате создания.</p>
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
 * @version 1.0
 * @since 2025-04-17
 */
public class License {

    /**
     * Поле {@code owner} содержит имя владельца лицензии.
     */
    private String owner;

    /**
     * Поле {@code model} содержит модель транспортного средства.
     */
    private String model;

    /**
     * Поле {@code code} содержит идентификационный код лицензии.
     */
    private String code;

    /**
     * Поле {@code created} содержит дату выдачи лицензии.
     */
    private Date created;

    /**
     * Метод {@code getOwner()} возвращает имя владельца лицензии.
     *
     * @return Значение поля {@code owner}.
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Метод {@code setOwner(String owner)} устанавливает имя владельца лицензии.
     *
     * @param owner Новое значение поля {@code owner}.
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * Метод {@code getModel()} возвращает модель транспортного средства.
     *
     * @return Значение поля {@code model}.
     */
    public String getModel() {
        return model;
    }

    /**
     * Метод {@code setModel(String model)} устанавливает модель транспортного средства.
     *
     * @param model Новое значение поля {@code model}.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Метод {@code getCode()} возвращает код лицензии.
     *
     * @return Значение поля {@code code}.
     */
    public String getCode() {
        return code;
    }

    /**
     * Метод {@code setCode(String code)} устанавливает код лицензии.
     *
     * @param code Новое значение поля {@code code}.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Метод {@code getCreated()} возвращает дату выдачи лицензии.
     *
     * @return Значение поля {@code created}.
     */
    public Date getCreated() {
        return created;
    }

    /**
     * Метод {@code setCreated(Date created)} устанавливает дату выдачи лицензии.
     *
     * @param created Новое значение поля {@code created}.
     */
    public void setCreated(Date created) {
        this.created = created;
    }
}