import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Location l = new Location();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        int t1 = scan.nextInt();
        int t2 = scan.nextInt();
        l.row = t1;
        l.column = t2;
        System.out.print("Enter the array: ");
        double t;
        double a[][] = new double[l.row][l.column];
        for (int i=0; i<l.row; i++)
            for (int j=0; j<l.column; j++) {
                t = scan.nextDouble();
                a[i][j] = t;
            }
        Location.locateLargest(a);
        System.out.println("The location of the largest element is " + l.maxValue + " at (" + l.row + "," + l.column + ")");
    }
}