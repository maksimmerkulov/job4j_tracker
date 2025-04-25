package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

/**
 * Класс {@code MagicBall} представляет собой симуляцию "магического шара",
 * который отвечает на вопросы пользователя случайным образом.
 *
 * <p>Используется для имитации ответов на любые вопросы — с тремя вариантами:
 * "Да", "Нет", "Может быть".</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * MagicBall.main(new String[]{});
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Я великий Оракул. Что ты хочешь узнать? Получу ли я оффер в этом году?
 * Может быть
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-25
 */
public class MagicBall {

    /**
     * Метод {@code main(String[] args)} реализует ввод вопроса
     * от пользователя и вывод случайного ответа.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        input.nextLine();
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.println("Да");
        } else if (answer == 1) {
            System.out.println("Нет");
        } else {
            System.out.println("Может быть");
        }
    }
}