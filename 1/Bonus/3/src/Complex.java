public class Complex {
    public float real , imaginary;
    public static void add (float c1r , float c1i , float c2r , float c2i) {
        System.out.println("Summation: (" + (c1r+c2r) + ", " + (c1i+c2i) + ")");
    }
    public static void sub (float c1r , float c1i , float c2r , float c2i) {
        System.out.println("Subtraction: (" + (c1r-c2r) + ", " + (c1i-c2i) + ")");
    }
}