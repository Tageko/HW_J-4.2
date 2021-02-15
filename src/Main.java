public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();

        double BMI = service.calculate(58, 167);
        System.out.println(BMI);

        double BMI1 = service.calculate(64, 162);
        System.out.println(BMI1);

        double BMI2 = service.calculate(51, 169);
        System.out.println(BMI2);



    }
}
