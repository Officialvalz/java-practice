public class Bike {

    private boolean isOn;
    private int speed;

    public Bike() {
        isOn = false;
        speed = 0;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Bike is ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Bike is OFF");
    }

    public void accelerate() {

        if (isOn) {

            if (speed >= 0 && speed <= 20) {
                speed += 1;
            }

            else if (speed >= 21 && speed <= 30) {
                speed += 2;
            }

            else if (speed >= 31 && speed <= 40) {
                speed += 3;
            }

            else {
                speed += 4;
            }
        }

        else {
            System.out.println("Bike is OFF");
        }
    }

    public void brake() {

        if (isOn) {

            if (speed >= 0 && speed <= 20) {
                speed -= 1;
            }

            else if (speed >= 21 && speed <= 30) {
                speed -= 2;
            }

            else if (speed >= 31 && speed <= 40) {
                speed -= 3;
            }

            else {
                speed -= 4;
            }

            if (speed < 0) {
                speed = 0;
            }
        }

        else {
            System.out.println("Bike is OFF");
        }
    }

    public void displaySpeed() {
        System.out.println("Current speed: " + speed);
    }

    public static void main(String[] args) {

        Bike bike = new Bike();

        bike.turnOn();

        bike.accelerate();
        bike.displaySpeed();

        bike.accelerate();
        bike.displaySpeed();

        bike.brake();
        bike.displaySpeed();

        bike.turnOff();
    }
}