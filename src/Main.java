public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        float height = (float) 1.86; // Рост, м
        int weight = 69; // Вес, кг

        float index = service.calculate(weight, height);
        System.out.println("Индекс массы тела - " + index);

    }
}
