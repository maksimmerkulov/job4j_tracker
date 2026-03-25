package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Service for processing user profiles and extracting address information.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Profiles {

    /**
     * Extracts a list of addresses from the given list of profiles.
     *
     * @param profiles the list of profiles to process
     * @return a list of addresses extracted from the profiles
     */
    public static List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .collect(Collectors.toList());
    }
}
