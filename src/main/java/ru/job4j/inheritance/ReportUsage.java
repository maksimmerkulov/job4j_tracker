package ru.job4j.inheritance;

/**
 * Класс {@code ReportUsage} демонстрирует пример использования класса {@link HtmlReport}.
 *
 * <p>Создает отчет в формате HTML на основе заданного имени и тела, а затем выводит результат в консоль.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * HtmlReport report = new HtmlReport();
 * String text = report.generate("Report's name", "Report's body");
 * System.out.println(text);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * <h1>Report's name</h1><br/><span>Report's body</span>
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class ReportUsage {

    /**
     * Точка входа в программу.
     *
     * <p>Создает экземпляр {@link HtmlReport}, формирует HTML-отчет и выводит его в консоль.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        HtmlReport report = new HtmlReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
    }
}
