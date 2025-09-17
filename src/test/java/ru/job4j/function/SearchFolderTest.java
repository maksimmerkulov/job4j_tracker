package ru.job4j.function;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Predicate;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code SearchFolderTest} содержит модульные тесты
 * для проверки работы метода {@link SearchFolder#filter(List, Predicate)}.
 *
 * <p>Тестируется универсальная фильтрация объектов {@link Folder}
 * с помощью {@link Predicate}. В частности:</p>
 * <ul>
 *     <li>Фильтрация по размеру папки больше 100.</li>
 *     <li>Фильтрация по имени, содержащему подстроку "bug".</li>
 * </ul>
 *
 * <p><b>Примеры тестирования:</b></p>
 * <pre>{@code
 * List<Folder> list = List.of(
 *         new Folder("fix", 110),
 *         new Folder("bug", 75),
 *         new Folder("bug", 90)
 * );
 * List<Folder> expected = List.of(new Folder("fix", 110));
 * Predicate<Folder> predicate = folder -> folder.getSize() > 100;
 * List<Folder> result = SearchFolder.filter(list, predicate);
 * assertThat(result).containsAll(expected);
 *
 * List<Folder> list = List.of(
 *         new Folder("fix", 110),
 *         new Folder("bug", 75),
 *         new Folder("bug", 90)
 * );
 * List<Folder> expected = List.of(
 *         new Folder("bug", 75),
 *         new Folder("bug", 90)
 * );
 * Predicate<Folder> predicate = folder -> folder.getName().contains("bug");
 * List<Folder> result = SearchFolder.filter(list, predicate);
 * assertThat(result).containsAll(expected);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class SearchFolderTest {

    /**
     * Проверяет, что метод {@link SearchFolder#filter(List, Predicate)}
     * корректно возвращает список папок размером больше 100.
     *
     * <p>Ожидается: только {@code fix} (110).</p>
     */
    @Test
    public void whenFilterSize() {
        List<Folder> list = List.of(
                new Folder("fix", 110),
                new Folder("bug", 75),
                new Folder("bug", 90)
        );
        List<Folder> expected = List.of(new Folder("fix", 110));
        Predicate<Folder> predicate = folder -> folder.getSize() > 100;
        List<Folder> result = SearchFolder.filter(list, predicate);
        assertThat(result).containsAll(expected);
    }

    /**
     * Проверяет, что метод {@link SearchFolder#filter(List, Predicate)}
     * корректно возвращает список папок, содержащих
     * в имени подстроку {@code "bug"}.
     *
     * <p>Ожидается: {@code bug} (75) и {@code bug} (90).</p>
     */
    @Test
    public void whenFilterName() {
        List<Folder> list = List.of(
                new Folder("fix", 110),
                new Folder("bug", 75),
                new Folder("bug", 90)
        );
        List<Folder> expected = List.of(
                new Folder("bug", 75),
                new Folder("bug", 90)
        );
        Predicate<Folder> predicate = folder -> folder.getName().contains("bug");
        List<Folder> result = SearchFolder.filter(list, predicate);
        assertThat(result).containsAll(expected);
    }
}
