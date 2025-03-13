package Bai46;
public class RationalTester {
    public static void main(String[] args) {
        RationalNumber r1 = new RationalNumber(6, 8);
        RationalNumber r2 = new RationalNumber(1, 3);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        System.out.println("r1 equals r2: " + r1.equals(r2));
        System.out.println("r1 reciprocal: " + r1.reciprocal());
        System.out.println("r1 + r2: " + r1.add(r2));
        System.out.println("r1 - r2: " + r1.subtract(r2));
        System.out.println("r1 * r2: " + r1.multiply(r2));
        System.out.println("r1 / r2: " + r1.divide(r2));
    }
}