package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Provides utility methods for filtering {@link Folder} objects.
 *
 * <p>Example output:
 * <pre>{@code
 * Folders larger than 100: [Folder{name='bug_report', size=120},
 *                          Folder{name='images', size=200}]
 * Folders with 'bug' name: [Folder{name='bug_report', size=120}]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class SearchFolder {

    /**
     * Filters a list of folders based on the specified predicate.
     *
     * @param list the list of folders to check
     * @param predicate the condition to check
     * @return a new list containing folders that match the predicate
     */
    public static List<Folder> filter(
            List<Folder> list,
            Predicate<Folder> predicate
    ) {
        List<Folder> result = new ArrayList<>();
        for (Folder folder : list) {
            if (predicate.test(folder)) {
                result.add(folder);
            }
        }
        return result;
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        List<Folder> folders = List.of(
                new Folder("bug_report", 120),
                new Folder("docs", 80),
                new Folder("images", 200)
        );

        List<Folder> largeFolders = SearchFolder.filter(
                folders,
                folder -> folder.getSize() > 100
        );
        System.out.println("Folders larger than 100: " + largeFolders);

        List<Folder> bugFolders = SearchFolder.filter(
                folders,
                folder -> folder.getName().contains("bug")
        );
        System.out.println("Folders with 'bug' name: " + bugFolders);
    }
}
