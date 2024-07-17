
public class MethodOverriding {

    // Method overriding is a feature that allows a subclass to provide a specific implementation of a method that is already provided by its superclass.
    // dynamic polymorphism
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
        Dog d = new Dog();
        d.sound();
        Cat c = new Cat();
        c.sound();
    }

}

class Animal {

    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}
