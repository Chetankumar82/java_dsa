// q1 find out the correct statement to assign name to object
// ans-> s.name = "chetan"

/*
 * class Student{
 * String name;
 * int marks;
 * }
 * 
 * public class Question {
 * 
 * public static void main(String[] args) {
 * Student s = new Student();
 * s.name = "chetan";
 * System.out.println(s.name);
 * 
 * }
 * }
 */

// q2 which variable can the class Person access in the following code
// ans:- name, weight
/*
 * class Person{
 * String name;
 * int weight;
 * }
 * 
 * class Student extends Person{
 * int rollNumber;
 * String schoolName;
 * }
 */

/*
 * q3
 * which of the following modifiers are not allowed in front of class
 * a. private
 * b. protected
 * c. public
 * d. default
 * ans:- a, b
 */

/*
 * q4
 * which of the following is a correct statement ? (both classes in the same
 * package)
 * 
 * class Vehicle()
 * class Car extends Vehicle()
 * 
 * 
 * a. Car c = new Car();
 * b. Vehicle v = new Vehicle();
 * c. Vehicle v = new Car();
 * d. Car c = new Vehicle();
 * 
 * answer:- a,b,c
 */

/*
 * q5
 * what will be the output of this code (both classes in the same packages)
 * public class Question {
 * 
 * public static void main(String[] args) {
 * Vehicle obj1 = new Car();
 * obj1.print();
 * 
 * Vehicle obj2 = new Vehicle();
 * obj2.print();
 * 
 * }
 * }
 * 
 * class Vehicle{
 * void print(){
 * System.out.println("Base class(Vehicle)");
 * }
 * }
 * 
 * class Car extends Vehicle{
 * void print(){
 * System.out.println("Derived class(Car)");
 * }
 * }
 */

/*
 * q6
 * what will be the output of this code (both classes in the same packages)
 * public class Question {
 * 
 * public static void main(String[] args) {
 * Vehicle obj1 = new Car();
 * obj1.print1();
 * 
 * Vehicle obj2 = new Vehicle();
 * obj2.print();
 * 
 * }
 * }
 * 
 * class Vehicle{
 * void print(){
 * System.out.println("Base class(Vehicle)");
 * }
 * }
 * 
 * class Car extends Vehicle{
 * void print1(){
 * System.out.println("Derived class(Car)");
 * }
 * }
 */

/*
 * q7
 * Which of the following is not an OOPs component?
 * a. Inheritance
 * b. Encapsulation
 * c. Polymorphism
 * d. Aggregation
 * 
 * answer:- d
 * 
 */

/*
 * q8
 * what will be the output of this code
 * a.Error
 * b. 0 2
 * c. 1 2
 * d. 2 2
 * answer:- b
 * class Book{
 * int price;
 * static int count;
 * 
 * public Book(int price){
 * this.price = price;
 * count++;
 * }
 * }
 * 
 * public class Question {
 * 
 * public static void main(String[] args) {
 * System.out.println(Book.count);
 * Book b1 = new Book(150);
 * Book b2 = new Book(250);
 * System.out.println(Book.count);
 * }
 * }
 * 
 */

/*
q9  which line has error?

class Test {
    static int marks;

    void set_marks(int marks) {
        this.marks = marks;
    }
}

class Question {

    public static void main(String[] args) {
        Test t = new Test();
        t.set_marks((98));
        System.out.println(Test.marks);
    }
}

 */

/*
q10
what would be the output of the following code ?
class Test{
    static int a =10;
    static int b;
    static void changeB() {
        b=a*3;
    }
 }

 
 public class Question {
 public static void main(String[] args) {
    Test t = new Test();
    t.changeB();
    System.out.println(Test.a+Test.b);
 }
    
 }
 */

 