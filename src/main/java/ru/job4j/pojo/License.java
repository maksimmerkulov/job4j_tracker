package ru.job4j.pojo;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Represents a vehicle license data model.
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
     * The registration code of the vehicle.
     */
    private String code;

    /**
     * The manufacturing date of the vehicle.
     */
    private LocalDate created;

    /**
     * Returns the owner of the vehicle.
     *
     * @return the owner
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
     * @return the model
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
     * Returns the registration code.
     *
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the registration code.
     *
     * @param code the vehicle code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Returns the manufacturing date.
     *
     * @return the created date
     */
    public LocalDate getCreated() {
        return created;
    }

    /**
     * Sets the manufacturing date with the specified year, month, and day.
     *
     * @param year       the manufacturing year
     * @param month      the manufacturing month
     * @param dayOfMonth the manufacturing day of month
     */
    public void setCreated(int year, int month, int dayOfMonth) {
        this.created = LocalDate.of(year, month, dayOfMonth);
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param o the reference object with which to compare
     * @return {@code true} if this object is the same as the obj argument
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
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {
        return Objects.hash(owner, model, code, created);
    }
}
