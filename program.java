// public class problem {
//     // Write a program that prints "Welcome to Bridgelabz!" to the screen.
//     public static void main(String[]args){
//     System.out.println("Welcome to Bridgelabz!");
//     }
// }
// import java.util.*;
// public class problem{
// //     Write a program that takes two numbers as input from the user and prints
// // their sum.
// public static void main(String[] args) {
//     Scanner sc = new Scanner (System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     int sum = a+b ;
//     System.out.println(sum);

// }
// }
// Write a program that takes the temperature in Celsius as input and converts
// it to Fahrenheit using the formula:
// Fahrenheit = (Celsius * 9/5) + 32.
//     import java.util.*;
// //    public class problem{
// //     public static void main(String[]args){
//          Scanner sc = new Scanner (System.in);
//          int celsius = sc.nextInt();
//         int fahrenheit = (celsius * 9/5) + 32;
// //         System.out.println(fahrenheit);
// //     }
// // }
// 4. Area of a Circle
//     import java.util.*;
//    public class problem{
//     public static void main(String[]args){
//         Scanner sc = new Scanner (System.in);
//         int radius = sc.nextInt();
//         double Area = 3.14 * (radius * radius);
//         System.out.println(Area);
//     }
// }
// 5. Volume of a Cylinder
// import java.util.*;
//    public class problem{
//     public static void main(String[]args){
//         Scanner sc = new Scanner (System.in);
//         int radius = sc.nextInt();
//         int height =sc.nextInt();
    
//         double volume = 3.14 * (radius * radius)* height;
//         System.out.println(volume);
//     }
// }
// 1. Calculate Simple Interest
//     import java.util.*;
//    public class problem{
//     public static void main(String[]args){
//         Scanner sc = new Scanner (System.in);
//         int p = sc.nextInt();
//         int r = sc.nextInt();
//         int t = sc.nextInt();
//         double si = (p*r*t)/100;
//         System.out.println(si);
//     }
// }
// 2. Perimeter of a Rectangle
// import java.util.*;
//    public class problem{
//     public static void main(String[]args){
//         Scanner sc = new Scanner (System.in);
//         int l = sc.nextInt();
//         int b = sc.nextInt();
        
//         double perimeter = 2*(l+b);
//         System.out.println(perimeter);
//     }
// }
// 3. Power Calculation
// import java.util.*;
//    public class problem{
//     public static void main(String[]args){
//         Scanner sc = new Scanner (System.in);
//         int base = sc.nextInt();
//         int exponent = sc.nextInt();
        
//         double calculus = base ^ exponent;
//         System.out.println(calculus);
//     }
// }
// import java.util.Scanner;

// public class problem {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         double num1 = sc.nextDouble();
//         System.out.print("Enter second number: ");
//         double num2 = sc.nextDouble();
//         System.out.print("Enter third number: ");
//         double num3 = sc.nextDouble();
//         double average = (num1 + num2 + num3) / 3;
//         System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " is: " + average);

//         sc.close();
//     }
// }
// import java.util.Scanner;

// public class problem{

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter distance in kilometers: ");
//         double kilometers = sc.nextDouble();
//         double miles = kilometers * 0.621371;
//         System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
//         sc.close();
//     }
// }
// import java.util.Scanner;

// 
// import java.util.Scanner;

// public class problem {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);


//         System.out.print("Enter first string: ");
//         String s1 = sc.nextLine();

//         System.out.print("Enter second string: ");
//         String s2 = sc.nextLine();

 
//         boolean isRotation = false;
//         if (s1.length() == s2.length()) {
            
//             String temp = s1 + s1;
//             isRotation = temp.contains(s2);
//         }


//         System.out.println("Is \"" + s2 + "\" a rotation of \"" + s1 + "\"? " + isRotation);

//         sc.close();
//     }
// }

import java.util.Arrays;
import java.util.Scanner;

public class program{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        boolean isAnagram = false;
        if (str1.length() == str2.length()) {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            isAnagram = Arrays.equals(arr1, arr2);
        }
        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" anagrams? " + isAnagram);

        sc.close();
    }
}

