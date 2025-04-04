package ru.job4j.oop;

/**
 * Класс {@code BallStory} описывает сюжет сказки "Колобок"
 * с использованием созданных объектов.
 * <p>
 * История включает персонажей:
 * <ul>
 *     <li>Колобок – главный герой, пытается убежать.</li>
 *     <li>Заяц – пытается съесть Колобка, но неудачно.</li>
 *     <li>Волк – также пытается съесть Колобка, но Колобок сбегает.</li>
 *     <li>Лиса – хитрая, ей удается съесть Колобка.</li>
 * </ul>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-03-31
 */
public class BallStory {

    /**
     * Метод {@code main(String[] args)} запускает историю.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        hare.tryEat(ball);
        wolf.tryEat(ball);
        fox.tryEat(ball);
    }
}
