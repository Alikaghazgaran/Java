import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Course cou = new Course();
        cou.name[0] = "Advanced Programming";
            cou.unit[0] = 3;
            cou.pish[0] = "Basic Programming";
            cou.ham[0] = "Advanced Programming Workshop";
        cou.name[1] = "Advanced Programming Workshop";
            cou.unit[1] = 1;
            cou.pish[1] = "Basic Programming Workshop";
            cou.ham[1] = "Advanced Programming";
        cou.name[2] = "Physics 2";
            cou.unit[2] = 3;
            cou.pish[2] = "Math 1";
        cou.name[3] = "Math 2";
            cou.unit[3] = 3;
            cou.pish[3] = "Math 1";
        cou.name[4] = "General English";
            cou.unit[4] = 3;
            cou.pish[4] = "Pre English";
        cou.name[5] = "Islamic Revolution";
            cou.unit[5] = 2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Course Name: ");
        String tmp = scan.nextLine();
        for (int i=0 ; i<6 ; i++) {
            if (tmp.equals(cou.name[i])) {
                System.out.print("Units: " + cou.unit[i] + "\nPishniaz: " + cou.pish[i] + "\nHamniaz: " + cou.ham[i]);
                break;
            }
        }
    }
}