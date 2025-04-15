package ru.job4j.inheritance;

import ru.job4j.oop.Computer;

/**
 * Класс {@code HideExampleMain} демонстрирует поведение переопределения и скрытия методов в Java.
 *
 * <p>Пример иллюстрирует разницу между:</p>
 * <ul>
 *     <li>Переопределением (overriding) метода экземпляра {@code instanceInvoke()}</li>
 *     <li>Сокрытием (hiding) статического метода {@code staticInvoke()}</li>
 * </ul>
 *
 * <p>Пример выводит в консоль результаты вызовов методов при использовании различных типов ссылок и объектов:</p>
 *
 * <pre>{@code
 * Animal animal = new Animal();            Вызов метода экземпляра Animal
 * Animal cat = new Cat();                  Вызов метода экземпляра Cat (переопределение)
 * Animal.staticInvoke();                   Вызов статического метода Animal (hiding)
 * Cat.staticInvoke();                      Вызов статического метода Cat
 * cat.staticInvoke();                      Вызов Animal.staticInvoke() — зависит от типа ссылки, не объекта
 * Animal other = null;
 * other.staticInvoke();                    Вызов Animal.staticInvoke() — допустимо, статический метод
 * Cat kitty = new Cat();
 * kitty.staticInvoke();                    Вызов Cat.staticInvoke()
 * }</pre>
 *
 * <p>Этот пример подчёркивает, что:</p>
 * <ul>
 *     <li>Нестатические методы — виртуальные, зависят от объекта.</li>
 *     <li>Статические методы — не виртуальные, зависят от типа ссылки.</li>
 * </ul>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-15
 */
public class HideExampleMain {

    /**
     * Метод {@code main(String[] args)} демонстрирует различие между переопределением
     * нестатических методов и скрытием статических методов при наследовании.
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