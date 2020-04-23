public class main {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint();
        p2.setX(10);
        p2.setY(30.5);
        System.out.println(MyPoint.distance(p1,p2));
    }
}