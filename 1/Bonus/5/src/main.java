import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        Scanner scan = new Scanner(System.in);
        t.print();
        while (true) {
            System.out.print("Enter Player X's x coordination: ");
            String temp = scan.nextLine();
            int x = Integer.parseInt(temp);
            System.out.print("Enter Player X's y coordination: ");
            temp = scan.nextLine();
            int y = Integer.parseInt(temp);
            t.move('X', x, y);
            t.print();
            t.win();
            System.out.print("Enter Player O's x coordination: ");
            temp = scan.nextLine();
            x = Integer.parseInt(temp);
            System.out.print("Enter Player O's y coordination: ");
            temp = scan.nextLine();
            y = Integer.parseInt(temp);
            t.move('O', x, y);
            t.print();
            t.win();
        }
    }
}