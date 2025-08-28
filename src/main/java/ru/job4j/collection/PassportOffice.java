package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс {@code PassportOffice} представляет собой сервис для хранения
 * и поиска граждан по их паспортным данным.
 *
 * <p>Используется для регистрации новых граждан и получения информации
 * о них по паспорту.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * PassportOffice office = new PassportOffice();
 * Citizen ivan = new Citizen("1234", "Ivan Ivanov");
 * boolean added = office.add(ivan);
 * Citizen result = office.get("1234");
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * true
 * Citizen{passport='1234', username='Ivan Ivanov'}
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class PassportOffice {

    /**
     * Хранилище граждан в виде отображения.
     *
     * <p>Ключ — паспорт гражданина ({@link String}),
     * значение — объект {@link Citizen}, содержащий данные владельца паспорта.</p>
     *
     * <p>Используется для проверки уникальности паспорта и быстрого поиска
     * гражданина по его паспорту.</p>
     */
    private Map<String, Citizen> citizens = new HashMap<>();

    /**
     * Добавляет нового гражданина в базу.
     *
     * <p>Если гражданин с таким паспортом уже есть, то новый
     * не добавляется.</p>
     *
     * @param citizen объект {@link Citizen}, содержащий паспорт и имя
     * @return {@code true}, если гражданина не было в базе и он добавлен;
     *         {@code false}, если такой паспорт уже зарегистрирован
     */
    public boolean add(Citizen citizen) {
        if (!citizens.containsKey(citizen.getPassport())) {
            citizens.put(citizen.getPassport(), citizen);
            return true;
        }
        return false;
    }

    /**
     * Возвращает гражданина по номеру паспорта.
     *
     * @param passport строка с номером паспорта
     * @return объект {@link Citizen}, если найден, иначе {@code null}
     */
    public Citizen get(String passport) {
        return citizens.get(passport);
    }
}
