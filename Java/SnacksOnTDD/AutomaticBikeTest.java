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
        bike.turnOn();
        bike.setSpeed(15);
        bike.accelerate();
        assertEquals(16, bike.getSpeed());
    }

    @Test
    public void testThatBikeCanAccelerateInGearTwo() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        bike.setSpeed(24);
        bike.accelerate();
        assertEquals(26, bike.getSpeed());
    }

    @Test
    public void testThatBikeCanBeAccelerateInGearThree() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        bike.setSpeed(36);
        bike.accelerate();
        assertEquals(39, bike.getSpeed());
    }

    @Test
    public void testThatBikeCanBeAccelerateInGearFour() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOff();
        bike.setSpeed(44);
        bike.accelerate();
        assertEquals(48, bike.getSpeed());
    }

    @Test
    public void testThatBikeCanDecelerateInGearOne() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        bike.setSpeed(15);
        bike.decelerate();
        assertEquals(14, bike.getSpeed());
    }

    @Test
    public void testThatBikeCanDecelerateInGearTwo() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        bike.setSpeed(24);
        bike.decelerate();
        assertEquals(22, bike.getSpeed());
    }

    @Test
    public void testThatBikeCanDecelerateInGearThree() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        bike.setSpeed(36);
        bike.decelerate();
        assertEquals(33, bike.getSpeed());
    }

    @Test
    public void testThatBikeCanDecelerateInGearFour() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        bike.setSpeed(44);
        bike.decelerate();
        assertEquals(40, bike.getSpeed());
    }

}