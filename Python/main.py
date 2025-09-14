class AutomaticBike:
    def __init__(self):
        self.is_on = False
        self.speed = 0

    def is_on_state(self):
        return self.is_on

    def turn_on(self):
        self.is_on = True

    def turn_off(self):
        self.is_on = False

    def set_speed(self, speed):
        self.speed = speed

    def get_speed(self):
        return self.speed

    def __get_increment(self):
        if self.speed <= 20:
            return 1
        elif self.speed <= 30:
            return 2
        elif self.speed <= 40:
            return 3
        else:
            return 4

    def accelerate(self):
        if self.is_on:
            self.speed += self.__get_increment()

    def decelerate(self):
        if self.is_on:
            self.speed = max(0, self.speed - self.__get_increment())
