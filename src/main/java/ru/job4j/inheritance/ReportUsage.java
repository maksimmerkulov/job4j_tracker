package ru.job4j.inheritance;

/**
 * Класс {@code ReportUsage} демонстрирует использование отчетов, основанных на {@link TextReport}.
 * <p>
 * В методе {@link #main(String[])} создается объект {@link HtmlReport}, вызывается метод
 * {@link HtmlReport#generate(String, String)}, и результат выводится в консоль.
 * </p>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 *     <h1>Report's name</h1>
 *     <br/>
 *     <span>Report's body</span>
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-14
 */
public class ReportUsage {

    /**
     * Метод {@code main(String[] args)} демонстрирует генерацию HTML-отчета с использованием класса {@link HtmlReport}.
     * <p>
     * Создает экземпляр {@link  HtmlReport}, генерирует отчет по заданным имени и телу,
     * и выводит результат в консоль.
     * </p>
     *
     * <p><b>Пример результата выполнения:</b></p>
     * <pre>{@code
     *     <h1>Report's name</h1>
     *     <br/>
     *     <span>Report's body</span>
     * }</pre>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        HtmlReport report = new HtmlReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
    }
}