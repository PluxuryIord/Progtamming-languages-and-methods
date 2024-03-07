public class Main {
    public static void main(String[] args) {
        int[] coeffs = new int[] {1, 2, 3};
        Frac frac1 = new Frac(coeffs);
        System.out.println(frac1.evaluate());
        frac1.setCoefficient(5, 4);
        frac1.setCoefficient(1, 4);
        System.out.println(frac1.evaluate());
    }
}
