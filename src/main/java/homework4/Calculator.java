package homework4;

/**
 * @author Artamonov Aleksandr
 */

public class Calculator {
    private double firstNum;
    private double secondNum;
    private String sign;

    public Calculator(double firstNum, double secondNum, String sign) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.sign = sign;
    }

    public double getResult() throws Exception {
        double result;
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
                throw new Exception("Не правильно введен арифметичиский знак");
        }
        return result;
    }
}
