package ru.job4j.function;

import java.util.Objects;

/**
 * Model of a folder with a name and size.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Folder {

    /** The name of the folder. */
    private String name;

    /** The size of the folder. */
    private int size;

    /**
     * Creates a new {@code Folder} with the specified name and size.
     *
     * @param name the name of the folder
     * @param size the size of the folder
     */
    public Folder(String name, int size) {
        this.name = name;
        this.size = size;
    }

    /**
     * Returns the name of the folder.
     *
     * @return the folder name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the size of the folder.
     *
     * @return the folder size
     */
    public int getSize() {
        return size;
    }

    /**
     * Compares this {@code Folder} with the specified object.
     *
     * @param o the object to compare
     * @return {@code true} if the objects are equal,
     *         otherwise {@code false}
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Folder folder = (Folder) o;
        return size == folder.size && Objects.equals(name, folder.name);
    }

    /**
     * Returns the hash code of the folder.
     *
     * @return the hash code value
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }

    /**
     * Returns a string representation of the folder.
     *
     * @return the formatted string
     */
    @Override
    public String toString() {
        return "Folder{"
                + "name='" + name + '\''
                + ", size=" + size
                + '}';
    }
}
