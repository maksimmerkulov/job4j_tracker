package ru.job4j.ooa;

/**
 * Финальный класс {@code Airbus} представляет собой модель самолета марки Airbus.
 *
 * <p>Наследование от этого класса запрещено, поскольку он объявлен как {@code final}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Airbus plane = new Airbus("A320");
 * plane.printModel();
 * plane.printCountEngine();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Модель самолета: A320
 * Количество двигателей равно: 2
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public final class Airbus extends Aircraft {

    /**
     * Стандартное количество двигателей для большинства моделей Airbus.
     */
    private static final int COUNT_ENGINE = 2;

    /**
     * Название модели самолета.
     */
    private String name;

    /**
     * Создает экземпляр {@code Airbus} с заданной моделью.
     *
     * @param name модель самолета
     */
    public Airbus(String name) {
        this.name = name;
    }

    /**
     * Возвращает название модели самолета.
     *
     * @return модель самолета
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает новую модель самолета.
     *
     * @param name новая модель самолета
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Переопределяет метод для вывода модели самолета.
     */
    @Override
    public void printModel() {
        System.out.println("Модель самолета: " + name);
    }

    /**
     * Выводит количество двигателей, соответствующее модели:
     * 4 — для A380, иначе — стандартное количество (2).
     */
    public void printCountEngine() {
        int engines = "A380".equals(name) ? 4 : COUNT_ENGINE;
        System.out.println("Количество двигателей равно: " + engines);
    }

    /**
     * Возвращает строковое представление объекта {@code Airbus}.
     *
     * @return строка в формате {@code Airbus{name='...'}}
     */
    @Override
    public String toString() {
        return "Airbus{"
                + "name='" + name + '\''
                + '}';
    }
}
