package homework4;

import homework4.operations.*;

/**
 * @author Artamonov Aleksandr
 */

public class Functional {

    public static void selectOperation(double firstNum, String sign, double secondNum) {
        Action action;
        double result = 0;
        switch (sign) {
            case "+":
                action = new Addition();
                result = action.performAnOperation(firstNum, secondNum);
                break;
            case "-":
                action = new Subtraction();
                result = action.performAnOperation(firstNum, secondNum);
                break;
            case "/":
                action = new Division();
                result = action.performAnOperation(firstNum, secondNum);
                break;
            case "*":
                action = new Multiplication();
                result = action.performAnOperation(firstNum, secondNum);
                break;
            default:
                System.err.println("Не правильно введен арифметичиский знак");
                System.exit(0);
        }
        System.out.printf("%.4f", result);
    }
}
