// import java.util.*;
// public class JavaBasics {

//     public static void main(String[] args) {
//         int counter = 0;
//         while (counter<100) {
//             System.out.println("Hello World");
//             counter++;

//         }
//         System.out.println("Successfully Print Hello World");
//     }
// }

// infinite loop
// public class JavaBasics {

//     public static void main(String[] args) {
//         int counter = 0;
//         while (true) {
//             System.out.println("Hello World");
//             counter++;

//         }
//         System.out.println("Successfully Print Hello World");
//     }
// }

//print number from 1 to 10
// public class JavaBasics {

//     public static void main(String[] args) {
//         int counter = 1;
//         while (counter<=100) {
//             System.out.print(counter+" ");
//             counter++;

//         }
//     }
// }

// print number from 1 to n
// import java.util.*;
// public class JavaBasics {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("please Enter range:");
//         int range = sc.nextInt();
//         int counter = 1;
//         while (counter<=range) {
//             System.out.print(counter + " ");
//             counter++;
//         }

//     }
// }

//print sum of first n natural numbers
// import java.util.*;
// public class JavaBasics {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         int i = 1;
//         while (i<=n) {
//             sum = sum+i;
//             i++;
//         }
//         System.out.println("sum of first n natural number is: " + sum);

//     }
// }

//for loop
//square pattern
// public class JavaBasics {

//     public static void main(String[] args) {
//         for(int line = 1; line<=4;line++){
//             System.out.println("****");
//         }
//     }
// }

//print reverse of a number
// import java.util.*;
// public class JavaBasics {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         while (n>0) {
//             int lastDigit = n%10;
//             System.out.print(lastDigit);
//             n = n/10;

//         }
//         System.out.println();
//     }
// }

//Reverse the given number 

// public class JavaBasics {

//     public static void main(String[] args) {
//         int n = 10899;
//         int rev = 0;
//         while (n>0) {
//             int lastDigit = n%10;
//             rev = (rev*10)+lastDigit;
//             n = n/10;

//         }
//         System.out.println(rev);
//     }
// }

// keep entering numbers till user enter  a multiple of 10

// import java.util.*;
// public class JavaBasics {

//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//         
//         do{
// System.out.println("Enter a Number");
//             int n = sc.nextInt();
//             if(n%10==0){
//                 break;
//             }
//             System.out.println("Your number was : " + n);
//         } while(true);
//     }
// }

// import java.util.*;
// public class JavaBasics {

//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);

//         do{
//             System.out.println("Enter a Number");
//             int n = sc.nextInt();
//             if(n%10==0){
//                 continue;
//             }
//             System.out.println("Your number was : " + n);
//         } while(true);
//     }
// }

//check if a number is prime or not
// import java.util.*;
// public class JavaBasics {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         if(n==2){
//             System.out.println(n+" is a prime number");
//         }
//         else{
//             boolean isPrime = true;
//             for(int i = 2;i<=n-1;i++){
//                 if(n%i==0){
//                     isPrime=false;
//                 }

//             }
//             if(isPrime==true){
//                 System.out.println(n+ " is prime");
//             }
//             else{
//                 System.out.println(n + " is not prime");
//             }
//         }
//     }
// }

//optimized code  above code is takes n-2
// import java.util.*;
// public class JavaBasics {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         if(n==2){
//             System.out.println(n+" is a prime number");
//         }
//         else{
//             boolean isPrime = true;
//             for(int i = 2;i<Math.sqrt(n);i++){
//                 if(n%i==0){
//                     isPrime=false;
//                 }

//             }
//             if(isPrime==true){
//                 System.out.println(n+ " is prime");
//             }
//             else{
//                 System.out.println(n + " is not prime");
//             }
//         }
//     }
// }

//Question 2 : Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

// import java.util.Scanner;

// public class JavaBasics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int number;
//         int choice;
//         int evenSum = 0;
//         int oddSum = 0;
//         do {
//             System.out.print("Enter the number ");
//             number = sc.nextInt();
//             if (number % 2 == 0) {
//                 evenSum += number;
//             } else {
//                 oddSum += number;
//             }
//             System.out.print("Do you want to continue? Press 1 for yes or 0 for no");
//             choice = sc.nextInt();
//         } while (choice == 1);
//         System.out.println("Sum of even numbers: " + evenSum);
//         System.out.println("Sum of odd numbers: " + oddSum);
//     }
// }

//Question 3 : Write a program to find the factorial of any number entered by the user.

// import java.util.Scanner;

// public class JavaBasics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num; // To hold number
//         int fact = 1; // To hold factorial
//         System.out.print("Enter any positive integer: ");
//         num = sc.nextInt();
//         for (int i = 1; i <= num; i++) {
//             fact *= i;
//         }
//         System.out.println("Factorial: " + fact);
//     }
// }

//Question 4 : Write a program to print the multiplication table of a number N, entered by the user.
// import java.util.*;

// class JavaBasics {
//     public static void printMultiplicationTable(int number) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number:");
//         int n = sc.nextInt();
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(n + " * " + i + " = " + n * i);
//         }
//     }

//     public static void main(String s[]) {
//         printMultiplicationTable(5);
//     }
// }




//patterns

//1. star pattern
// public class JavaBasics {

//     public static void main(String[] args) {
//         for(int line = 1;line<=4;line++){
//             for(int star=1;star<=line; star++ ){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }




//2. print inverted star pattern
// import java.util.*;
// public class JavaBasics {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number of lines to be in Inverted Star Pattern: ");
//         int n = sc.nextInt();
//         for(int line = 1;line<=n;line++){
//             for(int star = 1;star<=(n-line+1);star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }





//3.print half pyramid pattern
// import java.util.*;
// public class JavaBasics {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a Number: ");
//         int n = sc.nextInt();
//         System.out.println("pattern");
//         for(int line = 1 ; line<=n;line++){
//             for(int number= 1 ; number<=line;number++){
//                 System.out.print(number + " ");
//             }
//             System.out.println();
//         }
//     }
// }



//print character pattern
import java.util.*;
public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        char ch = 'A';
        for(int line = 1 ; line<=n;line++){
            for (int chars=1;chars<=line;chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}