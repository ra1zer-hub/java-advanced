package homework4;

/**
 * @author Artamonov Aleksandr
 */

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(12, 0, "/");
        try {
            double result = calculator.getResult();
            System.out.printf("%.4f", result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
