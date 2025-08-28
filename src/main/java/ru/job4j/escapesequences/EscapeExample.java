package ru.job4j.escapesequences;

/**
 * Класс {@code EscapeExample} демонстрирует использование управляющих последовательностей
 * (экранирующих символов) в строках Java.
 *
 * <p>В коде используются следующие управляющие последовательности:</p>
 * <ul>
 *     <li>{@code \'} — одинарная кавычка</li>
 *     <li>{@code \"} — двойная кавычка</li>
 *     <li>{@code \\} — обратный слэш</li>
 *     <li>{@code \r} — возврат каретки (carriage return)</li>
 *     <li>{@code \n} — перевод строки (newline)</li>
 *     <li>{@code \t} — табуляция (отступ)</li>
 *     <li>{@code \b} — возврат на один символ назад (backspace)</li>
 * </ul>
 *
 * <p>Класс выводит в консоль примеры каждой последовательности и демонстрирует
 * их поведение в реальном выводе.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * System.out.println('\'');
 * String string = "Я изучаю на 'Job4j' экранирование символов";
 * System.out.println(string);
 *
 * System.out.println('\"');
 * String string = "Я изучаю на \"Job4j\" экранирование символов";
 * System.out.println(string);
 *
 * System.out.println('\\');
 * String string = "C:\\projects\\job4j\\File.java";
 * System.out.println(string);
 *
 * System.out.print("Старый длинный текст\r");
 * System.out.println("Новый текст");
 *
 * System.out.print("Первая строка\nВторая строка");
 *
 * System.out.println("Без отступа");
 * System.out.println("\tОдин отступ");
 * System.out.println("\t\tДва отступа");
 *
 * System.out.println("Job4jjj\b\b");
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * '
 * Я изучаю на 'Job4j' экранирование символов
 *
 * "
 * Я изучаю на "Job4j" экранирование символов
 *
 * \
 * C:\projects\job4j\File.java
 *
 * Новый текст
 *
 * Первая строка
 * Вторая строка
 *
 * Без отступа
 *     Один отступ
 *         Два отступа
 *
 * Job4j
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class EscapeExample {

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрирует использование экранированных символов
     * и управляющих последовательностей в строках.
     * Выводит на экран различные примеры работы с ними.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        System.out.println('\'');
        String string = "Я изучаю на 'Job4j' экранирование символов";
        System.out.println(string);
        System.out.println();
        System.out.println('\"');
        string = "Я изучаю на \"Job4j\" экранирование символов";
        System.out.println(string);
        System.out.println();
        System.out.println('\\');
        string = "C:\\projects\\job4j\\File.java";
        System.out.println(string);
        System.out.println();
        System.out.print("Старый длинный текст\r");
        System.out.println("Новый текст");
        System.out.println();
        System.out.print("Первая строка\nВторая строка\n");
        System.out.println();
        System.out.println("Без отступа");
        System.out.println("\tОдин отступ");
        System.out.println("\t\tДва отступа");
        System.out.println();
        System.out.println("Job4jjj\b\b");
    }
}
