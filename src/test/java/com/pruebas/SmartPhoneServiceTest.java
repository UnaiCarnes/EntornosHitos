package com.pruebas;

import static org.junit.jupiter.api.Assertions.*;

import com.example.demo.service.SmartPhoneServiceImpl;
import com.example.demo.service.SmartPhoneService;
import org.junit.Test;
import org.junit.Before;
import org.junit.jupiter.api.DisplayName;

public class SmartPhoneServiceTest {

    private SmartPhoneService smartPhoneService;
    @Before
    public void setUp() {
        smartPhoneService = new SmartPhoneServiceImpl();
    }
    @DisplayName("El método count() no debe devolver NULL")
    @Test
    public void testCountNotNull() {
        assertNotNull(smartPhoneService.count());
    }

    @DisplayName("El valor devuelto por count() debe ser mayor que 0")
    @Test
    public void testCountGreaterThanZero() {
        assertTrue(smartPhoneService.count() > 0);
    }

    @DisplayName("El valor devuelto por count() debe ser 3")
    @Test //Este test va a fallar si cambiamos el numero 3 a 4
    public void testCountEqualsThree() {
        assertEquals(3, smartPhoneService.count());
    }

    @DisplayName("El método findOne() debe lanzar IllegalArgumentException cuando se pasa un ID nulo")
    @Test
    public void testFindOneWithNullId() {
        assertThrows(IllegalArgumentException.class, () -> smartPhoneService.findOne(null));
    }

    @DisplayName("Las aserciones de count() deben ejecutarse independientemente")
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
    //public class SmartPhoneServiceTest {
    //@BeforeAll y @AfterAll son anotaciones utilizadas en JUnit para especificar métodos que se ejecutan una vez antes y después de todos los métodos de prueba en una clase de prueba, respectivamente. Pueden ser útiles para configurar el estado inicial una vez y limpiar después de todas las pruebas.
    //@TestMethodOrder es una anotación que permite especificar el orden en el que se deben ejecutar los métodos de prueba en una clase de prueba. Puede ser útil cuando el orden de ejecución de las pruebas es importante, lo cual es raro pero puede ser necesario en algunos casos.
    //@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    //public class SmartPhoneServiceTest {
    //    private SmartPhoneService smartPhoneService;
    //
    //    @BeforeAll
    //    public static void setUpClass() {
    //        // Configuración inicial una vez antes de todas las pruebas
    //        System.out.println("Before all tests");
    //    }
    //
    //    @BeforeEach
    //    public void setUp() {
    //        // Configuración inicial antes de cada prueba
    //        smartPhoneService = new SmartPhoneService(); // Supongamos que se crea una nueva instancia para cada prueba
    //        System.out.println("Before each test");
    //    }
    //
    //    @Test
    //    @Order(1)
    //    @DisplayName("El método count() no debe devolver NULL")
    //    public void testCountNotNull() {
    //        assertNotNull(smartPhoneService.count());
    //    }
    //
    //    @Test
    //    @Order(2)
    //    @DisplayName("El valor devuelto por count() debe ser mayor que 0")
    //    public void testCountGreaterThanZero() {
    //        assertTrue(smartPhoneService.count() > 0);
    //    }
    //
    //    @Test
    //    @Order(3)
    //    @DisplayName("El valor devuelto por count() debe ser 3")
    //    public void testCountEqualsThree() {
    //        assertEquals(3, smartPhoneService.count());
    //    }
    //
    //    @Test
    //    @Order(4)
    //    @DisplayName("El método findOne() debe lanzar IllegalArgumentException cuando se pasa un ID nulo")
    //    public void testFindOneWithNullId() {
    //        assertThrows(IllegalArgumentException.class, () -> smartPhoneService.findOne(null),
    //            "El método findOne() debería lanzar una excepción cuando se pasa un ID nulo");
    //    }
    //
    //    @Test
    //    @Order(5)
    //    @DisplayName("Las aserciones de count() deben ejecutarse independientemente")
    //    public void testCountAssertions() {
    //        assertAll("count",
    //            () -> assertNotNull(smartPhoneService.count()),
    //            () -> assertTrue(smartPhoneService.count() > 0),
    //            () -> assertEquals(3, smartPhoneService.count())
    //        );
    //    }
    //
    //    @AfterEach
    //    public void tearDown() {
    //        // Limpieza después de cada prueba
    //        System.out.println("After each test");
    //    }
    //
    //    @AfterAll
    //    public static void tearDownClass() {
    //        // Limpieza después de todas las pruebas
    //        System.out.println("After all tests");
    //    }
    //}
}
