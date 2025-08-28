package ru.job4j.pojo;

import java.time.LocalDate;

/**
 * Класс {@code Student} представляет собой модель данных студента.
 *
 * <p>Содержит поля: ФИО, группа и дата поступления.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Student student = new Student();
 * student.setFullName("Ivanov Ivan Ivanovich");
 * student.setGroup("A-01");
 * student.setAdmissionDate(LocalDate.of(2025, 4, 17));
 * LocalDate admissionDate = student.getAdmissionDate();
 * DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
 * String admissionDateFormat = admissionDate.format(formatter);
 *
 * System.out.println(
 * student.getFullName()
 * + ", group: " + student.getGroup()
 * + ", admission date: " + admissionDateFormat);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Ivanov Ivan Ivanovich, group: A-01, admission date: 17-04-2025
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Student {
    
    /**
     * Полное имя студента (ФИО).
     */
    private String fullName;

    /**
     * Название группы, в которой учится студент.
     */
    private String group;

    /**
     * Дата поступления студента.
     */
    private LocalDate admissionDate;

    /**
     * Возвращает полное имя студента.
     *
     * @return строка с ФИО студента
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Устанавливает полное имя студента.
     *
     * @param fullName ФИО студента
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Возвращает название группы студента.
     *
     * @return строка с названием группы студента
     */
    public String getGroup() {
        return group;
    }

    /**
     * Устанавливает название группы студента.
     *
     * @param group название группы студента
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Возвращает дату поступления студента.
     *
     * @return объект {@link LocalDate}, представляющий дату поступления студента
     */
    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    /**
     * Устанавливает дату поступления студента.
     *
     * @param admissionDate объект {@link LocalDate} — дата поступления студента
     */
    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }
}
