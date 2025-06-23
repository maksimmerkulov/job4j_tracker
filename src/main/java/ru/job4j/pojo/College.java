package ru.job4j.pojo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Класс {@code College} демонстрирует создание и использование модели {@link Student}.
 *
 * <p>Создает объект студента, задает его данные и выводит их в консоль через геттеры.</p>
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
 * @version 1.0
 */
public class College {

    /**
     * Точка входа в программу.
     *
     * <p>Создает и инициализирует объект {@link Student},
     * затем выводит его данные в консоль.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivanov Ivan Ivanovich");
        student.setGroup("A-01");
        student.setAdmissionDate(LocalDate.of(2025, 4, 17));
        LocalDate admissionDate = student.getAdmissionDate();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String admissionDateFormat = admissionDate.format(formatter);
        System.out.println(
                student.getFullName()
                        + ", group: " + student.getGroup()
                        + ", admission date: " + admissionDateFormat);
    }
}