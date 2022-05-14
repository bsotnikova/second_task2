public class BmiService {
    public double calculate (double weight, double growth) {
        double b2 = 2;
        final double pow = Math.pow(growth, b2);
        double index = weight/pow;
        return index;

    }
}
