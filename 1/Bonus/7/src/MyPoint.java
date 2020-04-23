public class MyPoint {
    public double x , y;
    public void setX(double xx) {
        x = xx;
    }
    public void setY(double yy) {
        y = yy;
    }
    public MyPoint () {
        x = 0;
        y = 0;
    }
    public MyPoint (double xx, double yy) {
        x = xx;
        y = yy;
    }
    public String distance (MyPoint p) {
        return ("(" + (p.x-x) + "," + (p.y-y) + ")");
    }
    public String distance (double xx, double yy) {
        return ("(" + (xx-x) + "," + (yy-y) + ")");
    }
    public static String distance (MyPoint a, MyPoint b) {
        return ("(" + (b.x-a.x) + "," + (b.y-a.y) + ")");
    }
}