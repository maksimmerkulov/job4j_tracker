package ru.job4j.pojo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test for the {@link License} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class LicenseTest {

    /**
     * Verifies that licenses with the same code are equal.
     */
    @Test
    void eqName() {
        License first = new License();
        first.setCode("audio");
        License second = new License();
        second.setCode("audio");
        assertThat(first).isEqualTo(second);
    }
}
