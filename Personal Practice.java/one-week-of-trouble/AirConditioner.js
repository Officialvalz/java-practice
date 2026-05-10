class AirConditioner {

    constructor() {
        this.isOn = false;
        this.temperature = 16;
    }

    turnOn() {
        this.isOn = true;
        console.log("AC is ON");
    }

    turnOff() {
        this.isOn = false;
        console.log("AC is OFF");
    }

    increaseTemperature() {

        if (this.isOn) {

            if (this.temperature < 30) {
                this.temperature++;
            }

            else {
                console.log("Maximum temperature reached");
            }
        }

        else {
            console.log("AC is OFF");
        }
    }

    decreaseTemperature() {

        if (this.isOn) {

            if (this.temperature > 16) {
                this.temperature--;
            }

            else {
                console.log("Minimum temperature reached");
            }
        }

        else {
            console.log("AC is OFF");
        }
    }

    displayTemperature() {
        console.log("Temperature:", this.temperature);
    }
}

let ac = new AirConditioner();

ac.turnOn();

ac.displayTemperature();

ac.increaseTemperature();
ac.displayTemperature();

ac.decreaseTemperature();
ac.displayTemperature();

ac.turnOff();