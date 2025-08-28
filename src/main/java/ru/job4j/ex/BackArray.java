package ru.job4j.ex;

/**
 * Класс {@code BackArray} предоставляет утилиту для разворота массива строк.
 *
 * <p>Используется для демонстрации правильной индексации и предотвращения ошибки
 * {@link ArrayIndexOutOfBoundsException}, возникающей при обращении за пределы массива.</p>
 *
 * <p><b>Пример корректного использования:</b></p>
 * <pre>{@code
 * String[] input = {"Petr", "Ivan", "Nik"};
 * String[] result = new BackArray().turn(input);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Nik
 * Ivan
 * Petr
 * }</pre>
 *
 * <p><b>Пример некорректного кода, вызывающего исключение:</b></p>
 * <pre>{@code
 * names[index] = names[names.length - index];
 * }</pre>
 * <p>Этот код приведет к {@link ArrayIndexOutOfBoundsException} на последней итерации цикла.</p>
 *
 * <p><b>Правильный вариант:</b></p>
 * <pre>{@code
 * names[index] = names[names.length - index - 1];
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class BackArray {

    /**
     * Разворачивает переданный массив строк.
     *
     * <p>Метод инвертирует порядок элементов массива "на месте", без использования
     * дополнительной памяти, кроме одной временной переменной для обмена элементов.</p>
     *
     * <p><b>Алгоритм:</b> элементы массива меняются местами симметрично, начиная с крайних
     * и двигаясь к центру. Это предотвращает ошибку {@link ArrayIndexOutOfBoundsException},
     * которая могла бы возникнуть при неправильной индексации.</p>
     *
     * @param names массив строк, который требуется развернуть
     * @return тот же массив {@code names}, но с элементами в обратном порядке
     */
    public String[] turn(String[] names) {
        int middle = names.length / 2;
        for (int index = 0; index < middle; index++) {
            String temp = names[index];
            names[index] = names[names.length - index - 1];
            names[names.length - index - 1] = temp;
        }
        return names;
    }
}
