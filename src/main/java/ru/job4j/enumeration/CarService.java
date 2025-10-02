package ru.job4j.enumeration;

/**
 * Provides an entry point to demonstrate service station status operations.
 *
 * <p>Example output:
 * <pre>{@code
 * Toyota status: Finished. All work is completed
 * Volvo status: Waiting. The car is waiting for spare parts
 *
 * Status name: ACCEPTED, Ordinal: 0
 * Status name: IN_WORK, Ordinal: 1
 * Status name: WAITING, Ordinal: 2
 * Status name: FINISHED, Ordinal: 3
 *
 * ACCEPTED
 *
 * Status: The car is accepted at the service station
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class CarService {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Status toyota = Status.FINISHED;
        Status volvo = Status.WAITING;
        System.out.println("Toyota status: " + toyota.getInfo() + ". "
                + toyota.getMessage());
        System.out.println("Volvo status: " + volvo.getInfo() + ". "
                + volvo.getMessage());
        System.out.println();
        Status[] statuses = Status.values();
        for (Status s : statuses) {
            System.out.println("Status name: " + s.name()
                    + ", Ordinal: " + s.ordinal());
        }
        System.out.println();
        String accepted = "ACCEPTED";
        Status status = Status.valueOf(accepted);
        System.out.println(status);
        System.out.println();
        switch (status) {
            case ACCEPTED:
                System.out.println(
                        "Status: The car is accepted at the service station"
                );
                break;
            case IN_WORK:
                System.out.println("Status: The car is in work");
                break;
            case WAITING:
                System.out.println(
                        "Status: The car is waiting for spare parts"
                );
                break;
            case FINISHED:
                System.out.println("Status: All work is completed");
                break;
            default:
                System.out.println("Status: Unknown");
                break;
        }
    }
}
