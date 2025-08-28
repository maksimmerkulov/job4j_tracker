package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

/**
 * Класс {@code MagicBall} представляет собой симуляцию "магического шара",
 * который отвечает на вопросы пользователя случайным образом.
 *
 * <p>Используется для имитации ответов на любые вопросы — с тремя вариантами:
 * "Да", "Нет", "Может быть".</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * MagicBall.main(new String[0]);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Я великий Оракул. Что ты хочешь узнать? Получу ли я оффер в этом году?
 * Может быть
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class MagicBall {

    /**
     * Точка входа в программу.
     *
     * <p>Реализует ввод вопроса от пользователя и вывод случайного ответа.</p>
     *
     * @param args аргументы командной строки (не используются)
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
