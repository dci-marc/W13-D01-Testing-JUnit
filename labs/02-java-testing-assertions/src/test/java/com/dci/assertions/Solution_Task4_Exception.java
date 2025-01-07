package com.dci.assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Solution_Task4_Exception {
    @Test
    void testLastNameNotNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Employee(1001, "Hugo", null, new String[] {"sales", "admin"});
        });
    }
}
