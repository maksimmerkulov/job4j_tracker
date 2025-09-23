package ru.job4j.oop;

/**
 * Plays songs based on the selected position.
 *
 * <p>Example output:
 * <pre>{@code
 * Let them run clumsily
 * Good night
 * Song not found
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Jukebox {

    /**
     * Plays a song corresponding to the specified position.
     *
     * @param position the number of the song to play
     */
    public void music(int position) {
        switch (position) {
            case 1 -> System.out.println("Let them run clumsily");
            case 2 -> System.out.println("Good night");
            default -> System.out.println("Song not found");
        }
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Jukebox box = new Jukebox();
        box.music(1);
        box.music(2);
        box.music(3);
    }
}
