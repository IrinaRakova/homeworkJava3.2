public class BmiService {
    public int calculate(double weightKg, double heightMeter) {
        double bmi;//индекс массы тела

        bmi = weightKg / (heightMeter * heightMeter);
        return (int) bmi;
    }
}
