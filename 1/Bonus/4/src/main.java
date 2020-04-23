public class main {
    public static void main(String[] args) {
        Rational r1 = new Rational();
        Rational r2 = new Rational();
        Rational.add(r1.numerator , r1.denominator , r2.numerator , r2.denominator);
        Rational.sub(r1.numerator , r1.denominator , r2.numerator , r2.denominator);
        Rational.mul(r1.numerator , r1.denominator , r2.numerator , r2.denominator);
        Rational.div(r1.numerator , r1.denominator , r2.numerator , r2.denominator);
    }
}