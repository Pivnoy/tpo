package part3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName(value = "PositionTests")
@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
class PositionTest {

    @Test
    void positionBasicTest() {
        Position position = new Position(1.0, 2.9);
        assertEquals(1.0, position.getX());
        assertEquals(2.9, position.getY());
    }
}
