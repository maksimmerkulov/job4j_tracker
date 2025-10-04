package ru.job4j.polymorphism;

/**
 * Provides business logic operations using a data store.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Service {

    /**
     * The data store used by the service.
     */
    private Store store;

    /**
     * Creates a new {@code Service} with the specified store.
     *
     * @param store the data store
     */
    public Service(Store store) {
        this.store = store;
    }

    /**
     * Adds default user data to the store.
     */
    public void add() {
        store.save("Petr Arsentev");
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        FileStore store = new FileStore();
        /* MemoryStore store = new MemoryStore(); */
        Service service = new Service(store);
        service.add();
    }
}
