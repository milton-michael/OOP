package mod1;
import java.util.Scanner;

public class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;

    BankAccount(int accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolder = name;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void displayDetails() {
        System.out.println("Account No: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        System.out.print("Enter account holder name: ");
        String name = sc.next();
        System.out.print("Enter initial balance: ");
        double bal = sc.nextDouble();

        BankAccount acc = new BankAccount(accNo, name, bal);

        System.out.print("Enter deposit amount: ");
        double dep = sc.nextDouble();
        acc.deposit(dep);

        System.out.println("Updated Account Details:");
        acc.displayDetails();
    }
    // Milton Michael
    // 16/8/25
}