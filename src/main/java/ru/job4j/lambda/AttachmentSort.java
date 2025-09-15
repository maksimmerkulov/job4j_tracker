package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Demonstrates sorting of {@link Attachment} objects using anonymous classes.
 *
 * <p>Example output:
 * <pre>{@code
 * [{name='image 3', size=13}, {name='image 2', size=34}, {name='image 1', size=100}]
 * [{name='image 1', size=100}, {name='image 2', size=34}, {name='image 3', size=13}]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class AttachmentSort {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13)
        );
        Comparator<Attachment> sizeComparator = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return Integer.compare(o1.getSize(), o2.getSize());
            }
        };
        attachments.sort(sizeComparator);
        System.out.println(attachments);
        Comparator<Attachment> nameComparator = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        attachments.sort(nameComparator);
        System.out.println(attachments);
    }
}
