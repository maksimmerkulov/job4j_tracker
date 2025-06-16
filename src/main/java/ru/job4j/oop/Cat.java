package ru.job4j.oop;

/**
 * Класс {@code Cat} представляет собой простой пример модели кота.
 *
 * <p>Класс имеет метод {@link #sound()}, позволяющий воспроизводить звук кота.</p>
 *
 * <p>В методе {@link #main(String[])} создаются два объекта класса {@code Cat} —
 * {@code peppy} и {@code sparky} — и вызывается метод {@link #sound()} для одного из них.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Cat peppy = new Cat();
 * String say = peppy.sound();
 * System.out.println("Peppy says " + say);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Peppy says may-may
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Cat {

    /**
     * Возвращает звук, издаваемый котом.
     *
     * @return Строка со звуком кота.
     */
    public String sound() {
        String voice = "may-may";
        return voice;
    }

    /**
     * Создает два объекта класса {@code Cat} и вызывает
     * метод {@link #sound()} для одного из них.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Cat peppy = new Cat();
        Cat sparky = new Cat();
        String say = peppy.sound();
        System.out.println("Peppy says " + say);
    }
}