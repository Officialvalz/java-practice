class AirConditioner:

    def __init__(self):
        self.is_on = False
        self.temperature = 16

    def turn_on(self):
        self.is_on = True
        print("AC is ON")

    def turn_off(self):
        self.is_on = False
        print("AC is OFF")

    def increase_temperature(self):

        if self.is_on:

            if self.temperature < 30:
                self.temperature += 1

            else:
                print("Maximum temperature reached")

        else:
            print("AC is OFF")

    def decrease_temperature(self):

        if self.is_on:

            if self.temperature > 16:
                self.temperature -= 1

            else:
                print("Minimum temperature reached")

        else:
            print("AC is OFF")

    def display_temperature(self):
        print("Temperature:", self.temperature)


ac = AirConditioner()

ac.turn_on()

ac.display_temperature()

ac.increase_temperature()
ac.display_temperature()

ac.decrease_temperature()
ac.display_temperature()

ac.turn_off()