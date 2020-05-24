package Junit5;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class JunitSampleClassTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("**--- Executed once before all test methods in this class ---**");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("**--- Executed before each test method in this class ---**");
    }

    @Test
    void method1() {
        System.out.println("**--- Test method1 executed ---**");
    }

    @DisplayName("Test method2 with condition")
    @Test
    void method2() {
        System.out.println("**--- Test method2 executed ---**");
    }

    @Disabled("implementation pending")
    @Test
    void method3() {
    }

    @AfterEach
    void afterEach() {
        System.out.println("**--- Executed after each test method in this class ---**");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("**--- Executed once after all test methods in this class ---**");
    }
}