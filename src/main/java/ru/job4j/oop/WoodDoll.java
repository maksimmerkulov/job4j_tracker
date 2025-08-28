package ru.job4j.oop;

/**
 * Класс {@code WoodDoll} представляет деревянную куклу, которая может содержать другую куклу (вложенность).
 *
 * <p>Используется для демонстрации рекурсии, композиции и принципа "матрешки".</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * WoodDoll little = new WoodDoll(null, "little doll");
 * WoodDoll middle = new WoodDoll(little, "middle doll");
 * WoodDoll big = new WoodDoll(middle, "big doll");
 * big.about();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Hello, my name is big doll
 * I have a child. Let's I call her ...
 * Hello, my name is middle doll
 * I have a child. Let's I call her ...
 * Hello, my name is little doll
 * I don't have a child.
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class WoodDoll {

    /**
     * Вложенная кукла.
     */
    private WoodDoll child;

    /**
     * Имя куклы.
     */
    private String name;

    /**
     * Создает экземпляр {@code WoodDoll} с именем и вложенной куклой.
     *
     * @param child вложенная кукла (может быть {@code null})
     * @param name  имя куклы
     */
    public WoodDoll(WoodDoll child, String name) {
        this.child = child;
        this.name = name;
    }

    /**
     * Выводит информацию о текущей кукле и рекурсивно вызывает {@code about()} у вложенной куклы.
     */
    public void about() {
        System.out.println("Hello, my name is " + name);
        if (child != null) {
            System.out.println("I have a child. Let's I call her ...");
            child.about();
        } else {
            System.out.println("I don't have a child.");
        }
    }

    /**
     * Создает цепочку вложенных кукол и вызывает метод {@link #about()} у самой внешней.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        WoodDoll little = new WoodDoll(null, "little doll");
        WoodDoll middle = new WoodDoll(little, "middle doll");
        WoodDoll big = new WoodDoll(middle, "big doll");
        big.about();
    }
}
