import java.util.*;

class Customer {
    private String name;
    private double balance;
    private Bank bank;

    public Customer(String name) {
        this.name = name;
        this.balance = 0.0;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(name + " deposited ₹" + amount + " to " + bank.getBankName());
    }

    public void viewBalance() {
        System.out.println(name + "'s Balance in " + bank.getBankName() + ": ₹" + balance);
    }

    public String getName() {
        return name;
    }
}

class Bank {
    private String bankName;
    private ArrayList<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        customers = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    public void openAccount(Customer c) {
        customers.add(c);
        c.setBank(this);
        System.out.println("Account opened for " + c.getName() + " in " + bankName);
    }

    public void showCustomers() {
        System.out.println("\nCustomers of " + bankName + ":");
        for (Customer c : customers) {
            System.out.println("- " + c.getName());
        }
    }
}

public class association {
    public static void main(String[] args) {
        Bank bank1 = new Bank("State Bank of India");
        Bank bank2 = new Bank("HDFC Bank");

        Customer c1 = new Customer("Ishita");
        Customer c2 = new Customer("Rahul");

        bank1.openAccount(c1);
        bank2.openAccount(c2);

        c1.deposit(5000);
        c2.deposit(8000);

        c1.viewBalance();
        c2.viewBalance();

        bank1.showCustomers();
        bank2.showCustomers();
    }
}

