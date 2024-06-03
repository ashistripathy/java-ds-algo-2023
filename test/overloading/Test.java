package overloading;

class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bark! Bark!");
    }
}

class Labrador extends Dog {
    public void makeSound() {
        System.out.println("Labrador is barking");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal a = new Labrador();
        a.makeSound();
    }
}
