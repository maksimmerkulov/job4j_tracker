package ru.job4j.oop;

/**
 * Класс {@code Jukebox} моделирует музыкальный автомат,
 * который воспроизводит песни на основе заданной позиции.
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-04-03
 */
public class Jukebox {

    /**
     * Метод {@code music(int position)} воспроизводит песню в зависимости от переданной позиции.
     *
     * @param position Номер песни для воспроизведения:
     *                 1 — "Пусть бегут неуклюже",
     *                 2 — "Спокойной ночи".
     *                 Для всех остальных значений выводится "Песня не найдена".
     */
    public void music(int position) {
        switch (position) {
            case 1 -> System.out.println("Пусть бегут неуклюже");
            case 2 -> System.out.println("Спокойной ночи");
            default -> System.out.println("Песня не найдена");
        }
    }

    /**
     * Метод {@code main(String[] args)} демонстрирует работу класса {@link Jukebox}
     * путем воспроизведения песен с различными позициями.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        jukebox.music(1);
        jukebox.music(2);
        jukebox.music(3);
    }
}