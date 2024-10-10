public class Abstract1 {
    public static void main(String[] args) {
        Mustang myHorse = new Mustang();
        
    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("Animal constructor called");
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor() {
        color = "dark brown";
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{
Mustang(){
    System.out.println("Constructor called");
}
}

class Chicken extends Animal {
    void changeColor() {
        color = "yellow";
    }

    void walk() {
        System.out.println("walks on 2 legs");
    }
}
