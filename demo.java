class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super("ur amt is out of ur bank acc");
    }
}
public class demo{
	public int balance = 10000;
    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient Balance! You tried to withdraw ₹" 
                                                 + amount + " but your balance is ₹" + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
            System.out.println("Remaining Balance: ₹" + balance);
        }
    }
public static void main(String[]args) {
		demo atm = new demo();

        try {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.print("Enter amount to withdraw: ");
            int amount = sc.nextInt();
            
            atm.withdraw(amount);

            sc.close();
        } 
        catch (InsufficientFundsException obj) {
            System.out.println(" Error: " + obj.getMessage());
        }
}
}
   
    

