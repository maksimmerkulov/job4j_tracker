package ru.job4j.io;

import java.util.Scanner;

/**
 * Класс {@code Greeting} представляет собой простую программу для приветствия пользователя.
 *
 * <p>Запрашивает имя пользователя через консоль и выводит персональное приветствие.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Greeting.main(new String[0]);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Добро пожаловать. Как Вас зовут? Максим
 * Максим, рад Вас видеть!
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Greeting {

    /**
     * Точка входа в программу.
     *
     * <p>Реализует диалог с пользователем: запрашивает имя и выводит приветствие.</p>
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