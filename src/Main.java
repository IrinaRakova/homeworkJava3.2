public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightKg = 100;//вес, кг
        double heightMeter = 1.88;//рост, м
        int bmi = service.calculate(weightKg, heightMeter);
        System.out.println("Индекс массы тела: " + bmi);
    }
}