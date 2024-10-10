/*public class Inheritance {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}

class Animal{
    String color;
    void eat() {
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swim");
    }
}
class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}

class Dog extends Mammal {
    String bread;
}


class Fish extends Animal {
    int fins;

    void swim(){
        System.out.println("swims in water");
    }
}
*/

//Method Overloading
/*public class Inheritance {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum((float)1.5, (float)2.5));
        System.out.println(calc.sum(1, 2, 3));
    }
}

class Calculator{
    int sum(int a,int b){
        return a+b;

    }
    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b,int c){
        return a+b+c;
    }
}
    */

//method Overriding

public class Inheritance {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("eats anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("eats grass");
    }
}