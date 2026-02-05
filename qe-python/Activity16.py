
class Car:
    def __init__(self, manufacture, model, make, transmission, color):
        self.manufacture = manufacture
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(f"{self.manufacture} {self.model} is moving")

    def stop(self):
        print(f"{self.manufacture} {self.model} has stopped")


car1 = Car("Toyota", "Innova", 2022, "Automatic", "White")
car2 = Car("Honda", "City", 2021, "Manual", "Black")
car3 = Car("Hyundai", "Creta", 2023, "Automatic", "Blue")

car1.accelerate()
car1.stop()

car2.accelerate()
car2.stop()

car3.accelerate()
car3.stop()
