import unittest
from main import AutomaticBike


class TestAutomaticBike(unittest.TestCase):

    def test_bike_is_off_by_default(self):
        bike = AutomaticBike()
        self.assertFalse(bike.is_on_state())

    def test_bike_can_be_turned_on(self):
        bike = AutomaticBike()
        bike.turn_on()
        self.assertTrue(bike.is_on_state())

    def test_bike_can_be_turned_off(self):
        bike = AutomaticBike()
        bike.turn_on()
        bike.turn_off()
        self.assertFalse(bike.is_on_state())

    def test_bike_can_be_accelerated(self):
        bike = AutomaticBike()
        bike.turn_on()
        bike.set_speed(15)
        bike.accelerate()
        self.assertEqual(16, bike.get_speed())

    def test_bike_can_accelerate_in_gear_two(self):
        bike = AutomaticBike()
        bike.turn_on()
        bike.set_speed(24)
        bike.accelerate()
        self.assertEqual(26, bike.get_speed())

    def test_bike_can_accelerate_in_gear_three(self):
        bike = AutomaticBike()
        bike.turn_on()
        bike.set_speed(36)
        bike.accelerate()
        self.assertEqual(39, bike.get_speed())

    def test_bike_can_accelerate_in_gear_four(self):
        bike = AutomaticBike()
        bike.turn_on()
        bike.set_speed(44)
        bike.accelerate()
        self.assertEqual(48, bike.get_speed())

    def test_bike_can_decelerate_in_gear_one(self):
        bike = AutomaticBike()
        bike.turn_on()
        bike.set_speed(15)
        bike.decelerate()
        self.assertEqual(14, bike.get_speed())

    def test_bike_can_decelerate_in_gear_two(self):
        bike = AutomaticBike()
        bike.turn_on()
        bike.set_speed(24)
        bike.decelerate()
        self.assertEqual(22, bike.get_speed())

    def test_bike_can_decelerate_in_gear_three(self):
        bike = AutomaticBike()
        bike.turn_on()
        bike.set_speed(36)
        bike.decelerate()
        self.assertEqual(33, bike.get_speed())

    def test_bike_can_decelerate_in_gear_four(self):
        bike = AutomaticBike()
        bike.turn_on()
        bike.set_speed(44)
        bike.decelerate()
        self.assertEqual(40, bike.get_speed())


if __name__ == '__main__':
    unittest.main()
