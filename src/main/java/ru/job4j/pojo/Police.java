package ru.job4j.pojo;

/**
 * Demonstrates vehicle license management by simulating a police check.
 *
 * <p>Example output:
 * <pre>{@code
 * Petr Arsentev has a car - Toyota : xx111x from 2020-08-30
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Police {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        License license = new License();
        license.setOwner("Petr Arsentev");
        license.setModel("Toyota");
        license.setCode("xx111x");
        license.setCreated(2020, 8, 30);
        System.out.println(license.getOwner() + " has a car - "
                + license.getModel() + " : "
                + license.getCode() + " from "
                + license.getCreated());
    }
}
