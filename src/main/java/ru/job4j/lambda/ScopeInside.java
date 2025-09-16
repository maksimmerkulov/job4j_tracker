package ru.job4j.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Demonstrates variable scope and closure usage within a {@link Supplier}.
 *
 * <p>Example output:
 * <pre>{@code
 * world
 * world world world
 * 1
 * 2
 * 3
 * 4
 * 5
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ScopeInside {

    /**
     * A functional interface that can throw an exception.
     *
     * @param <T> the type of the input
     * @param <E> the type of the exception thrown
     */
    @FunctionalInterface
    public interface ThrowingExceptionConsumer<T, E extends Exception> {
        void accept(T t) throws E;
    }

    /**
     * Wraps a throwing consumer into a standard {@link Consumer}.
     *
     * @param <T> the type of the input
     * @param throwingExceptionConsumer the consumer that throws an exception
     * @return a standard consumer
     */
    static <T> Consumer<T> throwingExceptionConsumerWrapper(
            ThrowingExceptionConsumer<T, Exception> throwingExceptionConsumer) {
        return x -> {
            try {
                throwingExceptionConsumer.accept(x);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }

    /**
     * Repeats the string provided by the supplier three times.
     *
     * @param supplier the source of the string
     * @return the repeated string
     */
    private static String echo(Supplier<String> supplier) {
        String sound = supplier.get();
        return sound + " " + sound + " " + sound;
    }

    /**
     * Simulates an operation that might throw an exception.
     *
     * @param number the number to process
     * @throws Exception if an error occurs
     */
    private static void methodThrowingAnException(Integer number)
            throws Exception {
        System.out.println(number);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        String message = "hello";
        message = "world";
        String temp = message;
        String name = echo(
                () -> {
                    return temp;
                }
        );
        System.out.println(message);
        System.out.println(name);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(
                throwingExceptionConsumerWrapper(
                        n -> methodThrowingAnException(n)
                )
        );
    }
}
