import java.lang.Math;

public class QuadraticEquation {
    private double a, b, c;
    public QuadraticEquation() {
        a = 1;
        b = 3;
        c = 1;
    }
    public void setA(double aa) {
        a = aa;
    }
    public void setB(double bb) {
        b = bb;
    }
    public void setC(double cc) {
        c = cc;
    }
    public double getDiscriminant() {
        return ((b*b)-(4*a*c));
    }
    public double getRoot1() {
        if (getDiscriminant()<0)
            return 0;
        else
            return ((-1*b)+(Math.sqrt(getDiscriminant())))/(2*a);
    }
    public double getRoot2() {
        if (getDiscriminant()<0)
            return 0;
        else
            return ((-1*b)-(Math.sqrt(getDiscriminant())))/(2*a);
    }
}