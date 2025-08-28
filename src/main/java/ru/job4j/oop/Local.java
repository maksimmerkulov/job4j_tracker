package ru.job4j.oop;

/**
 * Класс {@code Local} демонстрирует использование локального внутреннего класса
 * внутри метода экземпляра.
 *
 * <p>Локальный класс {@code FullName}, определенный в методе {@link #getFullName()},
 * использует поле внешнего класса и локальную переменную метода для формирования полного имени.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Local local = new Local();
 * local.getFullName();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Maksim Merkulov
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Local {

    /**
     * Имя, доступное для использования во внутреннем классе.
     */
    private String name = "Maksim";

    /**
     * Метод {@code getFullName()} демонстрирует использование локального внутреннего класса.
     *
     * <p>Внутри метода создается локальный класс {@code FullName},
     * который объединяет имя и фамилию и выводит результат в консоль.</p>
     */
    public void getFullName() {
        final String surname = "Merkulov";

        class FullName {
            public static final String PATRONYMIC = "Empty";

            public void printFullName() {
                System.out.println(name + " " + surname);
            }
        }

        FullName fullName = new FullName();
        fullName.printFullName();
    }

    /**
     * Точка входа в программу.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Local local = new Local();
        local.getFullName();
    }
}
