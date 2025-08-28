package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code PassportOfficeTest} содержит модульные тесты
 * для проверки работы сервиса {@link PassportOffice}.
 *
 * <p>Основные сценарии:</p>
 * <ul>
 *     <li>Добавление нового гражданина в базу и последующее получение по паспорту.</li>
 *     <li>Попытка добавить гражданина с уже существующим номером паспорта.</li>
 * </ul>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
 * PassportOffice office = new PassportOffice();
 * office.add(citizen);
 * assertThat(office.get(citizen.getPassport())).isEqualTo(citizen);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class PassportOfficeTest {

    /**
     * Проверяет, что новый гражданин успешно добавляется
     * и его можно получить по номеру паспорта.
     *
     * <p>Ожидается, что метод {@link PassportOffice#add(Citizen)}вернет {@code true},
     * а метод {@link PassportOffice#get(String)} вернет того же самого гражданина.</p>
     */
    @Test
    public void whenTestAddMethod() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport())).isEqualTo(citizen);
    }

    /**
     * Проверяет, что добавление гражданина с дублирующимся номером паспорта
     * не выполняется.
     *
     * <p>Ожидается, что метод {@link PassportOffice#add(Citizen)} вернет {@code false},
     * если паспорт уже существует в базе.</p>
     */
    @Test
    public void whenAddDuplicatePassportThenFalse() {
        Citizen citizen1 = new Citizen("2f44a", "Petr Arsentev");
        Citizen citizen2 = new Citizen("2f44a", "Ivan Ivanov");
        PassportOffice office = new PassportOffice();
        office.add(citizen1);
        assertThat(office.add(citizen2)).isFalse();
    }
}
