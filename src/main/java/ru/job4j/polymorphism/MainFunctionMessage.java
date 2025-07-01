package ru.job4j.polymorphism;

/**
 * Класс {@code MainFunctionMessage} демонстрирует использование класса {@link FunctionMessage},
 * реализующего интерфейс {@link FunctionTwo}.
 *
 * <p>В методе {@link  MainFunctionMessage#main(String[])} создается экземпляр {@link FunctionMessage}
 * и вызывается метод {@link FunctionTwo#functionMessage()}, переопределенный в интерфейсе {@link FunctionTwo}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * FunctionMessage functionMessage = new FunctionMessage();
 * functionMessage.functionMessage();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Сообщение из FunctionTwo
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class MainFunctionMessage {

    /**
     * Точка входа в программу.
     *
     * <p>Создает объект {@link FunctionMessage} и вызывает его метод {@code FunctionTwo#functionMessage()}.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        FunctionMessage functionMessage = new FunctionMessage();
        functionMessage.functionMessage();
    }
}