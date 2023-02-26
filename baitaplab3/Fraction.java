package baitaplab3;

public class Fraction {

    private int numerator;
    private int denominator;

    public String print() {
        return "Fraction";
    }

    public Fraction(int numerator, int denominator) {
        int f1 = this.numerator;
        int f2 = this.denominator;
        if (f2 == 0) {
            if (f1 != 0) {
                System.out.println("Lỗi!!!");
            } else {
                this.numerator = numerator;
                this.denominator = denominator;
            }
        }
    }

    public int getnumerator() {
        return numerator;
    }

    public void setnumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getdenominator() {
        return denominator;
    }

    public void setdenomirator(int denomirator) {
        this.denominator = denomirator;
    }

    public Fraction() {
        Fraction f = new Fraction();
    }

    public void reduce() {
        int c = this.numerator % this.denominator;
        while (c != 0) {
            this.numerator = this.denominator;
            this.denominator = c;
            c = this.numerator % this.denominator;
        }
        this.numerator /= this.denominator;
        this.denominator /= this.numerator;
    }

    public void add(Fraction f1, Fraction f2) {
        this.setnumerator(f1.getnumerator() * f2.getdenominator() + f1.getdenominator() * f2.getnumerator());
        this.setdenomirator(f1.getdenominator() * f2.getdenominator());
        this.reduce();
    }

    public void sub(Fraction f1, Fraction f2) {
        this.setnumerator(f1.getnumerator() * f2.getdenominator() - f2.getnumerator() * f1.getdenominator());
        this.setdenomirator(f1.getdenominator() * f2.getdenominator());
        this.reduce();
    }

    public void mul(Fraction f1, Fraction f2) {
        this.setnumerator(f1.getnumerator() * f2.getnumerator());
        this.setdenomirator(f1.getdenominator() * f2.getdenominator());
        this.reduce();
    }

    public void div(Fraction f1, Fraction f2) {
        this.setnumerator(f1.getnumerator() * f2.getdenominator());
        this.setdenomirator(f1.getdenominator() * f2.getnumerator());
        this.reduce();
    }
}
