package ru.job4j.lambda;

import java.util.Comparator;

/**
 * Comparator for {@link Attachment} objects based on their size.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class AttachmentComp implements Comparator {

    /**
     * Compares two objects by casting them to {@link Attachment}.
     *
     * @param o1 the first object
     * @param o2 the second object
     * @return a negative integer, zero, or a positive integer as this object
     *         is less than, equal to, or greater than the specified object
     */
    @Override
    public int compare(Object o1, Object o2) {
        Attachment left = (Attachment) o1;
        Attachment right = (Attachment) o2;
        return Integer.compare(left.getSize(), right.getSize());
    }
}
