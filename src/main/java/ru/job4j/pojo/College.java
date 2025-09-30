package ru.job4j.pojo;

/**
 * A main runner class managing {@link Student} records and displaying admission
 * information.
 *
 * <p>Example output:
 * <pre>{@code
 * Student: Maksim Merkulov; Group: Job4j-2025; Admitted: 2025-09-01
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class College {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Maksim Merkulov");
        student.setGroup("Job4j-2025");
        student.setAdmissionDate(2025, 9, 1);
        System.out.println("Student: " + student.getFullName()
                + "; Group: " + student.getGroup()
                + "; Admitted: " + student.getAdmissionDate());
    }
}
