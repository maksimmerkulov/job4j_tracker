package ru.job4j.enumeration;

/**
 * Перечисление {@code Status} представляет статус обслуживания автомобиля на СТО.
 *
 * <p>Каждый статус содержит краткое описание и подробное сообщение.</p>
 *
 * <p>Используется для отслеживания этапов обработки автомобиля:
 * принятие, ремонт, ожидание запчастей, завершение работ.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Status toyota = Status.FINISHED;
 * Status volvo = Status.WAITING;
 * System.out.println("Статус Toyota: " + toyota);
 * System.out.println("Статус Volvo: " + volvo);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Статус Toyota: FINISHED
 * Статус Volvo: WAITING
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public enum Status {

    /**
     * Статус "Принят": автомобиль принят на СТО.
     */
    ACCEPTED("Принят") {
        private String message = "Автомобиль принят на СТО";

        @Override
        public String getMessage() {
            return message;
        }
    },

    /**
     * Статус "В работе": автомобиль находится в процессе ремонта.
     */
    IN_WORK("В работе") {
        private String message = "Автомобиль в работе";

        @Override
        public String getMessage() {
            return message;
        }
    },

    /**
     * Статус "Ожидание": автомобиль ожидает запчасти.
     */
    WAITING("Ожидание") {
        private String message = "Автомобиль ожидает запчасти";

        @Override
        public String getMessage() {
            return message;
        }
    },

    /**
     * Статус "Работы завершены": все работы завершены.
     */
    FINISHED("Работы завершены") {
        private String message = "Все работы завершены";

        @Override
        public String getMessage() {
            return message;
        }
    };

    /**
     * Краткое описание статуса.
     */
    private String info;

    /**
     * Инициализирует краткое описание статуса,
     * которое сохраняется в поле {@code info}.
     *
     * @param info строка с кратким описанием статуса
     */
    Status(String info) {
        this.info = info;
    }

    /**
     * Возвращает краткую информацию о статусе.
     *
     * @return краткое описание статуса
     */
    public String getInfo() {
        return info;
    }

    /**
     * Возвращает подробное сообщение о статусе.
     *
     * @return подробное текстовое сообщение
     */
    public abstract String getMessage();
}
