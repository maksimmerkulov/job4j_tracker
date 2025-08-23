package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code UserTest} содержит модульные тесты для проверки
 * корректной работы сортировки пользователей {@link User}.
 *
 * <p>Проверяется корректность реализации интерфейса {@link Comparable},
 * а также сортировка пользователей в коллекции {@link TreeSet}.</p>
 *
 * <p>Сценарии включают:</p>
 * <ul>
 *     <li>Сортировка по имени в порядке возрастания.</li>
 *     <li>Сортировка при совпадении имени, но разном возрасте.</li>
 *     <li>Результаты метода {@link User#compareTo(User)}.</li>
 * </ul>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * Set<User> users = new TreeSet<>();
 * users.add(new User("Petr", 32));
 * users.add(new User("Ivan", 31));
 * Iterator<User> iterator = users.iterator();
 * assertThat(iterator.next()).isEqualTo(new User("Ivan", 31));
 * assertThat(iterator.next()).isEqualTo(new User("Petr", 32));
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class UserTest {
    /**
     * Проверяет, что пользователи сортируются по имени
     * в алфавитном порядке.
     */
    @Test
    public void whenAsc() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Petr", 32));
        users.add(new User("Ivan", 31));
        Iterator<User> iterator = users.iterator();
        assertThat(iterator.next()).isEqualTo(new User("Ivan", 31));
        assertThat(iterator.next()).isEqualTo(new User("Petr", 32));
    }

    /**
     * Проверяет сортировку пользователей с одинаковыми именами,
     * но разным возрастом. Сначала сортировка выполняется по имени,
     * затем — по возрасту в порядке возрастания.
     */
    @Test
    public void whenAscForUsersWithEqualNameButDifferentAge() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Petr", 35));
        users.add(new User("Ivan", 31));
        users.add(new User("Petr", 25));
        users.add(new User("Ivan", 29));
        users.add(new User("Petr", 33));
        users.add(new User("Ivan", 27));
        Set<User> expected = new TreeSet<>(
                Arrays.asList(
                        new User("Ivan", 27),
                        new User("Ivan", 29),
                        new User("Ivan", 31),
                        new User("Petr", 25),
                        new User("Petr", 33),
                        new User("Petr", 35)
                )
        );
        assertThat(users).containsSequence(expected);
    }

    /**
     * Проверяет, что при сравнении "Petr" и "Ivan"
     * результат положительный, так как "Petr" больше "Ivan"
     * в лексикографическом порядке.
     */
    @Test
    public void whenComparePetrVSIvan() {
        int result = new User("Petr", 32)
                .compareTo(
                        new User("Ivan", 31)
                );
        assertThat(result).isGreaterThan(0);
    }

    /**
     * Проверяет, что при совпадении имени пользователи
     * сравниваются по возрасту. Меньший возраст считается "меньше".
     */
    @Test
    public void whenComparePetrVSPetrWithDifferentAge() {
        int result = new User("Petr", 31)
                .compareTo(
                        new User("Petr", 32)
                );
        assertThat(result).isLessThan(0);
    }
}
