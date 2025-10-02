package ru.job4j.enumeration;

/**
 * Represents a service station task status.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public enum Status {

    /**
     * The car is accepted at the service station.
     */
    ACCEPTED("Accepted") {
        private String message = "The car is accepted at the service station";

        @Override
        public String getMessage() {
            return message;
        }
    },

    /**
     * The car is currently being repaired.
     */
    IN_WORK("In work") {
        private String message = "The car is in work";

        @Override
        public String getMessage() {
            return message;
        }
    },

    /**
     * The car is waiting for necessary spare parts.
     */
    WAITING("Waiting") {
        private String message = "The car is waiting for spare parts";

        @Override
        public String getMessage() {
            return message;
        }
    },

    /**
     * All repairs are finished.
     */
    FINISHED("Finished") {
        private String message = "All work is completed";

        @Override
        public String getMessage() {
            return message;
        }
    };

    /**
     * Short information about the status.
     */
    private String info;

    /**
     * Creates a new {@code Status} with the specified info.
     *
     * @param info the status info
     */
    Status(String info) {
        this.info = info;
    }

    /**
     * Returns the status info.
     *
     * @return the info
     */
    public String getInfo() {
        return info;
    }

    /**
     * Returns a detailed message about the status.
     *
     * @return the status message
     */
    public abstract String getMessage();
}
