package ru.job4j.oop;

/**
 * Класс {@code Cat} представляет собой простую модель кота.
 *
 * <p>У каждого кота есть кличка ({@code name}) и еда ({@code food}), которую он съел.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * System.out.println("There is gav's food.");
 * Cat gav = new Cat();
 * gav.giveNick("Gav");
 * gav.eat("cutlet");
 * gav.show();
 *
 * System.out.println("There is black's food.");
 * Cat black = new Cat();
 * black.giveNick("Black");
 * black.eat("fish");
 * black.show();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * There is gav's food.
 * Gav ate cutlet.
 *
 * There is black's food.
 * Black ate fish.
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.3
 */
public class Cat {

    /**
     * Кличка кота.
     */
    private String name;

    /**
     * Еда, которую кот съел.
     */
    private String food;

    /**
     * Выводит в консоль информацию о кличке кота и съеденной им еде.
     */
    public void show() {
        System.out.println(this.name + " ate " + this.food + ".");
    }

    /**
     * Устанавливает кличку кота в поле {@code name}.
     *
     * @param nick кличка кота
     */
    public void giveNick(String nick) {
        this.name = nick;
    }

    /**
     * Устанавливает еду в поле {@code food}.
     *
     * @param meat название еды
     */
    public void eat(String meat) {
        this.food = meat;
    }

    /**
     * Демонстрирует работу класса {@link Cat}.
     *
     * <p>Создает два объекта: {@code gav} и {@code black}, которым задаются клички и еда.</p>
     *
     * @param args аргументы командной строки (не используются)
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
