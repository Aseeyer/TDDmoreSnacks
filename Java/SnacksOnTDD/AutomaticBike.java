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

    private int getIncrement() {
        if (speed <= 20) return 1;
        else if (speed <= 30) return 2;
        else if (speed <= 40) return 3;
        else return 4;
    }

    public void accelerate() {
        if (isOn) speed += getIncrement();
    }

    public void decelerate() {
        if (isOn) speed = Math.max(0, speed - getIncrement());
    }
}
