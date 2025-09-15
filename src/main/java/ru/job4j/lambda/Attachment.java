package ru.job4j.lambda;

/**
 * Model of an attachment with a name and size.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Attachment {

    /** The name of the attachment. */
    private String name;

    /** The size of the attachment. */
    private int size;

    /**
     * Creates a new {@code Attachment} with the specified name and size.
     *
     * @param name the name of the file
     * @param size the size of the file
     */
    public Attachment(String name, int size) {
        this.name = name;
        this.size = size;
    }

    /**
     * Returns the name of the file.
     *
     * @return the file name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the size of the file.
     *
     * @return the file size
     */
    public int getSize() {
        return size;
    }

    /**
     * Returns a string representation of the attachment.
     *
     * @return the formatted string
     */
    @Override
    public String toString() {
        return "{"
                + "name='" + name + '\''
                + ", size=" + size
                + '}';
    }
}
