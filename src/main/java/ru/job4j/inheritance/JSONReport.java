package ru.job4j.inheritance;

/**
 * Класс {@code JSONReport} наследуется от {@link TextReport} и генерирует отчет в формате JSON.
 *
 * <p>Метод {@link #generate(String, String)} переопределяется, чтобы возвращать строку в формате JSON
 * с двумя полями: {@code name} и {@code body}, каждое из которых располагается на своей строке с табуляцией.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * JSONReport report = new JSONReport();
 * String result = report.generate("David Gilmour", "Shine On You Crazy Diamond");
 * System.out.println(result);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * {
 *     "name" : "David Gilmour",
 *     "body" : "Shine On You Crazy Diamond"
 * }
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class JSONReport extends TextReport {

    /**
     * Генерирует отчет в формате JSON.
     *
     * <p>Каждое поле располагается на новой строке с отступом. В конце тела JSON
     * добавляется символ новой строки, соответствующий {@link System#lineSeparator()}.</p>
     *
     * @param name имя отчета
     * @param body содержимое отчета
     * @return строка в формате JSON с полями {@code name} и {@code body}
     */
    @Override
    public String generate(String name, String body) {
        return "{" + System.lineSeparator()
                + "\t\"name\" : \"" + name + "\","
                + System.lineSeparator()
                + "\t\"body\" : \"" + body + "\""
                + System.lineSeparator() + "}";
    }
}
