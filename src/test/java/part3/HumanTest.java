package part3;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName(value = "Human tests")
@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
class HumanTest {

    @DisplayName(value = "Get Methods")
    @Test
    void humanBasicTest() {
        Human human = new Human("Zafod", 20, "SubCaptain");
        assertEquals(20, human.getAge());
        assertEquals("Zafod", human.getName());
        assertEquals("SubCaptain", human.getStatus());
    }

    @DisplayName(value = "Screen methods")
    @Test
    void humanAnalyzeTest() {
        Screen screen = new Screen(100,200);
        Screen screen1 = new Screen(200,200);
        screen1.setSpaceShip(new SpaceShip(200, new Position(2.0, 1.0)));
        screen1.addVisiableObject(new Rocket(12, new Position(1.0,2.0), 2));
        Human human = new Human("Ford",20, "Captain");
        assertTrue( human.canAnalyzeScreen(screen));
        assertTrue(human.canAnalyzeScreen(screen1));
        assertFalse(human.canPanic(screen));
        assertTrue(human.canPanic(screen1));
    }


}
