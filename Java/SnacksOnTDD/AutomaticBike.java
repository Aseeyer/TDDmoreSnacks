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
        else if (speed >= 21 && speed <= 30) {
            speed += 2;
        }
        else if (speed >= 31 &&  speed <= 40) {
            speed += 3;
        }
        else if (speed >= 41 && speed <= 50) {
            speed += 4;
        }
    }

    public void decelerate() {
        if (speed >= 0 && speed <= 20) {
            speed = Math.max(0, speed - 1);
        }
        else if (speed >= 21 && speed <= 30) {
            speed = Math.max(0, speed - 2);
        }
        else if (speed >= 31 && speed <= 40) {
            speed = Math.max(0, speed - 3);
        }
        else if (speed >= 41 && speed <= 50) {
            speed = Math.max(0, speed - 4);
        }
    }
}
