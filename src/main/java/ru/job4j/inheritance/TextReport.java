package ru.job4j.inheritance;

/**
 * Класс {@code TextReport} представляет собой генератор простых текстовых отчетов.
 *
 * <p>Используется для формирования строкового отчета, содержащего имя и тело,
 * каждое из которых размещается на отдельной строке.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * TextReport report = new TextReport();
 * String result = report.generate("Report Title", "Report body");
 * System.out.println(result);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Report Title
 * Report body
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class TextReport {

    /**
     * Генерирует отчет в текстовом формате.
     *
     * <p>Имя и тело отчета разделяются символом новой строки,
     * полученным через {@link System#lineSeparator()}.</p>
     *
     * @param name имя отчета
     * @param body содержимое отчета
     * @return строка с отчетом, в которой имя и тело находятся на отдельных строках
     */
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }
}
