package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Service for generating product discount labels based on expiration dates.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ProductLabel {

    /**
     * Generates labels for products that expire within 0 to 3 days.
     *
     * <p>Applies a 50% discount to each labeled product.</p>
     *
     * @param products the list of products to process
     * @return a list of string representations of the labels
     */
    public List<String> generateLabels(List<Product> products) {
        return products.stream()
                .filter(p -> p.getStandard() - p.getActual() >= 0)
                .filter(p -> p.getStandard() - p.getActual() <= 3)
                .map(p -> new Label(p.getName(), p.getPrice() * 0.5f))
                .map(Label::toString)
                .collect(Collectors.toList());
    }
}
