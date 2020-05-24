package Junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JunitExceptionTest {

    @Test
    void testException() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("Illegal Argument Exception occured");
        });
        assertEquals("Illegal Argument Exception occured", exception.getMessage());
    }
}