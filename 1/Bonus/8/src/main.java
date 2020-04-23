import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        QuadraticEquation q = new QuadraticEquation();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a: ");
        String temp = scan.nextLine();
        int tmp = Integer.parseInt(temp);
        q.setA(tmp);
        System.out.print("Enter b: ");
        temp = scan.nextLine();
        tmp = Integer.parseInt(temp);
        q.setB(tmp);
        System.out.print("Enter c: ");
        temp = scan.nextLine();
        tmp = Integer.parseInt(temp);
        q.setC(tmp);
        if (q.getDiscriminant()>0)
            System.out.println("Root 1: " + q.getRoot1() + "\nRoot 2: " + q.getRoot2());
        else if (q.getDiscriminant()==0)
            System.out.println("Root: " + q.getRoot1());
        else
            System.out.println("The equation has no roots!");
    }
}