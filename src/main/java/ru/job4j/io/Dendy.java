package ru.job4j.io;

import java.util.Scanner;

/**
 * Класс {@code Dendy} представляет собой консольное меню выбора игры
 * с возможностью запустить "Танчики", "Супер Марио" или выйти из программы.
 *
 * <p>Используется для имитации игрового меню приставки Dendy.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Dendy.main(new String[0]);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Игры.
 * 1. Танчики
 * 2. Супер Марио
 * 3. Выйти
 * Введите пункт меню, чтобы начать игру: 1
 * Танчики загружаются ...
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Dendy {

    /**
     * Точка входа в программу.
     *
     * <p>Реализует простой игровой цикл с выбором одной из двух игр или завершением программы.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Игры.");
            System.out.println("1. Танчики");
            System.out.println("2. Супер Марио");
            System.out.println("3. Выйти");
            System.out.print("Введите пункт меню, чтобы начать игру: ");
            int select = Integer.parseInt(input.nextLine());
            if (select == 3) {
                System.out.println("Игра завершена.");
                run = false;
            } else if (select == 1) {
                System.out.println("Танчики загружаются ... ");
            } else if (select == 2) {
                System.out.println("Супер Марио загружается ... ");
            } else {
                System.out.println("Такой игры нет.");
            }
            System.out.println();
        }
    }
}