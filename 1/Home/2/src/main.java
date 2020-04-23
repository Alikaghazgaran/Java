import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Course programming = new Course();
        Course programmingWorkshop = new Course();
        Course math1 = new Course();
        Course physics1 = new Course();
        Course persian = new Course();
        Course islam = new Course();

        System.out.print("Enter Programming Score: ");
        String temp = scan.nextLine();
        programming.score = Float.parseFloat(temp);
        System.out.print("Enter Programming Units: ");
        temp = scan.nextLine();
        programming.units = Integer.parseInt(temp);
        programming.multiply();

        System.out.print("Enter Programming Workshop Score: ");
        temp = scan.nextLine();
        programmingWorkshop.score = Float.parseFloat(temp);
        System.out.print("Enter Programming Workshop Units: ");
        temp = scan.nextLine();
        programmingWorkshop.units = Integer.parseInt(temp);
        programmingWorkshop.multiply();

        System.out.print("Enter Math 1 Score: ");
        temp = scan.nextLine();
        math1.score = Float.parseFloat(temp);
        System.out.print("Enter Math 1 Units: ");
        temp = scan.nextLine();
        math1.units = Integer.parseInt(temp);
        math1.multiply();

        System.out.print("Enter Physics 1 Score: ");
        temp = scan.nextLine();
        physics1.score = Float.parseFloat(temp);
        System.out.print("Enter Physics 1 Units: ");
        temp = scan.nextLine();
        physics1.units = Integer.parseInt(temp);
        physics1.multiply();

        System.out.print("Enter Persian Score: ");
        temp = scan.nextLine();
        persian.score = Float.parseFloat(temp);
        System.out.print("Enter Persian Units: ");
        temp = scan.nextLine();
        persian.units = Integer.parseInt(temp);
        persian.multiply();

        System.out.print("Enter Islam Score: ");
        temp = scan.nextLine();
        islam.score = Float.parseFloat(temp);
        System.out.print("Enter Islam Units: ");
        temp = scan.nextLine();
        islam.units = Integer.parseInt(temp);
        islam.multiply();

        float scoreSum = programming.mul + programmingWorkshop.mul + math1.mul + physics1.mul + persian.mul + islam.mul;
        float unitSum = programming.units + programmingWorkshop.units + math1.units + physics1.units + persian.units + islam.units;
        float avg = scoreSum/unitSum;
        boolean mashrot = false;
        if (avg<=12)
            mashrot = true;
        System.out.println("Term Average: " + avg + "\nMashrot: " + mashrot);
    }
}
