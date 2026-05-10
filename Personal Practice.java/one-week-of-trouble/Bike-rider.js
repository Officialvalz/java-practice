class Bike {

    constructor() {
        this.isOn = false;
        this.speed = 0;
    }

    turnOn() {
        this.isOn = true;
        console.log("Bike is ON");
    }

    turnOff() {
        this.isOn = false;
        console.log("Bike is OFF");
    }

    accelerate() {

        if (this.isOn) {

            if (this.speed >= 0 && this.speed <= 20) {
                this.speed += 1;
            }

            else if (this.speed >= 21 && this.speed <= 30) {
                this.speed += 2;
            }

            else if (this.speed >= 31 && this.speed <= 40) {
                this.speed += 3;
            }

            else {
                this.speed += 4;
            }
        }

        else {
            console.log("Bike is OFF");
        }
    }

    brake() {

        if (this.isOn) {

            if (this.speed >= 0 && this.speed <= 20) {
                this.speed -= 1;
            }

            else if (this.speed >= 21 && this.speed <= 30) {
                this.speed -= 2;
            }

            else if (this.speed >= 31 && this.speed <= 40) {
                this.speed -= 3;
            }

            else {
                this.speed -= 4;
            }

            if (this.speed < 0) {
                this.speed = 0;
            }
        }

        else {
            console.log("Bike is OFF");
        }
    }

    displaySpeed() {
        console.log("Current speed:", this.speed);
    }
}

let bike = new Bike();

bike.turnOn();

bike.accelerate();
bike.displaySpeed();

bike.accelerate();
bike.displaySpeed();

bike.brake();
bike.displaySpeed();

bike.turnOff();