public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 84.4; // вес в кг
        double height = 1.74; // рост в м
        int result = service.calculate(weight, height);
        System.out.println(result);

    }
}