import java.time.LocalDate;
import java.util.Scanner;

public class Account {
    public int accountNumber, balance;
    public double annualInterestRate = 0.2;
    public LocalDate dateCreated() {
        return java.time.LocalDate.now();
    }
    public void deposit() {
        System.out.print("Enter Deposit Amount: ");
        Scanner scanner = new Scanner(System.in);
        balance += scanner.nextInt();
        System.out.print("New Balance: " + balance + "\n");
    }
    public void withdraw() {
        System.out.print("Enter Withdraw Amount: ");
        Scanner scanner = new Scanner(System.in);
        balance -= scanner.nextInt();
        System.out.println("New Balance: " + balance);
    }
    public String toString() {
        return ("\nAccount Number: " + accountNumber + "\nBalance: " + balance + "\nDate Created: " + dateCreated() + "\nAnnual Interest Rate: " + annualInterestRate + "\n");
    }
}