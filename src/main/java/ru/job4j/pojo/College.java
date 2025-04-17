package ru.job4j.pojo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Класс {@code College} демонстрирует создание и использование объекта {@link Student}.
 *
 * <p>В методе {@link #main(String[])} создается студент, инициализируются его поля и выводятся в консоль.</p>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>
 * Maksim Merkulov, group: ISiP-21, admission date: 01-09-2021
 * </pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-17
 */
public class College {

    /**
     * Метод {@code main(String[] args)} является точкой входа в программу.
     *
     * <p>Создает и инициализирует объект {@link Student}, затем выводит его данные в консоль.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Maksim Merkulov");
        student.setGroup("ISiP-21");
        student.setAdmissionDate(LocalDate.of(2021, 9, 1));
        LocalDate admissionDate = student.getAdmissionDate();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String admissionDateFormat = admissionDate.format(formatter);
        System.out.println(student.getFullName()
                + ", group: " + student.getGroup()
                + ", admission date: " + admissionDateFormat);
    }
}
