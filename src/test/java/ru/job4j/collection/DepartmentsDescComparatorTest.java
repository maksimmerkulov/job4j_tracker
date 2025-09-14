package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code DepartmentsDescComparatorTest} содержит модульные тесты
 * для проверки работы компаратора {@link DepartmentsDescComparator}.
 *
 * <p>Проверяется корректность сравнения строковых представлений подразделений
 * в порядке убывания по основному департаменту, а также сохранение
 * иерархической структуры при сравнении.</p>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * int result = new DepartmentsDescComparator().compare(
 *         "K2/SK1/SSK2",
 *         "K2/SK1/SSK1"
 * );
 * assertThat(result).isGreaterThan(0);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class DepartmentsDescComparatorTest {

    /**
     * Проверяет, что подразделение сравнивается корректно внутри одного департамента.
     */
    @Test
    void compare() {
        int result = new DepartmentsDescComparator().compare(
                "K2/SK1/SSK2",
                "K2/SK1/SSK1"
        );
        assertThat(result).isGreaterThan(0);
    }

    /**
     * Проверяет, что родительский департамент идет раньше дочернего.
     */
    @Test
    void whenUpDepartmentGoBefore() {
        int result = new DepartmentsDescComparator().compare(
                "K2",
                "K2/SK1"
        );
        assertThat(result).isLessThan(0);
    }

    /**
     * Проверяет сортировку, когда различаются первые департаменты.
     * Ожидается сортировка в порядке возрастания внутри разных корневых элементов.
     */
    @Test
    void whenFirstDepartmentIsDifferentThenAsc() {
        int result = new DepartmentsDescComparator().compare(
                "K2/SK1/SSK1",
                "K1/SK1/SSK2"
        );
        assertThat(result).isLessThan(0);
    }

    /**
     * Проверяет сортировку, когда различаются первые департаменты.
     * Ожидается сортировка в порядке убывания корневых элементов.
     */
    @Test
    void whenFirstDepartmentIsDifferentThenDesc() {
        int result = new DepartmentsDescComparator().compare(
                "K1/SK1/SSK1",
                "K2/SK1"
        );
        assertThat(result).isGreaterThan(0);
    }
}
