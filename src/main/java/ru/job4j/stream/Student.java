package ru.job4j.stream;

import java.util.Objects;

/**
 * Student model containing score and surname.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Student {

    /** The total score of the student. */
    private int score;

    /** The surname of the student. */
    private String surname;

    /**
     * Creates a new {@code Student} with the specified score and surname.
     *
     * @param score   the student score
     * @param surname the student surname
     */
    public Student(int score, String surname) {
        this.score = score;
        this.surname = surname;
    }

    /**
     * Returns the score of the student.
     *
     * @return the student score
     */
    public int getScore() {
        return score;
    }

    /**
     * Returns the surname of the student.
     *
     * @return the student surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Compares this student with the specified object for equality.
     *
     * @param o the object to compare
     * @return {@code true} if the objects are equal, {@code false} otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return score == student.score
                && Objects.equals(surname, student.surname);
    }

    /**
     * Returns the hash code value for this student.
     *
     * @return the hash code value
     */
    @Override
    public int hashCode() {
        return Objects.hash(score, surname);
    }
}
