public class main {
    public static void main(String[] args) {
        Fan f1 = new Fan();
        f1.setSpeed(3);
        f1.setRadius(10);
        f1.setColor("yellow");
        f1.setOn(true);
        Fan f2 = new Fan();
        f2.setSpeed(2);
        f2.setColor("blue");
        System.out.println("Fan 1\n" + f1.toString() + "\n\nFan 2\n" + f2.toString());
    }
}