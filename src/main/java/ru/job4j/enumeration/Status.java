package ru.job4j.enumeration;

/**
 * Перечисление {@code Status} представляет статус обслуживания автомобиля на СТО.
 * <p>
 * Каждый статус содержит краткое описание и подробное сообщение.
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Status status = Status.IN_WORK;
 * System.out.println(status.getInfo());
 * System.out.println(status.getMessage());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * В работе
 * Автомобиль в работе
 * }</pre>
 *
 * @author Maksим Merkulov
 * @version 1.0
 * @since 2025-04-24
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
     * Поле {@code info} содержит краткое текстовое описание статуса.
     * <p>
     * Используется для отображения статуса пользователю в краткой форме.
     */
    private String info;

    /**
     * Конструктор перечисления {@link Status}.
     * <p>
     * Инициализирует краткое описание статуса, которое сохраняется в поле {@code info}.
     *
     * @param info Строка с кратким описанием статуса.
     */
    Status(String info) {
        this.info = info;
    }

    /**
     * Метод {@code getInfo()} возвращает краткую информацию о статусе.
     *
     * @return Краткое описание статуса.
     */
    public String getInfo() {
        return info;
    }

    /**
     * Абстрактный метод {@code getMessage()} используется для получения полного текстового описания статуса.
     *
     * @return Подробное сообщение.
     */
    public abstract String getMessage();

}