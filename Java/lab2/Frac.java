public class Frac {
    private int[] coefficients;
    public Frac(int[] coefficients) {
        this.coefficients = coefficients;
    }
    public void setCoefficient(int index, int value) {
        if (index >= this.coefficients.length) {
            System.out.println("Error");
            return;
        }
        coefficients[index] = value;
    }
    public double evaluate() {
        double result = 0;
        for (int i = coefficients.length - 1; i >= 0; i--) {
            result = 1 / (coefficients[i] + result);
        }
        return result;
    }
}