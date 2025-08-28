package ru.job4j.oop;

/**
 * Класс {@code BallStory} описывает сюжет сказки "Колобок"
 * с использованием созданных объектов.
 *
 * <p>История включает персонажей:</p>
 * <ul>
 *     <li>Колобок – главный герой, пытается убежать.</li>
 *     <li>Заяц – пытается съесть Колобка, но Колобок сбегает.</li>
 *     <li>Волк – также пытается съесть Колобка, но Колобок сбегает.</li>
 *     <li>Лиса – хитрая, ей удается съесть Колобка.</li>
 * </ul>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Ball ball = new Ball();
 * Hare hare = new Hare();
 * Wolf wolf = new Wolf();
 * Fox fox = new Fox();
 * hare.tryEat(ball);
 * wolf.tryEat(ball);
 * fox.tryEat(ball);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Заяц попытался съесть Колобка...
 * Колобок сбежал!
 * Волк попытался съесть Колобка...
 * Колобок сбежал!
 * Лиса попыталась съесть Колобка...
 * Колобок съеден!
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class BallStory {

    /**
     * Запускает историю "Колобок".
     *
     * @param args аргументы командной строки (не используются)
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
