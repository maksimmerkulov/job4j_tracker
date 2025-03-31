package ru.job4j.oop;

/**
 * Класс {@code Cat} представляет собой простую модель кота.
 * У каждого кота есть кличка ({@code name}) и еда ({@code food}), которую он съел.
 * В методе {@code main(String[] args)} создаются два экземпляра котов и демонстрируется их поведение.
 *
 * @author Maksim Merkulov
 * @version 1.2
 * @since 2025-03-30
 */
public class Cat {

    /**
     * Поле {@code name} используется для хранения клички кота.
     */
    private String name;

    /**
     * Поле {@code food} используется для хранения съеденной еды.
     */
    private String food;

    /**
     * Метод {@code show()} выводит в консоль информацию о кличке кота и съеденной им еде.
     */
    public void show() {
        System.out.println(this.name + " ate " + this.food + ".");
    }

    /**
     * Метод {@code giveNick(String nick)} устанавливает кличку кота в поле name.
     *
     * @param nick Кличка кота.
     */
    public void giveNick(String nick) {
        this.name = nick;
    }

    /**
     * Метод {@code eat(String meat)} устанавливает еду в поле food.
     *
     * @param meat Название еды.
     */
    public void eat(String meat) {
        this.food = meat;
    }

    /**
     * Метод {@code main(String[] args)} демонстрирует работу класса {@code Cat}.
     * Создаются два объекта: {@code gav} и {@code black}, которым задаются клички и еда.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        System.out.println("There is gav's food.");
        Cat gav = new Cat();
        gav.giveNick("Gav");
        gav.eat("cutlet");
        gav.show();
        System.out.println("There is black's food.");
        Cat black = new Cat();
        black.giveNick("Black");
        black.eat("fish");
        black.show();
    }
}