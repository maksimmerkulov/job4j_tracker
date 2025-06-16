package ru.job4j.oop;

/**
 * Класс {@code DummyDic} предоставляет метод для перевода английских слов на русский язык.
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * DummyDic dummyDic = new DummyDic();
 * String translatedWord = dummyDic.engToRus("Example");
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Неизвестное слово. Example
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class DummyDic {

    /**
     * Принимает английское слово и возвращает строку
     * с сообщением "Неизвестное слово. " + переданное слово.
     *
     * @param eng Английское слово.
     * @return Сообщение с переданным словом.
     */
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    /**
     * Демонстрирует использование метода {@link #engToRus(String)}.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        DummyDic dummyDic = new DummyDic();
        String translatedWord = dummyDic.engToRus("Example");
        System.out.println(translatedWord);
    }
}