package part3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName(value = "SpaceShip tests")
@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
class SpaceShipTest {

    @Test
    void basicSpaceShipTest() {
        SpaceShip spaceShip = new SpaceShip(20, new Position(1.0, 2.0));
        assertTrue(spaceShip.isMove());
        assertEquals(20,spaceShip.getStrength());
        assertEquals(1.0, spaceShip.getPosition().getX());
        assertEquals(2.0, spaceShip.getPosition().getY());
    }

    @Test
    void floatingSpaceShipTest(){
        SpaceShip spaceShip = new SpaceShip(40, new Position(2.9, 3.9));
        assertTrue(spaceShip.isAlive());
        spaceShip.howDisplayedOnScreen();
        Rocket rocket = new Rocket(300, new Position(2.9, 3.9), 23);
        rocket.attack(spaceShip);
        assertFalse(spaceShip.isAlive());
    }
}
