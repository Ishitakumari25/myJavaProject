import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (6 to 9): ");
        int number = sc.nextInt();
        if (number < 6 || number > 9) {
            System.out.println("Please enter a number between 6 and 9.");
            return;
        }
        int[] multiplicationResult = new int[10];
        for (int i = 1; i <= 10; i++) {
            multiplicationResult[i - 1] = number * i;
        }
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 1]);
        }

        sc.close();
    }
}
    

