import java.util.Scanner;

public class Saving extends Account {
    public void withdraw() {
        System.out.print("Enter Withdraw Amount: ");
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        if (temp>balance)
            System.out.println("Over the balance!");
        else {
            balance -= temp;
            System.out.println("New Balance: " + balance);
        }
    }
}