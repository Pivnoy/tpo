package part3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName(value = "Rocket test")
@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
class RocketTest {

    @Test
    void basicRocketTest() {
        Rocket rocket = new Rocket(300, new Position(1.0, 2.0), 23);
        assertEquals(1.0, rocket.getPosition().getX());
        assertEquals(23, rocket.getFuel());
        assertEquals(300, rocket.getDamage());
    }

    @Test
    void rocketAttackTest(){
        Rocket rocket = new Rocket(200, new Position(1.0, 2.0), 23);
        assertTrue(rocket.isMove());
        SpaceShip spaceShip = new SpaceShip(250, new Position(1.0,2.0));
        SpaceShip spaceShip1 = new SpaceShip(300,new Position(40.0,33.0));
        assertTrue(rocket.canAttack(spaceShip));
        assertFalse(rocket.canAttack(spaceShip1));
        assertTrue(rocket.attack(spaceShip));
        assertFalse(rocket.attack(spaceShip1));
        assertEquals(50, spaceShip.getStrength());
        Rocket rocket1 = new Rocket(20, new Position(2.0, 3.0), 25);
    }
}
