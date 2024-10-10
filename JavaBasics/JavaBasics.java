// public class JavaBasics {

//     public static void main(String args[]){

//     System.out.println("****");
//     System.out.println("***");
//     System.out.println("**");
//     System.out.println("*");
//     }
// }
//boilerplate code

// public class JavaBasics {

//     public static void main(String args[]) {
//         int a = 10;
//         int b = 5;
//         System.out.println(a);
//         System.out.println(b);
//         String name = "Tony Stark";
//         System.out.println(name);

//         a = b;
//         System.out.println(a);
//     }
// }

// public class JavaBasics {

//     public static void main(String[] args) {
//         byte b = 8;
//         System.out.println(b);
//         char ch = 'a';
//         System.out.println(ch);
//         boolean var = true;
//         float price = 10.5;
//         int number = 25;
//         //long
//         //double
//         short n = 240;

//     }
// }

// public class JavaBasics {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 5;
//         int sum = a+b;
//         System.out.println(sum);
//     }
// }

// import java.util.*;
// public class JavaBasics {

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
// String input = sc.next();
// System.out.println(input);
// String x = sc.nextLine();
// System.out.println(x);

// int y = sc.nextInt();
// System.out.println(y);

// byte h = sc.nextByte();
// System.out.println(h);

// float x = sc.nextFloat();
// System.out.println(x);

// double y = sc.nextDouble();
// System.out.println(y);

// boolean c = sc.nextBoolean();
// System.out.println(c);

// short x = sc.nextShort();
// System.out.println(x);

// long x = sc.nextLong();
// System.out.println(x);

//     }
// }

// import java.util.*;
// public class JavaBasics {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         // int sum = a + b;
//         int product = a*b;
//         System.out.println(product);
//     }
// }
// import java.util.*;
// public class JavaBasics {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         float rad = sc.nextFloat();
//         float area = 3.14f * rad * rad ;
//         System.out.println(area); 
//     }
// }

// import java.util.*;
// public class JavaBasics {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int A = sc.nextInt();
//         int B = sc.nextInt();
//         int C = sc.nextInt();
//         int average = (A+B+C)/3;
//         System.out.println("average is :" + average); 
//     }
// }

// import java.util.*;
// public class JavaBasics {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         float side = sc.nextFloat();
//         float area = side * side ;
//         System.out.println("area of the square : " + area); 
//     }
// }

// import java.util.*;
// public class JavaBasics {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         float pencil = sc.nextFloat();
//         float pen = sc.nextFloat();
//         float eraser = sc.nextFloat();
//         float cost = pencil + pen + eraser ;
//         System.out.println("total cost : " + cost); 

//         float newtotal = cost + (0.18f*cost);
//         System.out.println("total cost with 18% tax : " + newtotal);
//     }
// }

//Conditional Statement
//print the largest of two number
// public class JavaBasics {

//     public static void main(String[] args) {
//         int A = 10;
//         int B = 5;
//         if(A>=B){
//             System.out.println("A is largest");
//         }
//         else{
//             System.out.println("B is largest");
//         }
//     }
// }

//print if a number is odd or even
// import java.util.*;
// public class JavaBasics {

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         if(number %2 == 0){
//             System.out.println("EVEN");
//         }
//         else{
//             System.out.println("ODD");
//         }
//     }
// }

// public class JavaBasics {

//     public static void main(String[] args) {
//         int age = 17;
//         if(age>=18){
//             System.out.println("Adult");
//         }
//         else if(age>=13 && age<18){
//             System.out.println("Teenager");
//         }
//         else{
//             System.out.println("Child");
//         }
//     }
// }

//Income tax Calculator
// import java.util.*;
// public class JavaBasics {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int income = sc.nextInt();
//         int tax;
//         if(income < 500000){
//             tax = 0;
//         }
//         else if(income >= 500000  &&  income < 1000000){
//             tax=(int) (income*0.2);
//         }
//         else {
//             tax =(int) (income*0.3);
//         }
//         System.out.println("Your tax is: " + tax);
//     }
// }

//Print Largest of 3
// public class JavaBasics {

//     public static void main(String[] args) {
//         int A = 1 , B = 3 , C=6;
//         if((A>=B) && (A>=C)){
//             System.out.println("A is Largest");
//         }
//         else if(B>=C){
//             System.out.println("B is Largest");
//         }
//         else{
//             System.out.println("C is Largest");
//         }
//     }
// }

//ternary operator
// public class JavaBasics {

//     public static void main(String[] args) {
//         int number = 4;
//         String type = (number%2==0)?"even":"odd";

//         System.out.println(type);
//     }
// }

// public class JavaBasics {

//     public static void main(String[] args) {
//         int marks = 74;
//         String ReportCard = marks>=33?"PASS":"FAIL";
//         System.out.println(ReportCard);
//     }
// }

//calculator
// import java.util.*;

// public class JavaBasics {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a : ");
//         int a = sc.nextInt();
//         System.out.println("enter b : ");
//         int b = sc.nextInt();
//         System.out.println("enter operator");
//         char operator = sc.next().charAt(0);

//         switch (operator) {
//             case '+':
//                 System.out.println(a + b);

//                 break;
//             case '-':
//                 System.out.println(a - b);

//                 break;
//             case '*':
//                 System.out.println(a * b);

//                 break;
//             case '/':
//                 System.out.println(a / b);

//                 break;
//             case '%':
//                 System.out.println(a % b);

//                 break;

//             default:
//                 System.out.println("invalid operator");
//                 break;
//         }

//     }
// }

//Question 1 :  WriteaJavaprogramtogetanumberfromtheuserandprintwhether it is positive or negative.

// import java.util.*;
// public class JavaBasics {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Please Enter a Number: ");
//         int number = sc.nextInt();
//         String type = number>0?"POSITIVE":"NEGATIVE or equal to zero";
//         System.out.println(type);
//     }
// }

// Question2: Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever

// public class JavaBasics {
//     public static void main(String[] args) {
//         double temp = 103.5;
//         String type = temp > 100 ? "FEVER" : "NOT FEVER";
//         System.out.println(type);
//     }
// }

// Question3: Write a Java program to input week number(1-7) and print day of weekname using switch case
// import java.util.*;

// public class JavaBasics {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Please enter a number between(1-7)");
//         int week = sc.nextInt();
//         switch (week) {
//             case 1:
//                 System.out.println("SUNDAY");

//                 break;
//             case 2:
//                 System.out.println("MONDAY");

//                 break;
//             case 3:
//                 System.out.println("TUESDAY");

//                 break;
//             case 4:
//                 System.out.println("WEDNESDAY");

//                 break;
//             case 5:
//                 System.out.println("THURSDAY");

//                 break;
//             case 6:
//                 System.out.println("FRIDAY");

//                 break;
//             case 7:
//                 System.out.println("SATURDAY");

//                 break;

//             default:
//                 System.out.println("INVALID NUMBER!!");
//                 break;
//         }
//     }
// }

//Question5: Write a Java program that takes a year from the user and print whether that year is a leap year or not.
import java.util.*;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year: ");
        int year = sc.nextInt();
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));
        if (x && (y || z)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}