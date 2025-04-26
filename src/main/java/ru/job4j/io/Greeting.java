package ru.job4j.io;

import java.util.Scanner;

/**
 * Класс {@code Greeting} представляет собой простую программу для приветствия пользователя.
 *
 * <p>Запрашивает имя пользователя через консоль и выводит персональное приветствие.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Greeting.main(new String[]{});
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Добро пожаловать. Как Вас зовут? Максим
 * Максим, рад Вас видеть!
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-04-26
 */
public class Greeting {

    /**
     * Реализует диалог с пользователем: запрашивает имя и выводит приветствие.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Добро пожаловать. Как Вас зовут? ");
        String name = input.nextLine();
        System.out.println(name + ", рад Вас видеть!");
    }
}