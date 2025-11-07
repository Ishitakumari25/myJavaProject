import java.util.Scanner;
class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}
public class a {
    static void validate(String user, String pass) throws InvalidCredentialsException {
        String validUser = "admin";
        String validPass = "1234";

        if (!user.equals(validUser) || !pass.equals(validPass)) {
            throw new InvalidCredentialsException("Invalid username or password!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter username: ");
            String username = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            try {
                validate(username, password);
                System.out.println("Login successful! Welcome, " + username + "!");
                break;
            } 
            catch (InvalidCredentialsException e) {
                System.out.println(e.getMessage());
                System.out.println("Please try again.\n");
            }
        }

        sc.close();
    }
}
