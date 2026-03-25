package ru.job4j.stream;

/**
 * Card model representing a single playing card with a suit and a value.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Card {

    /** The suit of the card. */
    private final Suit suit;

    /** The value of the card. */
    private final Value value;

    /**
     * Creates a new {@code Card} with the specified suit and value.
     *
     * @param suit  the card suit
     * @param value the card value
     */
    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    /**
     * Returns a string representation of the card.
     *
     * @return the formatted string
     */
    @Override
    public String toString() {
        return "Card{"
                + "suit=" + suit
                + ", value=" + value
                + '}';
    }
}
