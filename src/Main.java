public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        //       int price = 10_000;
        //       int cena = 50;
        double index = service.calculate(50, 2);
        System.out.println(index);
    }
}
