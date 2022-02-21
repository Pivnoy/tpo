package part3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName(value = "Screen tests")
@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
class ScreenTest {

    @Test
    void basicScreenTest() {
        Screen screen = new Screen(100,200);
        assertEquals(100, screen.getWidth());
        assertEquals(200, screen.getHeight());
    }

    @Test
    void screenVisibleObjects() {
        Screen screen = new Screen(200,200);
        Screen screen1 = new Screen(500, 500);
        Rocket rocket = new Rocket(23, new Position(1.0,2.0), 23);
        SpaceShip spaceShip = new SpaceShip(400, new Position(1,2));
        assertTrue(screen.addVisiableObject(rocket));
        assertEquals(2, screen.getObjectCountFromScreen());
        screen.setSpaceShip(spaceShip);
        assertTrue(screen.isDangerous());
        assertTrue(screen.getDescription());
        assertFalse(screen1.getDescription());
        Rocket rocket1 = new Rocket(23, new Position(2.9, 4.9), 25);
        SpaceShip spaceShip1 = new SpaceShip(400, new Position(34.9, 23.9));
        screen1.setSpaceShip(spaceShip1);
        assertFalse(screen1.isDangerous());
        screen1.addVisiableObject(rocket1);
    }
}
