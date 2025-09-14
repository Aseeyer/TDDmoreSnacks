import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AutomaticBikeTest {
    @Test
    public void testThatBikeIsOffByDefault() {
        AutomaticBike bike = new AutomaticBike();
        assertFalse(bike.isOn());
    }

    @Test
    public void testThatBikeCanBeTurnedOn() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        assertTrue(bike.isOn());
    }

    @Test
    public void testThatBikeCanBeTurnedOff() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        bike.turnOff();
        assertFalse(bike.isOn());
    }

    @Test
    public void testThatBikeCanBeAccelerated() {
        AutomaticBike bike = new AutomaticBike();
        bike.setSpeed(15);
        bike.accelerate();
        assertEquals(16, bike.getSpeed());
    }

}