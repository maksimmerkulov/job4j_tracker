package ru.job4j.tracker;

/**
 * Класс {@code Singleton} реализует шаблон проектирования <b>Одиночка (Singleton)</b>.
 *
 * <p>Обеспечивает наличие только одного экземпляра объекта данного класса в пределах приложения.
 * Подходит для случаев, когда необходимо централизованное управление ресурсом или доступом к общим данным.</p>
 *
 * <p>Реализация использует <b>ленивую инициализацию</b> — объект создается
 * только при первом обращении к методу {@link #getInstance()}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Singleton singleton = Singleton.getInstance();
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public final class Singleton {

    /**
     * Единственный экземпляр класса {@link Singleton}.
     *
     * <p>Инициализируется при первом вызове {@link #getInstance()}.</p>
     */
    private static Singleton instance = null;

    /**
     * Приватный конструктор. Запрещает создание объекта извне.
     */
    private Singleton() {
    }

    /**
     * Возвращает единственный экземпляр класса {@link Singleton}.
     *
     * <p>При первом вызове создает новый объект. При последующих —
     * возвращает уже созданный экземпляр.</p>
     *
     * @return Объект {@link Singleton}.
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}