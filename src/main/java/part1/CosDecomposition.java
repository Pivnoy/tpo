package part1;


public class CosDecomposition {

    public double customCos(double x) throws ArithmeticException{
        double result = 1D;
        double current = 1D;
        double previous = 0;
        double accuracy = 1e-4D;
        for (int i = 1; Math.abs(current - previous) > accuracy && i < 1000 ; i++) {
            previous = current;
            current = (current * (x * x * (- 1)))/ ( (2 * i) * (2 * i - 1) );
            result += current;
        }
        if (result > 1) return 1;
        if (result < -1) return -1;
        if (Double.isNaN(result) || Double.isInfinite(result)) {
            throw new ArithmeticException("Error input number");
        }
        return result;
    }

}
