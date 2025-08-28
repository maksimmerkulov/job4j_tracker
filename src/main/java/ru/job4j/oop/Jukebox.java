package ru.job4j.oop;

/**
 * Класс {@code Jukebox} моделирует музыкальный автомат,
 * который воспроизводит песни на основе заданной позиции.
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Jukebox jukebox = new Jukebox();
 * jukebox.music(1);
 * jukebox.music(2);
 * jukebox.music(3);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Пусть бегут неуклюже
 * Спокойной ночи
 * Песня не найдена
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Jukebox {

    /**
     * Воспроизводит песню в зависимости от переданной позиции.
     *
     * @param position номер песни для воспроизведения:
     *                 1 — "Пусть бегут неуклюже";
     *                 2 — "Спокойной ночи";
     *                 для всех остальных значений выводится "Песня не найдена"
     */
    public void music(int position) {
        switch (position) {
            case 1 -> System.out.println("Пусть бегут неуклюже");
            case 2 -> System.out.println("Спокойной ночи");
            default -> System.out.println("Песня не найдена");
        }
    }

    /**
     * Демонстрирует работу класса {@link Jukebox}
     * путем воспроизведения песен с различными позициями.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        jukebox.music(1);
        jukebox.music(2);
        jukebox.music(3);
    }
}
