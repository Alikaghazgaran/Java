import java.util.Scanner;

public class Rational {
    public int numerator=1 , denominator=1;
    public static int i , j;
    public static void reducer (int n , int d) {
        for (j=1 ; j<3 ; j++) {
            for (i = 2; i <= d; i++) {
                if (d%i == 0 && n%i == 0) {
                    d /= i;
                    n /= i;
                }
            }
        }
        if (n==0) {
            System.out.print(n);
        }
        else if (d==1) {
            System.out.print(n);
        }
        else if (d==0) {
            System.out.print("Not Possible!");
            System.exit(0);
        }
        else {
            System.out.print(n + "/" + d);
        }
    }
    public Rational () {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Numerator: ");
        String temp = scan.nextLine();
        int tmp = Integer.parseInt(temp);
        numerator = tmp;
        System.out.print("Enter Denominator: ");
        temp = scan.nextLine();
        tmp = Integer.parseInt(temp);
        denominator = tmp;
        reducer(numerator , denominator);
        System.out.println();
    }
    public static void add (int n1 , int d1 , int n2 , int d2) {
        if (d1==d2) {
            n1 += n2;
        }
        else {
            n1 *= d2;
            n2 *= d1;
            n1 += n2;
            d1 *= d2;
        }
        System.out.print("Summation: ");
        reducer(n1 , d1);
        System.out.println();
    }
    public static void sub (int n1 , int d1 , int n2 , int d2) {
        if (d1==d2) {
            n1 -= n2;
        }
        else {
            n1 *= d2;
            n2 *= d1;
            n1 -= n2;
            d1 *= d2;
        }
        System.out.print("Subtraction: ");
        reducer(n1 , d1);
        System.out.println();
    }
    public static void mul (int n1 , int d1 , int n2 , int d2) {
        n1 *= n2;
        d1 *= d2;
        System.out.print("Multiplication: ");
        reducer(n1 , d1);
        System.out.println();
    }
    public static void div (int n1 , int d1 , int n2 , int d2) {
        n1 *= d2;
        d1 *= n2;
        System.out.print("Division: ");
        reducer(n1 , d1);
        System.out.println();
    }
}