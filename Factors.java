import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Factors of " + number + " are:");

        // Find and display factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
    

