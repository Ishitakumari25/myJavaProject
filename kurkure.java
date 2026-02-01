import java.util.Scanner;
public class kurkure {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int num =0, temp = 0, sum =0;
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        String numStr = Integer.toString(Math.abs(num));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0'; 
            sum += digits[i];
        }

        System.out.println("The sum of digits of " + num + " is: " + sum);
        sc.close();
    }



    }


