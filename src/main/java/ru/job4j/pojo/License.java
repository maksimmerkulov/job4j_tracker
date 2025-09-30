package ru.job4j.pojo;

import java.time.LocalDate;
import java.util.Objects;

/**
 * A vehicle license data model.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class License {

    /**
     * The owner of the vehicle.
     */
    private String owner;

    /**
     * The model of the vehicle.
     */
    private String model;

    /**
     * The code of the vehicle.
     */
    private String code;

    /**
     * The creation date of the vehicle.
     */
    private LocalDate created;

    /**
     * Returns the owner of the vehicle.
     *
     * @return the owner value
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the owner of the vehicle.
     *
     * @param owner the owner name
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * Returns the model of the vehicle.
     *
     * @return the model value
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the model of the vehicle.
     *
     * @param model the vehicle model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Returns the code of the vehicle.
     *
     * @return the code value
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the code of the vehicle.
     *
     * @param code the vehicle code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Returns the creation date of the vehicle.
     *
     * @return the created date value
     */
    public LocalDate getCreated() {
        return created;
    }

    /**
     * Sets the creation date of the vehicle with the specified year, month, and
     * day.
     *
     * @param year       the manufacturing year
     * @param month      the manufacturing month
     * @param dayOfMonth the manufacturing day of month
     */
    public void setCreated(int year, int month, int dayOfMonth) {
        this.created = LocalDate.of(year, month, dayOfMonth);
    }

    /**
     * Tests if some other object is equal to this one.
     *
     * @param o the reference object
     * @return {@code true} if this object is equal, {@code false} otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
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
     * Returns a hash code value for the object.
     *
     * @return a hash code value
     */
    @Override
    public int hashCode() {
        return Objects.hash(owner, model, code, created);
    }
}
