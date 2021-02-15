public class BmiService {
    public double calculate(double weight, double growth) {

        double BMI = weight / (growth / 100 * growth / 100);

        return BMI;
    }
}
