package ru.job4j.pojo;

import java.time.LocalDate;

/**
 * Класс {@code Student} представляет студента учебного заведения.
 *
 * <p>Содержит поля: ФИО, группа и дата поступления.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Student student = new Student();
 * student.setFullName("Maksim Merkulov");
 * student.setGroup("ISiP-21");
 * student.setAdmissionDate(LocalDate.of(2021, 9, 1));
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-17
 */
public class Student {

    /**
     * Поле {@code fullName} содержит полное имя студента.
     */
    private String fullName;

    /**
     * Поле {@code group} содержит наименование группы студента.
     */
    private String group;

    /**
     * Поле {@code admissionDate} содержит дату поступления.
     */
    private LocalDate admissionDate;

    /**
     * Метод {@code getFullName()} возвращает полное имя студента.
     *
     * @return Значение поля {@code fullName}.
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Метод {@code setFullName(String fullName)} устанавливает полное имя студента.
     *
     * @param fullName Новое значение поля {@code fullName}.
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Метод {@code getGroup()} возвращает группу студента.
     *
     * @return Значение поля {@code group}.
     */
    public String getGroup() {
        return group;
    }

    /**
     * Метод {@code setGroup(String group)} устанавливает группу студента.
     *
     * @param group Новое значение поля {@code group}.
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Метод {@code getAdmissionDate()} возвращает дату поступления студента.
     *
     * @return Значение поля {@code admissionDate}.
     */
    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    /**
     * Метод {@code setAdmissionDate(LocalDate admissionDate)} устанавливает дату поступления.
     *
     * @param admissionDate Новое значение поля {@code admissionDate}.
     */
    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }
}
