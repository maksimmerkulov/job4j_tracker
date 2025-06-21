package ru.job4j.inheritance;

/**
 * Класс {@code Programmer} наследуется от {@link Person} и представляет программиста.
 *
 * <p>Добавляет поведение — умение писать код.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Programmer programmer = new Programmer();
 * String code = programmer.writeCode();
 * System.out.println(code);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Я пишу код.
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Programmer extends Person {

    /**
     * Возвращает строку с сообщением о том, что программист пишет код.
     *
     * @return Строка с сообщением о том, что программист пишет код.
     */
    public String writeCode() {
        return "Я пишу код.";
    }
}