class Bike:

    def __init__(self):
        self.is_on = False
        self.speed = 0

    def turn_on(self):
        self.is_on = True
        print("Bike is ON")

    def turn_off(self):
        self.is_on = False
        print("Bike is OFF")

    def accelerate(self):

        if self.is_on:

            if self.speed >= 0 and self.speed <= 20:
                self.speed += 1

            elif self.speed >= 21 and self.speed <= 30:
                self.speed += 2

            elif self.speed >= 31 and self.speed <= 40:
                self.speed += 3

            else:
                self.speed += 4

        else:
            print("Bike is OFF")

    def brake(self):

        if self.is_on:

            if self.speed >= 0 and self.speed <= 20:
                self.speed -= 1

            elif self.speed >= 21 and self.speed <= 30:
                self.speed -= 2

            elif self.speed >= 31 and self.speed <= 40:
                self.speed -= 3

            else:
                self.speed -= 4

            if self.speed < 0:
                self.speed = 0

        else:
            print("Bike is OFF")

    def display_speed(self):
        print("Current speed:", self.speed)


bike = Bike()

bike.turn_on()

bike.accelerate()
bike.display_speed()

bike.accelerate()
bike.display_speed()

bike.brake()
bike.display_speed()

bike.turn_off()