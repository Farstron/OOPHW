class Animal:
    def __init__(self, height, weight, eye_color):
        self.height = height
        self.weight = weight
        self.eye_color = eye_color

    def make_sound(self):
        pass

    def print_info(self):
        pass


class DomesticAnimal(Animal):
    def __init__(self, height, weight, eye_color, name, birthdate, breed, vaccinated, fur_color):
        super().__init__(height, weight, eye_color)
        self.name = name
        self.birthdate = birthdate
        self.breed = breed
        self.vaccinated = vaccinated
        self.fur_color = fur_color

    def show_affection(self):
        pass


class Cat(DomesticAnimal):
    def __init__(self, height, weight, eye_color, name, birthdate, breed, vaccinated, fur_color):
        super().__init__(height, weight, eye_color, name, birthdate, breed, vaccinated, fur_color)

    def make_sound(self):
        print("Meow!")

    def print_info(self):
        print("Height: {:.2f} m".format(self.height))
        print("Weight: {:.2f} kg".format(self.weight))
        print("Eye color: {}".format(self.eye_color))
        print("Name: {}".format(self.name))
        print("Breed: {}".format(self.breed))
        print("Vaccinated: {}".format(self.vaccinated))
        print("Fur color: {}".format(self.fur_color))
        print("Birthdate: {}".format(self.birthdate))

    def show_affection(self):
        print("{} purrs and rubs against your leg".format(self.name))


class Dog(DomesticAnimal):
    def __init__(self, height, weight, eye_color, name, birthdate, breed, vaccinated, fur_color):
        super().__init__(height, weight, eye_color, name, birthdate, breed, vaccinated, fur_color)

    def make_sound(self):
        print("Woof!")

    def print_info(self):
        print("Height: {:.2f} m".format(self.height))
        print("Weight: {:.2f} kg".format(self.weight))
        print("Eye color: {}".format(self.eye_color))
        print("Name: {}".format(self.name))
        print("Breed: {}".format(self.breed))
        print("Vaccinated: {}".format(self.vaccinated))
        print("Fur color: {}".format(self.fur_color))
        print("Birthdate: {}".format(self.birthdate))

    def show_affection(self):
        print("{} wags its tail and licks your face".format(self.name))


class WildAnimal(Animal):
    def __init__(self, height, weight, eye_color, habitat, discovery_date):
        super().__init__(height, weight, eye_color)
        self.habitat = habitat
        self.discovery_date = discovery_date


class Tiger(WildAnimal):
    def __init__(self, height, weight, eye_color, habitat, discovery_date):
        super().__init__(height, weight, eye_color, habitat, discovery_date)

    def make_sound(self):
        print("Roar!")

    def print_info(self):
        print("Height: {:.2f} m".format(self.height))
        print("Weight: {:.2f} kg".format(self.weight))
        print("Eye color: {}".format(self.eye_color))
        print("Habitat: {}".format(self.habitat))
        print("Discovery date: {}".format(self.discovery_date))


class Wolf(WildAnimal):
    def __init__(self, height, weight, eye_color, habitat, discovery_date):
        super().__init__(height, weight, eye_color, habitat, discovery_date)

    def make_sound(self):
        print("Howl!")

    def print_info(self):
        print("Height: {:.2f} m".format(self.height))
        print("Weight: {:.2f} kg".format(self.weight))
        print("Eye color: {}".format(self.eye_color))
        print("Habitat: {}".format(self.habitat))
        print("Discovery date: {}".format(self.discovery_date))


class Bird(Animal):
    def __init__(self, height, weight, eye_color, flight_speed):
        super().__init__(height, weight, eye_color)
        self.flight_speed = flight_speed

    def fly(self):
        pass

    def make_sound(self):
        pass

    def print_info(self):
        pass


class Chicken(Bird):
    def __init__(self, height, weight, eye_color, flight_speed):
        super().__init__(height, weight, eye_color, flight_speed)

    def fly(self):
        print("Flies low to the ground")

    def make_sound(self):
        print("Cluck cluck!")

    def print_info(self):
        print("Height: {:.2f} m".format(self.height))
        print("Weight: {:.2f} kg".format(self.weight))
        print("Eye color: {}".format(self.eye_color))
        print("Flight speed: {:.2f} m/s".format(self.flight_speed))


class Stork(Bird):
    def __init__(self, height, weight, eye_color, flight_speed):
        super().__init__(height, weight, eye_color, flight_speed)

    def fly(self):
        print("Flies high in the sky")

    def make_sound(self):
        print("Clatter clatter!")

    def print_info(self):
        print("Height: {:.2f} m".format(self.height))
        print("Weight: {:.2f} kg".format(self.weight))
        print("Eye color: {}".format(self.eye_color))
        print("Flight speed: {:.2f} m/s".format(self.flight_speed))


class Zoo:
    def __init__(self):
        self.animals = []

    def add_animal(self, animal):
        self.animals.append(animal)

    def remove_animal(self, index):
        return self.animals.pop(index)

    def print_all_animals(self):
        for animal in self.animals:
            animal.print_info()

    def make_all_sounds(self):
        for animal in self.animals:
            animal.make_sound()


# Create a zoo and add some animals
zoo = Zoo()
zoo.add_animal(Cat(0.3, 4.0, "green", "Whiskers", "05/06/2018", "Siamese", True, "gray"))
zoo.add_animal(Dog(0.6, 10.0, "brown", "Fido", "12/03/2015", "Golden Retriever", True, "golden"))
zoo.add_animal(Tiger(1.5, 150.0, "blue", "India", "08/10/2020"))
zoo.add_animal(Wolf(0.8, 50.0, "yellow", "Canada", "03/04/2019"))
zoo.add_animal(Chicken(0.2, 1.0, "black", 3.0))
zoo.add_animal(Stork(1.3, 3.0, "white", 10.0))

# Print information about all animals
zoo.print_all_animals()

# Make all animals in the zoo make a sound
zoo.make_all_sounds()

# Have the cat and dog show affection
cat = zoo.remove_animal(1)
cat.show_affection()
dog = zoo.remove_animal(0)
dog.show_affection()

# Print information about the remaining animals
zoo.print_all_animals()