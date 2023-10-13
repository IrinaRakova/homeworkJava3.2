public class BmiService {
    public int calculate(double weightKg, double heightMeter) {
        double bmi = weightKg / (heightMeter * heightMeter);
        return (int) bmi;
    }
}
