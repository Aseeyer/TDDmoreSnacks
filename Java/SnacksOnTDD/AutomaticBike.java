public class AutomaticBike {
    private boolean isOn;
    private int speed;

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate() {
        if (speed >= 0 && speed <= 20) {
            speed += 1;
        }
    }
}
