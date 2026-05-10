public class AirConditioner {

    private boolean isOn;
    private int temperature;

    public AirConditioner() {
        isOn = false;
        temperature = 16;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("AC is ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("AC is OFF");
    }

    public void increaseTemperature() {

        if (isOn) {

            if (temperature < 30) {
                temperature++;
            }

            else {
                System.out.println("Maximum temperature reached");
            }
        }

        else {
            System.out.println("AC is OFF");
        }
    }

    public void decreaseTemperature() {

        if (isOn) {

            if (temperature > 16) {
                temperature--;
            }

            else {
                System.out.println("Minimum temperature reached");
            }
        }

        else {
            System.out.println("AC is OFF");
        }
    }

    public void displayTemperature() {
        System.out.println("Temperature: " + temperature);
    }

    public static void main(String[] args) {

        AirConditioner ac = new AirConditioner();

        ac.turnOn();

        ac.displayTemperature();

        ac.increaseTemperature();
        ac.displayTemperature();

        ac.decreaseTemperature();
        ac.displayTemperature();

        ac.turnOff();
    }
}