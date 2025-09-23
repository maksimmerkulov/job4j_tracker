package ru.job4j.oop;

/**
 * Translates English words into Russian.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class DummyDic {

    /**
     * Returns the translation for the specified English word.
     *
     * @param eng the English word to translate
     * @return the translation message
     */
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }
}
