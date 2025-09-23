import java.util.Scanner;
public class javacontrol {
public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number % 5 == 0) {
            System.out.println("Is the number " + number + " divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + number + " divisible by 5? No");
        }

        sc.close();
    }
}

}
// import java.util.Scanner;

// public class javacontrol {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int number1 = sc.nextInt();
//         System.out.print("Enter second number: ");
//         int number2 = sc.nextInt();
//         System.out.print("Enter third number: ");
//         int number3 = sc.nextInt();
//         if (number1 < number2 && number1 < number3) {
//             System.out.println("Is the first number the smallest? Yes");
//         } else {
//             System.out.println("Is the first number the smallest? No");
//         }

//         sc.close();
//     }
// }
// import java.util.Scanner;

// public class javacontrol{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int number1 = sc.nextInt();
//         System.out.print("Enter second number: ");
//         int number2 = sc.nextInt();
//         System.out.print("Enter third number: ");
//         int number3 = sc.nextInt();
//         boolean firstLargest = (number1 > number2 && number1 > number3);
//         boolean secondLargest = (number2 > number1 && number2 > number3);
//         boolean thirdLargest = (number3 > number1 && number3 > number2);
//         System.out.println("Is the first number the largest? " + (firstLargest ? "Yes" : "No"));
//         System.out.println("Is the second number the largest? " + (secondLargest ? "Yes" : "No"));
//         System.out.println("Is the third number the largest? " + (thirdLargest ? "Yes" : "No"));
//         sc.close();
//     }
// }
// import java.util.Scanner;

// public class javacontrol{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();
//         if (number >= 1) {
//             int sum = number * (number + 1) / 2;
//             System.out.println("The sum of " + number + " natural numbers is " + sum);
//         } else {
//             System.out.println("The number " + number + " is not a natural number");
//         }

//         sc.close();
//     }
// }

// import java.util.Scanner;

// public class javacontrol {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the person's age: ");
//         int age = sc.nextInt();
//         if (age >= 18) {
//             System.out.println("The person's age is " + age + " and can vote.");
//         } else {
//             System.out.println("The person's age is " + age + " and cannot vote.");
//         }

//         sc.close();
//     }
// }

// import java.util.Scanner;

// public class javacontrol {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();
//         if (number > 0) {
//             System.out.println("The number is positive.");
//         } else if (number < 0) {
//             System.out.println("The number is negative.");
//         } else {
//             System.out.println("The number is zero.");
//         }

//         sc.close();
//     }
// }
// public class javacontrol {
//     public static void main(String[] args) {
//         int month = Integer.parseInt(args[0]);
//         int day = Integer.parseInt(args[1]);
//         boolean isSpring = (month == 3 && day >= 20 && day <= 31)  // March 20–31
//                         || (month == 4 && day >= 1 && day <= 30)   // April
//                         || (month == 5 && day >= 1 && day <= 31)   // May
//                         || (month == 6 && day >= 1 && day <= 20);  // June 1–20

//         if (isSpring) {
//             System.out.println("Its a Spring Season");
//         } else {
//             System.out.println("Not a Spring Season");
//         }
//     }
// }
// import java.util.Scanner;

// public class javacontrol {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the countdown start value: ");
//         int counter = sc.nextInt();
//         while (counter >= 1) {
//             System.out.println(counter);
//             counter--; // decrement
//         }
//         System.out.println("Lift Off! 🚀");

//         sc.close();
//     }
// }

// import java.util.Scanner;

// public class javacontrol {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the countdown start value: ");
//         int counter = sc.nextInt();
//         for (int i = counter; i >= 1; i--) {
//             System.out.println(i);
//         }
//         System.out.println("Lift Off! 🚀");

//         sc.close();
//     }
// }

// import java.util.Scanner;

// public class javacontrol {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         double total = 0.0;  // to store the sum
//         double number;       // user input
//         System.out.print("Enter a number (0 to stop): ");
//         number = sc.nextDouble();
//         while (number != 0) {
//             total += number; // add to total
//             System.out.print("Enter a number (0 to stop): ");
//             number = sc.nextDouble();
//         }
//         System.out.println("The total sum is " + total);

//         sc.close();
//     }
// }

// import java.util.Scanner;

// public class javacontrol {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         double total = 0.0;  

//         while (true) { 
//             System.out.print("Enter a number (0 or negative to stop): ");
//             double number = sc.nextDouble();

//             if (number <= 0) { 
//                 break;
//             }

//             total += number; 
//         }
//         System.out.println("The total sum is " + total);

//         sc.close();
//     }
// }
// import java.util.Scanner;

// public class javacontrol {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a natural number: ");
//         int n = sc.nextInt();

//         if (n <= 0) {
//             System.out.println("The number " + n + " is not a natural number.");
//         } else {
//             int sumWhile = 0;
//             int counter = 1;
//             while (counter <= n) {
//                 sumWhile += counter;
//                 counter++;
//             }
//             int sumFormula = n * (n + 1) / 2;
//             System.out.println("Sum of " + n + " natural numbers using while loop: " + sumWhile);
//             System.out.println("Sum of " + n + " natural numbers using formula: " + sumFormula);
//             if (sumWhile == sumFormula) {
//                 System.out.println("✅ Both computations match and are correct.");
//             } else {
//                 System.out.println("❌ Results do not match. Check logic.");
//             }
//         }

//         sc.close();
//     }
// }

// import java.util.Scanner;

// public class javacontrol {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a positive integer: ");
//         int n = sc.nextInt();

//         if (n < 0) {
//             System.out.println("Factorial is not defined for negative numbers.");
//         } else {
//             long factorial = 1;
//             int i = 1;
//             while (i <= n) {
//                 factorial *= i;
//                 i++;
//             }

//             System.out.println("Factorial of " + n + " is " + factorial);
//         }

//         sc.close();
//     }
// }

// import java.util.Scanner;
// public class javacontrol {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a natural number: ");
//         int number = sc.nextInt();

//         if (number <= 0) {
//             System.out.println("The number " + number + " is not a natural number.");
//         } else {
//             for (int i = 1; i <= number; i++) {
//                 if (i % 2 == 0) {
//                     System.out.println(i + " is an even number.");
//                 } else {
//                     System.out.println(i + " is an odd number.");
//                 }
//             }
//         }

//         sc.close();
//     }
// }

// import java.util.Scanner;
// public class javacontrol {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter employee salary: ");
//         double salary = sc.nextDouble();
//         System.out.print("Enter years of service: ");
//         int years = sc.nextInt();
//         double bonus = 0.0;
//         if (years > 5) {
//             bonus = salary * 0.05; 
//             System.out.println("Bonus amount is: " + bonus);
//         } else {
//             System.out.println("No bonus. Years of service less than or equal to 5.");
//         }

//         sc.close();
//     }
// }

// import java.util.Scanner;

// public class javacontrol {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();
//         for (int i = 6; i <= 9; i++) {
//             System.out.println(number + " * " + i + " = " + (number * i));
//         }
//          sc.close();
//     }
// }

