package com.pruebas;

import static org.junit.jupiter.api.Assertions.*;

import com.example.demo.service.SmartPhoneServiceImpl;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import com.example.demo.service.SmartPhoneService;

public class SmartPhoneServiceTest {

    private SmartPhoneService smartPhoneService;
    @Before
    public void setUp() {
        smartPhoneService = new SmartPhoneServiceImpl();
    }
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
