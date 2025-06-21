package ru.job4j.inheritance;

/**
 * Класс {@code CatMain} демонстрирует создание объектов {@link Cat} и {@link ToyCat},
 * а также вызов их методов.
 *
 * <p>Показывает, как используется наследование: {@link ToyCat} расширяет {@link Cat},
 * добавляя специфическое поведение, недоступное обычной кошке.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Cat cat = new Cat();
 * System.out.println(cat.canPurr());
 *
 * ToyCat toy = new ToyCat();
 * System.out.println(toy.canPurr());
 * System.out.println(toy.canBeWashByWashMachine());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * true
 *
 * true
 * true
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class CatMain {

    /**
     * Точка входа в программу.
     *
     * <p>Создает объекты {@link Cat} и {@link ToyCat}, вызывает их методы
     * и выводит результат в консоль.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.canPurr());
        ToyCat toy = new ToyCat();
        System.out.println(toy.canPurr());
        System.out.println(toy.canBeWashByWashMachine());
    }
}