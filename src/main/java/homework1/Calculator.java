package homework1;

import java.util.Scanner;

/**
 * @author Artamonov Aleksandr
 */

public class Calculator {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double firstNum = console.nextDouble();
        System.out.print("Введите знак: ");
        String sign = console.next();
        System.out.print("Введите второе число: ");
        double secondNum = console.nextDouble();
        double result = 0;
        console.close();

        switch (sign) {
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            case "/":
                result = firstNum / secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            default:
                System.err.println("Не правильно введен арифметичиский знак");
                System.exit(0);
        }
        System.out.printf("%.4f", result);
    }
}
