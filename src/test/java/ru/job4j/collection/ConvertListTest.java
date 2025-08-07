package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code ConvertListTest} содержит модульный тест для проверки
 * корректной работы метода {@link ConvertList#convert(List)}.
 *
 * <p>Тест проверяет правильность преобразования списка массивов
 * в линейный список целых чисел.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ConvertListTest {

    /**
     * Проверяет преобразование списка из двух массивов в плоский список.
     *
     * <p>Входной список содержит массивы: {1} и {2, 3}.</p>
     * <p>Ожидаемый результат: [1, 2, 3].</p>
     */
    @Test
    public void whenTwoList() {
        List<int[]> list = new ArrayList<>();
        list.add(new int[] {1});
        list.add(new int[] {2, 3});
        List<Integer> result = ConvertList.convert(list);
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertThat(result).containsAll(expected);
    }
}
