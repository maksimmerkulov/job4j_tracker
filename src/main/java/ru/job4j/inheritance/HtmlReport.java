package ru.job4j.inheritance;

/**
 * Класс {@code HtmlReport} представляет собой генератор HTML-отчетов.
 * <p>
 * Наследует функциональность от {@link TextReport}, но переопределяет метод {@link #generate(String, String)},
 * форматируя отчет в HTML-структуру.
 * </p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 *     HtmlReport report = new HtmlReport();
 *     String result = report.generate("Title", "Content");
 *     Результат:
 *     <h1>Title</h1><br/><span>Content</span>
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-04-17
 */
public class HtmlReport extends TextReport {

    /**
     * Метод {@code generate(String name, String body)} генерирует HTML-отчет.
     * <p>
     * Формирует HTML-разметку с использованием тегов {@code <h1>}, {@code <br/>} и {@code <span>},
     * где заголовок отображается в теге {@code <h1>}, а тело помещается в {@code <span>}.
     * </p>
     *
     * @param name Заголовок отчета.
     * @param body Содержимое отчета.
     * @return Строка с HTML-разметкой отчета.
     */
    @Override
    public String generate(String name, String body) {
        return "<h1>" + name + "</h1>"
                + "<br/>"
                + "<span>" + body + "</span>";
    }
}