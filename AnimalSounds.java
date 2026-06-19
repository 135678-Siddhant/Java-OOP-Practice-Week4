class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound...");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog: Woof Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat: Meow!");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cow: Moo!");
    }
}

public class AnimalSounds {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat(), new Cow() };

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}