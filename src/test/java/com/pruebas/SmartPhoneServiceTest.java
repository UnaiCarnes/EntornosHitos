package com.pruebas;

import static org.junit.jupiter.api.Assertions.*;
import com.example.demo.service.SmartPhoneServiceImpl;
import com.example.demo.service.SmartPhoneService;
import org.junit.Test;
import org.junit.Before;

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

    @Test
    public void testFindOneWithNullId() {
        assertThrows(IllegalArgumentException.class, () -> smartPhoneService.findOne(null));
    }

    @Test
    public void testCountAssertions() {
        assertAll("count",
                () -> assertNotNull(smartPhoneService.count()),
                () -> assertTrue(smartPhoneService.count() > 0),
                () -> assertEquals(3, smartPhoneService.count())
        );
    }

    //Las funciones lambda en Java se utilizan para proporcionar una forma concisa de expresar comportamientos sin la necesidad de definir una clase anónima o implementar una interfaz funcional.
    //@BeforeEach y @AfterEach son anotaciones utilizadas en JUnit para especificar métodos que se ejecutan antes y después de cada método de prueba en una clase de prueba, respectivamente. Pueden ser útiles para configurar el estado inicial y limpiar el estado después de cada prueba. En este caso no se utilizan ya que no hay que iniciar nada antes o despues de cada prueba.
    //@BeforeAll y @AfterAll son anotaciones utilizadas en JUnit para especificar métodos que se ejecutan una vez antes y después de todos los métodos de prueba en una clase de prueba, respectivamente. Pueden ser útiles para configurar el estado inicial una vez y limpiar después de todas las pruebas.
}
