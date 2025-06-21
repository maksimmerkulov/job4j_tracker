package ru.job4j.inheritance;

/**
 * Класс {@code HtmlReport} наследуется от {@link TextReport} и генерирует отчет в формате HTML.
 *
 * <p>Метод {@link #generate(String, String)} возвращает HTML-разметку с заголовком в теге {@code h1},
 * разрывом строки через {@code br/} и телом отчета внутри тега {@code span}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * HtmlReport report = new HtmlReport();
 * String result = report.generate("Report Title", "Some body text");
 * System.out.println(result);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * <h1>Report Title</h1><br/><span>Some body text</span>
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class HtmlReport extends TextReport {

    /**
     * Генерирует отчет в формате HTML.
     *
     * <p>Имя отчета отображается в заголовке {@code h1}, тело — в {@code span}, между ними — {@code br/}.</p>
     *
     * @param name Заголовок отчета.
     * @param body Содержимое отчета.
     * @return Строка с HTML-разметкой.
     */
    public String generate(String name, String body) {
        return "<h1>" + name + "</h1>"
                + "<br/>"
                + "<span>" + body + "</span>";
    }
}