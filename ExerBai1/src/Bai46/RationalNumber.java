package Bai46;
public class RationalNumber {
    private int numerator;
    private int denominator;

    private int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }

    private void reduce() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    public RationalNumber(int numerator, int denominator) {
        if (denominator == 0) {
            denominator = 1;
        }
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public RationalNumber reciprocal() {
        return new RationalNumber(denominator, numerator);
    }

    public RationalNumber add(RationalNumber op2) {
        int num = numerator * op2.denominator + op2.numerator * denominator;
        int den = denominator * op2.denominator;
        return new RationalNumber(num, den);
    }

    public RationalNumber subtract(RationalNumber op2) {
        int num = numerator * op2.denominator - op2.numerator * denominator;
        int den = denominator * op2.denominator;
        return new RationalNumber(num, den);
    }

    public RationalNumber multiply(RationalNumber op2) {
        int num = numerator * op2.numerator;
        int den = denominator * op2.denominator;
        return new RationalNumber(num, den);
    }

    public RationalNumber divide(RationalNumber op2) {
        return multiply(op2.reciprocal());
    }

    public boolean equals(RationalNumber op2) {
        return numerator == op2.numerator && denominator == op2.denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}