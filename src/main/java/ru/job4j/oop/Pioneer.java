package ru.job4j.oop;

/**
 * A fairy tale character component that represents pioneer Petya who can come
 * to the rescue of Little Red Riding Hood {@link Girl}
 * and kill the {@link Wolf}.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Pioneer {

    /**
     * Kills the specified {@link Wolf} and prints the result.
     *
     * @param wolf the {@link Wolf} to be killed
     */
    public void kill(Wolf wolf) {
        System.out.println("Pioneer Petya killed the Wolf.");
    }
}
