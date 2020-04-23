import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Complex c1 = new Complex();
        Complex c2 = new Complex();

        System.out.print("1st Number\nReal: ");
        String temp = scan.nextLine();
        float tmp = Float.parseFloat(temp);
        c1.real = tmp;
        System.out.print("Imaginary: ");
        temp = scan.nextLine();
        tmp = Float.parseFloat(temp);
        c1.imaginary = tmp;

        System.out.print("2nd Number\nReal: ");
        temp = scan.nextLine();
        tmp = Float.parseFloat(temp);
        c2.real = tmp;
        System.out.print("Imaginary: ");
        temp = scan.nextLine();
        tmp = Float.parseFloat(temp);
        c2.imaginary = tmp;

        Complex.add(c1.real , c1.imaginary , c2.real , c2.imaginary);
        Complex.sub(c1.real , c1.imaginary , c2.real , c2.imaginary);
    }
}
