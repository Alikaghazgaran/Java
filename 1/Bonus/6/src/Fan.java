public class Fan {
    public final int SLOW=1 , MEDIUM=2 , FAST=3;
    private int speed;
    private boolean on;
    private double radius;
    public String color;
    public void setSpeed (int s) {
        speed = s;
    }
    public void setOn (boolean o) {
        on = o;
    }
    public void setRadius (double r) {
        radius = r;
    }
    public void setColor (String c) {
        color = c;
    }
    public int getSpeed() {
        return speed;
    }
    public boolean getOn() {
        return on;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public Fan () {
        setSpeed(SLOW);
        setOn(false);
        setRadius(5);
        setColor("blue");
    }
    public String toString () {
        if (on==true)
            return ("Fan Speed: " + speed + "\nColor: " + color + "\nRadius: " + radius);
        else
            return ("Fan Color: " + color + "\nRadius: " + radius + "\nFan is Off!");
    }
}