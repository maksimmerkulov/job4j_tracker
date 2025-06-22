package ru.job4j.inheritance;

/**
 * Класс {@code Cat} представляет собой конкретную реализацию животного — кошки.
 *
 * <p>Наследует поведение от {@link Animal} и добавляет собственные особенности.</p>
 *
 * <p>Переопределяет нестатический метод {@link #instanceInvoke()},
 * а также скрывает статический метод {@link #staticInvoke()}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Cat cat = new Cat();
 * System.out.println(cat.canPurr());
 * cat.instanceInvoke();
 * Cat.staticInvoke();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * true
 * Вызов метода экземпляра Cat
 * Вызов статического метода Cat
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Cat extends Animal {

    /**
     * Проверяет, умеет ли кошка мурлыкать.
     *
     * <p>У всех живых кошек этот метод возвращает {@code true}.</p>
     *
     * @return Значение {@code true}, если кошка может мурлыкать.
     */
    public boolean canPurr() {
        return true;
    }

    /**
     * Переопределяет метод {@code instanceInvoke()} из класса {@link Animal}.
     *
     * <p>Выводит сообщение, специфичное для класса {@code Cat}.</p>
     */
    @Override
    public void instanceInvoke() {
        System.out.println("Вызов метода экземпляра Cat");
    }

    /**
     * Скрывает статический метод {@code staticInvoke()} из класса {@link Animal}.
     *
     * <p>Выводит сообщение, специфичное для класса {@code Cat}.</p>
     */
    public static void staticInvoke() {
        System.out.println("Вызов статического метода Cat");
    }
}