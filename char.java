import java.util.Scanner;

public class char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int letters = 0;
        int digits = 0;
        int specialChars = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isDigit(ch)) {
                digits++;
  
                continue;
            } else {
                specialChars++;
            }
        }


        System.out.println("Total letters: " + letters);
        System.out.println("Total digits: " + digits);
        System.out.println("Total special characters: " + specialChars);
    }
}
