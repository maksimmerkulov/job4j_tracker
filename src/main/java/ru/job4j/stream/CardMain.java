package ru.job4j.stream;

import java.util.stream.Stream;

/**
 * Demonstrates card deck generation using Stream API.
 *
 * <p>Example output:
 * <pre>{@code
 * Card{suit=Diamonds, value=V_6}
 * Card{suit=Diamonds, value=V_7}
 * Card{suit=Diamonds, value=V_8}
 * ...
 * Card{suit=Clubs, value=V_8}
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class CardMain {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Stream.of(Suit.values())
                .flatMap(suit -> Stream.of(Value.values())
                        .map(value -> new Card(suit, value)))
                .forEach(System.out::println);
    }
}
