package com.pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SmartPhoneServiceTest {

    @Test
    public void testCountNotNull() {
        assertNotNull(smartPhoneService.count());
    }

    @Test
    public void testCountGreaterThanZero() {
        assertTrue(smartPhoneService.count() > 0);
    }

    @Test
    public void testCountEqualsThree() {
        assertEquals(3, smartPhoneService.count());
    }
}
