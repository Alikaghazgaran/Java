import java.util.Scanner;

public class Checking extends Account {
    public int overdraftLimit = -1000;
    public void withdraw() {
        System.out.print("Enter Withdraw Amount: ");
        Scanner scanner = new Scanner(System.in);
        balance -= scanner.nextInt();
        if (balance<overdraftLimit)
            System.out.println("Over the overdraft limit!");
        else
            System.out.println("New Balance: " + balance);
    }
}