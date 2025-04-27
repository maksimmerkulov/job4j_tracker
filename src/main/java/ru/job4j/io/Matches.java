package ru.job4j.io;

import java.util.Scanner;

/**
 * Класс {@code Matches} представляет собой игру "11", где два игрока по очереди забирают от 1 до 3 спичек.
 * Игра заканчивается, когда все спички забраны. Игрок, который забрал последнюю спичку, выигрывает.
 *
 * <p>Используется для моделирования игры на основе чисел, с валидацией ввода и проверкой условий победы.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Matches game = new Matches();
 * game.startGame();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Игра 11.
 * Первый игрок введите число от 1 до 3:
 * Осталось спичек: 9
 * Второй игрок введите число от 1 до 3:
 * Осталось спичек: 7
 * Выиграл первый игрок
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 * @since 2025-04-27
 */
public class Matches {

    /**
     * Запускает игру "11", в которой два игрока поочередно забирают спички.
     *
     * <p>Игра продолжается до тех пор, пока на столе не останется спичек.
     * Каждый игрок может забрать от 1 до 3 спичек, но не больше оставшихся на столе.
     * В конце игры объявляется победитель, забравший последнюю спичку.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            if (matches > 0 && matches < 4) {
                if (matches <= count) {
                    count -= matches;
                    System.out.println("Осталось спичек: " + count);
                    turn = !turn;
                } else {
                    System.out.println("Число игрока превышает количество оставшихся спичек!");
                }
            } else {
                System.out.println("Число должно быть в пределах от 1 до 3 (включительно)!");
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}