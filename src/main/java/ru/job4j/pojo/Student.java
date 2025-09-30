package ru.job4j.pojo;

import java.time.LocalDate;

/**
 * Represents a student entity.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Student {

    /**
     * Full name of the student.
     */
    private String fullName;

    /**
     * Study group identifier.
     */
    private String group;

    /**
     * Date of admission to the college.
     */
    private LocalDate admissionDate;

    /**
     * Returns the student's full name.
     *
     * @return the full name
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the student's full name.
     *
     * @param fullName the new full name
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Returns the study group.
     *
     * @return the group
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets the study group.
     *
     * @param group the new group
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Returns the admission date.
     *
     * @return the admission date
     */
    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    /**
     * Sets the admission date with the specified year, month, and day.
     *
     * @param year       the year of admission
     * @param month      the month of admission
     * @param dayOfMonth the day of month of admission
     */
    public void setAdmissionDate(int year, int month, int dayOfMonth) {
        this.admissionDate = LocalDate.of(year, month, dayOfMonth);
    }
}
