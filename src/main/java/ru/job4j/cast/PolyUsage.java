package ru.job4j.cast;

/**
 * Класс {@code PolyUsage} демонстрирует применение полиморфизма с интерфейсом {@link Animal}.
 *
 * <p>Используется для создания различных животных, приведенных к типу {@link Animal},
 * и вызова их метода {@code sound()} в цикле.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Animal cow = new Cow();
 * Animal goose = new Goose();
 * Animal dog = new Dog();
 * Animal guineaPig = new GuineaPig();
 * Animal[] animals = new Animal[] {cow, goose, dog, guineaPig};
 * for (Animal animal : animals) {
 *     animal.sound();
 * }
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Cow произносит звук: Му-му.
 * Goose произносит звук: Га-га
 * Dog произносит звук: Гав-гав.
 * GuineaPig громко пищит для привлечения внимания.
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class PolyUsage {

    /**
     * Точка входа в программу.
     *
     * <p>Создает массив животных и вызывает метод {@code sound()} для каждого объекта.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Animal cow = new Cow();
        Animal goose = new Goose();
        Animal dog = new Dog();
        Animal guineaPig = new GuineaPig();
        Animal[] animals = new Animal[] {cow, goose, dog, guineaPig};
        for (Animal object : animals) {
            object.sound();
        }
    }
}