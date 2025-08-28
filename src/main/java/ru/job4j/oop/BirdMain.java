package ru.job4j.oop;

/**
 * Класс {@code BirdMain} демонстрирует создание и использование
 * анонимного класса на основе класса {@link Bird}.
 *
 * <p>Метод {@link Bird#fly()} переопределяется внутри анонимного класса.
 * Также добавляется собственный метод {@code flyInside()}, который доступен
 * только внутри анонимного класса.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Bird bird = new Bird() {
 *     @Override
 *     public void fly() {
 *         System.out.println("Попугай пролетает над лужайкой");
 *         flyInside();
 *     }
 *
 *     public void flyInside() {
 *         System.out.println("Попугай летает только внутри анонимного класса");
 *     }
 * };
 * bird.fly();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Попугай пролетает над лужайкой
 * Попугай летает только внутри анонимного класса
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class BirdMain {

    /**
     * Точка входа в программу.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Bird bird = new Bird() {
            @Override
            public void fly() {
                System.out.println("Попугай пролетает над лужайкой");
                flyInside();
            }

            public void flyInside() {
                System.out.println("Попугай летает только внутри анонимного класса");
            }
        };
        bird.fly();
    }
}
