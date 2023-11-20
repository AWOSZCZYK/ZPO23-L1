package List2;

public class complexNumber extends vector2D {



    public double getModulus() {
        return Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
    }

    public double getArgument() {
        return Math.toRadians(Math.sin((y2-y1)-getModulus())); // siny = b/|z|
    }

    @Override
    public String toString() {
        return "complexNumber{" +
                "x1=" + x1 +
                ", x2=" + x2 +
                ", y1=" + y1 +
                ", y2=" + y2 +
                '}';
    }

    public String exponentialForm() {
        return "|" + getModulus() + "|" + "exp(i)" + getArgument() + ")";
    }

    public String rectangularForm() {
        return "complexNumber{" +
                "modulus=" + getModulus() +
                ", argument=" + getArgument() +
                '}';
    }

    /**Metoda sumująca dwie liczby zespolone
     * @return wynik dodawania liczb zesplonych
     */
    String addition() {
        double x = x1 + x2;
        double y = y1 + y2;
        return "z = " + x + " + " + y + "i";
    }

    /** Metoda odejmująca dwie liczby zespolone
     * @return wynik odejmowania liczb zesplonych
     */
    String subtraction() {
        double x = x2 - x1;
        double y = y2 - y1;
        return "z = " + x + " + " + y + "i";
    }

    /** Metoda mnożąca dwie liczby zespolone
     * @return wynik mnożenia liczb zesplonych
     */
    String multiplication() {
        double x = x2 * x1 + (y2 * y1)*(-1);
        double y = x2 * y1 + y2 * x1;
        return "z = " + x + " + " + y + "i";
    }

    /**
     * @return wynik dzielenia liczb zesplonych
     */
    String division() {
        double x = x2 * x1 + (y2 * y1) / (Math.pow(x2, 2) + Math.pow(y2, 2));
        double y = x2 * y1 + y2 * x1 * (-1) / (Math.pow(x2, 2) + Math.pow(y2, 2));
        return "z = " + x + " + " + y + "i";
    }

    /**
     * @param k
     * @return wynik potęgowania liczby zespolonej
     */
    String exponentiation(double k) {
        return "z = |" + getModulus() +"|^" + k + " * exp(i" + k + "φ)";
    }
}
