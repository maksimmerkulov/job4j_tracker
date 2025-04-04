package ru.job4j.oop;

/**
 * Класс {@code DummyDic} предоставляет метод для перевода английских слов на русский язык.
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-04-03
 */
public class DummyDic {

    /**
     * Метод {@code engToRus(String eng)} принимает английское слово и возвращает строку
     * с сообщением "Неизвестное слово. " и переданным словом.
     *
     * @param eng Английское слово.
     * @return Сообщение с переданным словом.
     */
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    /**
     * Метод {@code main(String[] args)} демонстрирует использование метода {@link #engToRus(String)}.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        DummyDic dummyDic = new DummyDic();
        String translatedWord = dummyDic.engToRus("example");
    }
}
