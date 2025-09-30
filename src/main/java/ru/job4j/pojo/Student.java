package ru.job4j.pojo;

import java.time.LocalDate;

/**
 * A student data model.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Student {

    /**
     * The full name of the student.
     */
    private String fullName;

    /**
     * The study group of the student.
     */
    private String group;

    /**
     * The admission date of the student.
     */
    private LocalDate admissionDate;

    /**
     * Returns the full name of the student.
     *
     * @return the full name value
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the full name of the student.
     *
     * @param fullName the full name
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Returns the study group.
     *
     * @return the group value
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets the study group.
     *
     * @param group the group identifier
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Returns the admission date.
     *
     * @return the admission date value
     */
    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    /**
     * Sets the admission date with the specified year, month, and day.
     *
     * @param year       the year of admission
     * @param month      the month of admission
     * @param dayOfMonth the day of month
     */
    public void setAdmissionDate(int year, int month, int dayOfMonth) {
        this.admissionDate = LocalDate.of(year, month, dayOfMonth);
    }
}
