package ru.job4j.inheritance;

/**
 * Класс {@code HideExampleMain} демонстрирует поведение переопределения и сокрытия методов
 * при использовании полиморфизма и статических методов в Java.
 *
 * <p>В примере:</p>
 * <ul>
 *     <li>{@link Animal#instanceInvoke()} переопределяется в {@link Cat}</li>
 *     <li>{@link Animal#staticInvoke()} скрывается в {@link Cat}</li>
 *     <li>Статические методы вызываются через тип ссылки, а не по фактическому объекту</li>
 * </ul>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Animal animal = new Animal();
 * Animal cat = new Cat();
 * animal.instanceInvoke();
 * cat.instanceInvoke();
 * Animal.staticInvoke();
 * Cat.staticInvoke();
 *
 * cat.staticInvoke();
 * Animal other = null;
 * other.staticInvoke();
 * Cat kitty = new Cat();
 * kitty.staticInvoke();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Вызов метода экземпляра Animal
 * Вызов метода экземпляра Cat
 * Вызов статического метода Animal
 * Вызов статического метода Cat
 *
 * Вызов статического метода Cat
 * Вызов статического метода Animal
 * Вызов статического метода Cat
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class HideExampleMain {

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрирует разницу между переопределением и сокрытием методов.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();
        animal.instanceInvoke();
        cat.instanceInvoke();
        Animal.staticInvoke();
        Cat.staticInvoke();
        cat.staticInvoke();
        Animal other = null;
        other.staticInvoke();
        Cat kitty = new Cat();
        kitty.staticInvoke();
    }
}