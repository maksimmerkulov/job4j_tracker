package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Service for processing user profiles and extracting address information.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Profiles {

    /**
     * Extracts a list of addresses from profiles.
     *
     * @param profiles the list of profiles
     * @return a list of addresses
     */
    public static List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .collect(Collectors.toList());
    }

    /**
     * Extracts unique addresses sorted by city name.
     *
     * @param profiles the list of profiles
     * @return a sorted list of unique addresses
     */
    public static List<Address> collectSortWithoutDuplicate(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .sorted(Comparator.comparing(Address::getCity))
                .distinct()
                .collect(Collectors.toList());
    }
}
